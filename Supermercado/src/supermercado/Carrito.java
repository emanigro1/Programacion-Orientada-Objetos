package supermercado;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	private int idCarrito;
	private LocalDate fecha;
	private LocalTime hora;
	private Cliente cliente;
	static int idAutomaticaCarrito = 0;
	List<ItemCarrito> lstItem;

	// CONSTRUCTOR
	public Carrito(Cliente cliente, LocalDate fecha, LocalTime hora) {

		lstItem = new ArrayList<ItemCarrito>();
		this.setCliente(cliente);
		this.setFecha(fecha);
		this.setHora(hora);
		this.idCarrito = ++idAutomaticaCarrito;
	}

	public int getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora2) {
		this.hora = hora2;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Carrito [idCarrito=" + idCarrito + ", fecha=" + fecha + ", hora=" + hora + ", cliente=" + cliente
				+ ", lstItem=" + lstItem + "]";
	}

	public boolean equals(int id) {
		boolean encontrado = false;
		if (this.idCarrito == id) {
			encontrado = true;
		}
		return encontrado;
	}

	// traer producto carrito
	public ItemCarrito traerItemCarrito(Producto producto) {
		int i = 0;
		boolean encontrado = false;

		while (i < lstItem.size() && encontrado == false) {

			if (lstItem.get(i).equals(producto)) {

			}
			i++;
		}
		return lstItem.get(i);
	}

	// AGREGACION Y ELIMINACION
	public boolean agregarItem(Producto productoNuevo, int cantidad) {

		return lstItem.add(new ItemCarrito(productoNuevo, cantidad));
	}

	
	public boolean eliminarItem(int id) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < lstItem.size() && encontrado == false) {
			if (lstItem.get(i).equals(id)) {
				lstItem.remove(i);
				encontrado = true;
			}i++;
		}
		return encontrado;
	}
	
	public float calcularTotal() {
		int i = 0;
		float total = 0;

		while (i < lstItem.size()) {
		 {
				total += lstItem.get(i).calcularSubTotal();
			}i++;
		}
		return total;
	}

}
