package modelo;

import java.time.LocalDate;

public class Administrativo extends Empleado implements ICocinero {

	private float sueldoMensual;

	public Administrativo(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo,
			float sueldoMensual) {
		super(nombre, apellido, dni, fechaNacimiento, legajo, sueldoMensual);
		this.setSueldoMensual(sueldoMensual);
	}

	public float getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(float sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}

	public float calcularSueldo(int diasAusente) {
		return getSueldoMensual() - diasAusente * 1000;
	}

	public String cocinar() {
		return "Estoy cocinando como administrativo";
	}

}
