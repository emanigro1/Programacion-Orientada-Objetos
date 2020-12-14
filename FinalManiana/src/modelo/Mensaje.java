package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Mensaje {
	protected int idMensaje; // Identificador único autonumérico, se tiene que calcular de forma automática
								// cada vezque se agrega un elemento a lista de mensajes
	protected LocalDate fechaEnvio;
	protected LocalTime horaEnvio;

	protected Mensaje(LocalDate fechaEnvio, LocalTime horaEnvio) throws Exception {
		this.fechaEnvio = fechaEnvio;
		this.horaEnvio = horaEnvio;

	}

	protected int getIdMensaje() {
		return idMensaje;
	}

	protected void setIdMensaje(int id) {
		this.idMensaje = id;
	}

	protected LocalDate getFechaEnvio() {
		return fechaEnvio;
	}

	protected void setFechaEnvio(LocalDate fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	protected LocalTime getHoraEnvio() {
		return horaEnvio;
	}

	protected void setHoraEnvio(LocalTime horaEnvio) {
		this.horaEnvio = horaEnvio;
	}

	@Override
	public String toString() {
		return "Mensaje [idMensaje=" + idMensaje + ", fechaEnvio=" + fechaEnvio + ", horaEnvio=" + horaEnvio + "]";
	}

	public abstract void cambiarDeEstado(boolean estadoNuevo);

}
