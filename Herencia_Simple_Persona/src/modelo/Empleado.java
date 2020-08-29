package modelo;

import java.time.LocalDate;

public class Empleado extends Persona {

	private long legajo;
	private float sueldoMensual;

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

	public String hablar() {
		return "Soy un Empleado";
	}

	public float calcularSueldo(int diasAusente) {
		float sueldo=30000;		
		return sueldo-(diasAusente*1000);
	}
}
