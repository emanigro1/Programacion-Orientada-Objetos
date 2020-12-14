package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class SMS extends Mensaje {

	private int numeroOrigen;
	private int numeroDestino;
	/*
	 * Se tiene que lanzar una excepción en caso de que no tenga una longitud de 10
	 * números. Para saber la longitud en dígitos de un int se puede usar el
	 * siguiente código: String.valueOf(numeroEntero).length()
	 */
	public String texto;
	public boolean visto;
	public OperadorMovil operadorOrigen;
	public OperadorMovil operadorDestino;

	public SMS(LocalDate fechaEnvio, LocalTime horaEnvio, int numeroOrigen, int numeroDestino, String texto,
			OperadorMovil operadorOrigen, OperadorMovil operadorDestino)throws Exception {
		super(fechaEnvio, horaEnvio);
		this.numeroOrigen = numeroOrigen;
		setNumeroDestino(numeroDestino);
		this.texto = texto;
		this.visto = false;
		this.operadorOrigen = operadorOrigen;
		this.operadorDestino = operadorDestino;
	}

	protected int getNumeroOrigen() {
		return numeroOrigen;
	}

	protected void setNumeroOrigen(int numeroOrigen) {
		this.numeroOrigen = numeroOrigen;
	}

	protected int getNumeroDestino() {
		return numeroDestino;
	}

	protected void setNumeroDestino(int numeroDestino) throws Exception {
		if (String.valueOf(numeroDestino).length() != 10) {
			throw new Exception("No tiene longitud de 10");
		}
		this.numeroDestino = numeroDestino;
	}

	protected String getTexto() {
		return texto;
	}

	protected void setTexto(String texto) {
		this.texto = texto;
	}

	protected boolean isVisto() {
		return visto;
	}

	protected void setVisto(boolean visto) {
		this.visto = visto;
	}

	protected OperadorMovil getOperadorOrigen() {
		return operadorOrigen;
	}

	protected void setOperadorOrigen(OperadorMovil operadorOrigen) {
		this.operadorOrigen = operadorOrigen;
	}

	protected OperadorMovil getOperadorDestino() {
		return operadorDestino;
	}

	protected void setOperadorDestino(OperadorMovil operadorDestino) {
		this.operadorDestino = operadorDestino;
	}
	

	@Override
	public String toString() {
		return "SMS [numeroOrigen=" + numeroOrigen + ", numeroDestino=" + numeroDestino + ", texto=" + texto
				+ ", visto=" + visto + ", operadorOrigen=" + operadorOrigen + ", operadorDestino=" + operadorDestino
				+ ", idMensaje=" + idMensaje + ", fechaEnvio=" + fechaEnvio + ", horaEnvio=" + horaEnvio + "]";
	}


	
	public boolean equals(String operador) {
		boolean encontrado=false;
		if(operadorOrigen.getCompaniaMovil().equals(operador)) {
			encontrado=true;
		}
		
		return encontrado;
	}

	public void cambiarDeEstado(boolean estadoNuevo) {
		setVisto(estadoNuevo);
	}
}
