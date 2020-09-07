package modelo;

import java.time.LocalDate;

public class Administrativo extends Empleado implements IPorPresentismo {

	private float sueldoMensual;
	private int cantDiasAusentes;

	public Administrativo(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo,
			float sueldoMensual) {
		super(nombre, apellido, dni, fechaNacimiento, legajo );
		this.setSueldoMensual(sueldoMensual);
	
	}

	public float getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(float sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}
	
	public int diasAusente() {
		return cantDiasAusentes;
	}

	public float calcularSueldo() {
		return sueldoMensual-diasAusente()*(sueldoMensual/30);
	}

	public  String hablar() {
		return "Soy un administrativo";
	};
}
