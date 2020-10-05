package supermercado;

import com.sun.org.apache.bcel.internal.generic.LSTORE;

public class ItemCarrito {
	private int id;
	private Producto producto;
	private int cantidad;

	// CONSTRUCTOR
	public ItemCarrito(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
		setIdItem(id);
	}

	// GETTERS Y SETTERS
	public int getIdItem() {
		return id;
	}

	public void setIdItem(int idItem) {
		this.id = idItem;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	// TOSTRING Y EQUALS
	@Override
	public String toString() {
		return "ItemCarrito [idItem=" + id + ", producto=" + producto + ", cantidad=" + cantidad + "]";
	}

	public boolean equals(Producto producto) {
		boolean encontrado = false;
		if (producto.getIdProducto() == this.id) {
			encontrado = true;
		}
		return encontrado;
	}

	
	public boolean equals(int id) {
		boolean encontrado = false;
		if (producto.equals(id)) {
			encontrado = true;
		}
		return encontrado;
	}

	public float calcularSubTotal() {

		return cantidad * producto.getPrecio();
	}

}
