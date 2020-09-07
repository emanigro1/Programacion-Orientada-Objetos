package modelo;

import java.time.LocalDate;

public abstract class Empleado extends Persona {

	protected  long legajo;


	public Empleado(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo) {
		super(nombre, apellido, dni, fechaNacimiento);
		this.setLegajo(legajo);
	}

	// Agregar Getters y Setters

	public long getLegajo() {
		return legajo;
	}

	public void setLegajo(long legajo) {
		this.legajo = legajo;
	}

	public abstract float calcularSueldo();
}
