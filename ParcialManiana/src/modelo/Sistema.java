package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {

	ArrayList<Servicio> lstServicio;

	public Sistema() {

		this.lstServicio = new ArrayList<Servicio>();
	}

	public ArrayList<Servicio> getLstServicio() {
		return lstServicio;
	}

	public void setLstServicio(ArrayList<Servicio> lstServicio) {
		this.lstServicio = lstServicio;
	}

	public Servicio traerServicio(String codServicio) {
		boolean encontrado = false;
		Servicio nuevo = null;
		int i = 0;
		while (i < lstServicio.size() && !encontrado) {
			if (lstServicio.get(i).equals(codServicio)) {
				encontrado = true;
				nuevo = lstServicio.get(i);
			}
			i++;
		}
		return nuevo;
	}

	public ArrayList<Servicio> traerServicio(boolean enPromocion) {

		ArrayList<Servicio> serviciosPromocion = new ArrayList<Servicio>();
		for (Servicio servicio : lstServicio) {
			if (servicio.enPromocion) {
				serviciosPromocion.add(servicio);
			}
		}
		return serviciosPromocion;
	}

	public ArrayList<Servicio> traerServicio(boolean enPromocion, LocalDate dia) {
		ArrayList<Servicio> serviciosTotales = new ArrayList<Servicio>();
		ArrayList<Servicio> serviciosPromocionDia = new ArrayList<Servicio>();
		serviciosPromocionDia.addAll(traerServicio(enPromocion));

		for (Servicio servicio : serviciosPromocionDia) {
			if (servicio instanceof Gastronomia) {
				if (dia.getDayOfWeek().getValue() == ((Gastronomia) servicio).getDiaSemDesc()) {
					serviciosTotales.add(servicio);
				}
			}
		}
		return serviciosTotales;
	}

	public boolean agregarGastronomia(String codServicio, double porcentajeDescuento, boolean enPromocion,
			String gastronomia, double precio, int diaSemDesc) throws Exception {
		if (traerServicio(codServicio) != null) {
			throw new Exception("Codigo ya existe");
		}
		return lstServicio
				.add(new Gastronomia(codServicio, porcentajeDescuento, enPromocion, gastronomia, precio, diaSemDesc));
	}

	public boolean agregarHospedaje(String codServicio, double porcentajeDescuento, boolean enPromocion,
			String hospedaje, double precioPorNoche) throws Exception {
		if (traerServicio(codServicio) != null) {
			throw new Exception("Codigo ya existe");
		}
		return lstServicio.add(new Hospedaje(codServicio, porcentajeDescuento, enPromocion, hospedaje, precioPorNoche));
	}

}
