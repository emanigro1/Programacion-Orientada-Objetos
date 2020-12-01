package modelo;

import java.time.LocalDate;

public class PedidoElectronico extends Pedido {

	private String motivo;
	private double porcentajeExtra;
	public PedidoElectronico(LocalDate fechaCreacion, double montoBase, String motivo, double porcentajeExtra) throws Exception {
		super(fechaCreacion, montoBase);
		setMotivo(motivo);
		this.porcentajeExtra = porcentajeExtra;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) throws Exception {
		
		if (motivo.length() == 0) {

			throw new Exception("No se puede crear, no hay motivo");
		}
		this.motivo = motivo;
	}
	public double getPorcentajeExtra() {
		return porcentajeExtra;
	}
	public void setPorcentajeExtra(double porcentajeExtra) {
		this.porcentajeExtra = porcentajeExtra;
	}
	
	
	@Override
	public String toString() {
		return "PedidoElectronico [motivo=" + motivo + ", porcentajeExtra=" + porcentajeExtra + ", idPedido=" + idPedido
				+ ", fechaCreacion=" + fechaCreacion + ", montoBase=" + montoBase + "]";
	}
	public double calcularPrecioFinal(){
		double extraSumado=0;
		extraSumado=this.getMontoBase()*porcentajeExtra/100;
		extraSumado+=this.getMontoBase();
		
		return extraSumado;
	}
	

	public boolean equals(String obj) {
		boolean encontrado=false;
		if(motivo.equals(obj)) {
			encontrado=true;
		}
		
		return encontrado;
	}
	
	
}
