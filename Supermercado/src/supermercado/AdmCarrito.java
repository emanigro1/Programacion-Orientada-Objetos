package supermercado;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class AdmCarrito {
	ArrayList<Carrito> lstCarrito;

	public AdmCarrito() {
		this.lstCarrito = new ArrayList<Carrito>();
	}

	public ArrayList<Carrito> getLstCarrito() {
		return lstCarrito;
	}

	public void setLstCarrito(ArrayList<Carrito> lstCarrito) {
		this.lstCarrito = lstCarrito;
	}

	public boolean agregarCarrito(Cliente cliente, LocalDate fecha, LocalTime hora) {
		return lstCarrito.add(new Carrito(cliente, fecha, hora));
	}

	public Carrito traerCarrito(int id) {
		int i = 0;
		Carrito carrito = null;
		boolean encontrado = false;

		while (i < lstCarrito.size() && encontrado == false) {
			if (lstCarrito.get(i).equals(id)) {
				encontrado = true;
				carrito = lstCarrito.get(i);
			}
			i++;
		}

		return carrito;
	}

	public boolean eliminarCarrito(int id) {
		int i = 0;
		boolean encontrado = false;

		while (i < lstCarrito.size() && encontrado == false) {
			System.out.println(encontrado);
			if (lstCarrito.get(i).equals(id)) {
				lstCarrito.remove(i);
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}

	public float calcularTotal(int dniCliente) {
		int i = 0, j = 0;
		float total = 0;
		boolean encontrado = false;

		while (i < lstCarrito.size() && encontrado == false) {
			if (lstCarrito.get(i).getCliente().equals(dniCliente)) {
				while (j < lstCarrito.get(i).lstItem.size()) {
					total += lstCarrito.get(i).lstItem.get(j).calcularSubTotal();
					j++;
				}
				encontrado = true;
				i++;
			}
		}
		return total;
	}

}