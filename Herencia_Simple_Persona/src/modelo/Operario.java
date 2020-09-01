package modelo;

import java.time.LocalDate;

public class Operario extends Empleado implements ICocinero {

	private float valorHora;

	public Operario(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo,
			float sueldoMensual) {
		super(nombre, apellido, dni, fechaNacimiento, legajo, sueldoMensual);
		this.setSueldoMensual(sueldoMensual);
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public float calcularSueldo(int diasAusente) {
		return getSueldoMensual() - diasAusente * 1000;
	}

	public String cocinar() {
		return "Estoy cocinando como operario";
	}

}
