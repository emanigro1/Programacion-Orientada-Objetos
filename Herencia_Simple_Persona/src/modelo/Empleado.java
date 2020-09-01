package modelo;

import java.time.LocalDate;

public abstract class Empleado extends Persona {

	protected  long legajo;
	protected  float sueldoMensual;

	public Empleado(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo,
			float sueldoMensual) {
		super(nombre, apellido, dni, fechaNacimiento);
		this.setLegajo(legajo);
		this.setFechaNacimiento(fechaNacimiento);
	}

	// Agregar Getters y Setters

	public long getLegajo() {
		return legajo;
	}

	public void setLegajo(long legajo) {
		this.legajo = legajo;
	}

	public float getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(float sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}

	public abstract float calcularSueldo(int diasAusente);
}
