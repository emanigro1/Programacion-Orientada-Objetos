package modelo;

import java.time.LocalDate;

public class Teletrabajo extends Asistencia {

	public String motivo;
	public int tareasRealizadas; // No pueden realizarse más de 8 tareas diarias, lanza excepción.

	public Teletrabajo(String legajo, LocalDate fecha, String motivo, int tareasRealizadas) throws Exception {
		super(legajo, fecha);
		this.motivo = motivo;
		setTareasRealizadas(tareasRealizadas);
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public int getTareasRealizadas() {
		return tareasRealizadas;
	}

	public void setTareasRealizadas(int tareasRealizadas) throws Exception {
		if(tareasRealizadas>8) {			
			throw new Exception("No puedes realizar mas de 8 tareas diarias");
		}
		this.tareasRealizadas = tareasRealizadas;
	}

	@Override
	public String toString() {
		return "Teletrabajo [motivo=" + motivo + ", tareasRealizadas=" + tareasRealizadas + ", legajo=" + legajo
				+ ", fecha=" + fecha + "]";
	}

	public double calcularHorasTrabajadas() {
	return tareasRealizadas*1.5;
	}
}
