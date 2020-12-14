package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Email extends Mensaje {

	private String origen;
	private String destino; /*
							 * Se tiene que lanzar una excepción en caso de que no contenga un arroba. Para
							 * saber si unString contiene dentro un char se puede usar el siguiente código:
							 * unString.indexOf(unChar) devuelve la posición del char en el String o un -1
							 * en caso de no encontrarlo
							 */
	private String asunto;
	private String cuerpo;
	private boolean recibido;

	public Email(LocalDate fechaEnvio, LocalTime horaEnvio, String origen, String destino, String asunto,
			String cuerpo)throws Exception {
		super( fechaEnvio, horaEnvio);
		this.origen = origen;
		setDestino(destino);
		this.asunto = asunto;
		this.cuerpo = cuerpo;
		this.recibido = false;
	}

	protected String getOrigen() {
		return origen;
	}

	protected void setOrigen(String origen) {
		this.origen = origen;
	}

	protected String getDestino() {
		return destino;
	}

	protected void setDestino(String destino) throws Exception {
		
		if (destino.indexOf('@') == -1) {

			throw new Exception("No existe @");
		}
		this.destino = destino;
	}

	protected String getAsunto() {
		return asunto;
	}

	protected void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	protected String getCuerpo() {
		return cuerpo;
	}

	protected void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	protected boolean isRecibido() {
		return recibido;
	}

	protected void setRecibido(boolean recibido) {
		this.recibido = recibido;
	}
	



	@Override
	public String toString() {
		return "Email [origen=" + origen + ", destino=" + destino + ", asunto=" + asunto + ", cuerpo=" + cuerpo
				+ ", recibido=" + recibido + ", idMensaje=" + idMensaje + ", fechaEnvio=" + fechaEnvio + ", horaEnvio="
				+ horaEnvio + "]";
	}

	public void cambiarDeEstado(boolean estadoNuevo) {
		setRecibido(estadoNuevo);
	}

}
