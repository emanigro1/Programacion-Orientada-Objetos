package modelo;

import java.time.LocalDate;

public class PedidoPapelMensual extends Pedido{

	private LocalDate fechaEntrega;
	private int cantidadResmas;
	
	public PedidoPapelMensual(LocalDate fechaCreacion, double montoBase, LocalDate fechaEntrega, int cantidadResmas) throws Exception {
		super(fechaCreacion, montoBase);
		this.fechaEntrega = fechaEntrega;
		setCantidadResmas(cantidadResmas);
	}
	
	
public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}


	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}


	public int getCantidadResmas() {
		return cantidadResmas;
	}


	public void setCantidadResmas(int cantidadResmas) throws Exception {
		if (cantidadResmas == 0) {
			throw new Exception("No se puede crear, resma es 0");
		}
		this.cantidadResmas = cantidadResmas;
	}




@Override
	public String toString() {
		return "PedidoPapelMensual [fechaEntrega=" + fechaEntrega + ", cantidadResmas=" + cantidadResmas + ", idPedido="
				+ idPedido + ", fechaCreacion=" + fechaCreacion + ", montoBase=" + montoBase + "]";
	}


public double calcularPrecioFinal(){
		
		return this.getMontoBase()*cantidadResmas;
	}
}
