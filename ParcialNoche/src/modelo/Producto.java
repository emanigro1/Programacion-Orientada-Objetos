package modelo;

public class Producto extends Mercancia {
	public String producto;
	public double precioProducto;
	public double porcentajeDescuento;
	public boolean esDescuentoEn2daUnidad;

	public Producto(String codMercancia, String producto, double precioProducto, double porcentajeDescuento,
			boolean esDescuentoEn2daUnidad) throws Exception {
		super(codMercancia);
		this.producto = producto;
		this.precioProducto = precioProducto;
		this.porcentajeDescuento = porcentajeDescuento;
		this.esDescuentoEn2daUnidad = esDescuentoEn2daUnidad;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public boolean isEsDescuentoEn2daUnidad() {
		return esDescuentoEn2daUnidad;
	}

	public void setEsDescuentoEn2daUnidad(boolean esDescuentoEn2daUnidad) {
		this.esDescuentoEn2daUnidad = esDescuentoEn2daUnidad;
	}

	@Override
	public String toString() {
		return "Producto [producto=" + producto + ", precioProducto=" + precioProducto + ", porcentajeDescuento="
				+ porcentajeDescuento + ", esDescuentoEn2daUnidad=" + esDescuentoEn2daUnidad + ", codMercancia="
				+ codMercancia + "]";
	}

	public double calcularPrecioFinal() {
		double descuento = 0;
		if (esDescuentoEn2daUnidad) {
			descuento = precioProducto * 2 * porcentajeDescuento / 2 / 100;
		}
		return precioProducto - descuento;
	}
}
