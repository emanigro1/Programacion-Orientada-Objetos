package modelo;

import java.util.ArrayList;

public class Sistema {

	ArrayList<Mercancia> lstMercancia;

	public Sistema() {

		this.lstMercancia = new ArrayList<Mercancia>();
	}

	public ArrayList<Mercancia> getLstMercancia() {
		return lstMercancia;
	}

	public void setLstMercancia(ArrayList<Mercancia> lstMercancia) {
		this.lstMercancia = lstMercancia;
	}

	public Mercancia traerMercancia(String codMercancia) {
		Mercancia mercancia = null;
		boolean encontrado = false;
		int i = 0;
		while (i < lstMercancia.size() && !encontrado) {
			if (lstMercancia.get(i).equals(codMercancia)) {
				encontrado = true;
				mercancia = lstMercancia.get(i);

			}
			i++;
		}
		return mercancia;
	}

	public ArrayList<Mercancia> traerMercancia(boolean enOferta) {
		ArrayList<Mercancia> listaMercancia = new ArrayList<Mercancia>();
		for (Mercancia mercancia : lstMercancia) {
			if (mercancia instanceof Producto) {
				if (((Producto) mercancia).isEsDescuentoEn2daUnidad()) {
					listaMercancia.add(mercancia);
				}
			} else {
				if (((Servicio) mercancia).isEnPromocion()) {
					listaMercancia.add(mercancia);
				}
			}
		}
		return listaMercancia;
	}

	public boolean agregarProducto(String codMercancia, String producto, double precioProducto,
			double porcentajeDescuento, boolean esDescuentoEn2daUnidad) throws Exception {
		if (traerMercancia(codMercancia) != null) {
			throw new Exception("Este codigo ya existe");
		}
		return lstMercancia
				.add(new Producto(codMercancia, producto, precioProducto, porcentajeDescuento, esDescuentoEn2daUnidad));
	}

	public boolean agregarServicio(String codMercancia, String servicio, double presupuesto, double porcentajeDescuento,
			boolean enPromocion) throws Exception {
		if (traerMercancia(codMercancia) != null) {
			throw new Exception("Este codigo ya existe");
		}
		return lstMercancia.add(new Servicio(codMercancia, servicio, presupuesto, porcentajeDescuento, enPromocion));
	}
}
