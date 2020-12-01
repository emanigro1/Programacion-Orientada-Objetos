package modelo;

import java.time.LocalDate;

public abstract class Asistencia {

	static int idAuto = 0; // Es un identificador único. Se tiene que calcular automáticamente, arrancando
							// en 1.
	protected String legajo;
	protected LocalDate fecha;
	protected int idAsistencia;

	public Asistencia(String legajo, LocalDate fecha) {
		this.legajo = legajo;
		this.fecha = fecha;
		this.idAsistencia = ++idAuto;
	}



	public int getIdAsistencia() {
		return idAsistencia;
	}



	public void setIdAsistencia(int idAsistencia) {
		this.idAsistencia = idAsistencia;
	}



	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Asistencia [legajo=" + legajo + ", fecha=" + fecha + "]";
	}

	public boolean equals(String legajo) {
		boolean encontrado = false;
		if (this.legajo.equals(legajo))
			;
		{
			encontrado = true;
		}
		return encontrado;
	}

	public boolean equals(LocalDate fecha) {
		boolean encontrado = false;
		if (this.fecha.isEqual(fecha))
			;
		{
			encontrado = true;
		}
		return encontrado;
	}

	public abstract double calcularHorasTrabajadas();

}
