package supermercado;

import com.sun.org.apache.bcel.internal.generic.LSTORE;

public class Supermercado {

	AdmCliente admCliente;
	AdmProducto admProducto;
	AdmCarrito admCarrito;
	
	//CONSTRUCTOR
	public Supermercado(AdmProducto admProducto,AdmCliente admCliente,AdmCarrito admCarrito) {
		this.admProducto=admProducto;
		this.admCliente=admCliente;
		this.admCarrito=admCarrito;

	}

	public AdmCliente getAdmCliente() {
		return admCliente;
	}

	public void setAdmCliente(AdmCliente admCliente) {
		this.admCliente = admCliente;
	}

	public AdmProducto getAdmProducto() {
		return admProducto;
	}

	public void setAdmProducto(AdmProducto admProducto) {
		this.admProducto = admProducto;
	}

	public AdmCarrito getAdmCarrito() {
		return admCarrito;
	}

	public void setAdmCarrito(AdmCarrito admCarrito) {
		this.admCarrito = admCarrito;
	}
	


}
