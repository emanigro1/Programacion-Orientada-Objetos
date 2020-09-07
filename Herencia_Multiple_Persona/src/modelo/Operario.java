package modelo;

import java.time.LocalDate;

public class Operario extends Empleado implements IPorPresentismo {

	private float valorHora;
	private int horasTrabajadas;
	private int cantDiasAusentes;


	public Operario(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo,
			float sueldoMensual) {
		super(nombre, apellido, dni, fechaNacimiento, legajo);
		this.setValorHora(valorHora);
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public float calcularSueldo() {
		return valorHora*horasTrabajadas*30-cantDiasAusentes;
	}

	public int diasAusente() {
		return cantDiasAusentes;
	}
	
	public  String hablar() {
		return "Soy un operario";
	};

}
