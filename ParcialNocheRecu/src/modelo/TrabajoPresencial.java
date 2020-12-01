package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class TrabajoPresencial extends Asistencia {

	private LocalTime horaDesde;
	private LocalTime horaHasta;

	public TrabajoPresencial(String legajo, LocalDate fecha, LocalTime horaDesde, LocalTime horaHasta) {
		super(legajo, fecha);
		this.horaDesde = horaDesde;
		this.horaHasta = horaHasta;
	}

	public LocalTime getHoraDesde() {
		return horaDesde;
	}

	public void setHoraDesde(LocalTime horaDesde) {
		this.horaDesde = horaDesde;
	}

	public LocalTime getHoraHasta() {
		return horaHasta;
	}

	public void setHoraHasta(LocalTime horaHasta) {
		this.horaHasta = horaHasta;
	}

	@Override
	public String toString() {
		return "TrabajoPresencial [horaDesde=" + horaDesde + ", horaHasta=" + horaHasta + ", legajo=" + legajo
				+ ", fecha=" + fecha + "]";
	}

	public double calcularHorasTrabajadas() {
		int horasTrabajadas = (this.horaHasta.getHour() - this.horaDesde.getHour() * 60 + this.horaHasta.getMinute()
				- this.horaDesde.getMinute()) / 60;

		return horasTrabajadas;
	}
}
