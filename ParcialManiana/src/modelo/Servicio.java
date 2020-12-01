package modelo;

import java.time.LocalDate;

public abstract class Servicio {
	protected String codServicio;
	protected double porcentajeDescuento;
	protected boolean enPromocion;
	
	
	
	protected Servicio(String codServicio, double porcentajeDescuento, boolean enPromocion) throws Exception {
	
		setCodServicio(codServicio);
		this.porcentajeDescuento = porcentajeDescuento;
		this.enPromocion = enPromocion;
	}



	protected String getCodServicio() {
		return codServicio;
	}



	protected void setCodServicio(String codServicio)throws Exception {
		
		if(codServicio.length()!=6) {
			throw new Exception("El codigo debe tener 6 digitos");
		}
		this.codServicio=codServicio;
	}



	protected double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}



	protected void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}



	protected boolean isEnPromocion() {
		return enPromocion;
	}



	protected void setEnPromocion(boolean enPromocion) {
		this.enPromocion = enPromocion;
	}


	public boolean equals(String codigo) {
		boolean encontrado=false;
		if (this.codServicio.equals(codigo)) {
			encontrado= true;
		}
	
		return encontrado;
	}



	@Override
	public String toString() {
		return "Servicio [codServicio=" + codServicio + ", porcentajeDescuento=" + porcentajeDescuento
				+ ", enPromocion=" + enPromocion + "]";
	}



	public abstract double calcularPrecioFinal(LocalDate dia);

}
