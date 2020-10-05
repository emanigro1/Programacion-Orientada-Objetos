package supermercado;

public class Producto {
	private int idProducto;
	private String producto;
	private float precio;
	static int idAutomaticaProducto = 0;

	// CONSTRUCTOR
	public Producto(String nombre, float precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.idProducto = ++idAutomaticaProducto;

	}

	// GETTERS Y SETTERS
	public int getIdProducto() {
		return idProducto;
	}

	public String getProducto() {
		return producto;
	}

	public void setNombre(String producto) {
		this.producto = producto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean equals(int id) {
		boolean encontrado = false;
		if (this.idProducto == id) {
			encontrado = true;
		}
		return encontrado;
	}

	// TOSTRING Y EQUALS
	@Override
	public String toString() {
		return "[ nombre=" + producto + ", precio=" + precio + ", ID=" + idProducto + " ]";
	}

	public boolean equals(String producto) {
		return this.producto == producto;

	}

}
