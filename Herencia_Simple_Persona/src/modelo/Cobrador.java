package modelo;

import java.time.LocalDate;

public class Cobrador extends Empleado implements ISocio {

	private Cliente cartera;
	float limiteCredito;

	public Cobrador(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo,
			float sueldoMensual) {
		super(nombre, apellido, dni, fechaNacimiento, legajo, sueldoMensual);
		this.setCartera(cartera);
		this.setLimiteCredito(limiteCredito);
	}

	public Cliente getCartera() {
		return cartera;
	}

	public float getLimiteCredito() {
		return limiteCredito;
	}

	public void setCartera(Cliente cartera) {
		this.cartera = cartera;
	}

	public void setLimiteCredito(float limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public float calcularSueldo(int diasAusente) {
		return getSueldoMensual() - diasAusente * 1000;
	}

	public String pagarCuota() {
		return "Estoy cobrando la cuota";
	}
}
