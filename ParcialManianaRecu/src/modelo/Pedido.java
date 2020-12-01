package modelo;

import java.time.LocalDate;

public abstract class Pedido {
	
	protected int idPedido;
	protected LocalDate fechaCreacion;
	protected double montoBase;
	static int idAutomaticaPedido = 0;
	
	protected Pedido(LocalDate fechaCreacion, double montoBase) {


		this.fechaCreacion = fechaCreacion;
		this.montoBase = montoBase;
		this.idPedido = ++idAutomaticaPedido;
	}

	public int getIdPedido() {
		return idPedido;
	}



	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public double getMontoBase() {
		return montoBase;
	}

	public void setMontoBase(double montoBase) {
		this.montoBase = montoBase;
	}
	

	public boolean equals(int obj) {
		boolean encontrado=false;
		if(idPedido==obj) {
			encontrado=true;
		}
		return encontrado;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", fechaCreacion=" + fechaCreacion + ", montoBase=" + montoBase + "]";
	}

	public abstract double calcularPrecioFinal();

}
