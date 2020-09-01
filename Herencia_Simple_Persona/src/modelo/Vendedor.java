package modelo;

import java.time.LocalDate;

public class Vendedor extends Empleado implements ISocio {

	private Cliente cartera;
	private float comisionPorcentual;

	public Vendedor(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo,
			float sueldoMensual) {
		super(nombre, apellido, dni, fechaNacimiento, legajo, sueldoMensual);
		this.setCartera(cartera);
		this.setComisionPorcentual(comisionPorcentual);
	}

	public Cliente getCartera() {
		return cartera;
	}

	public float getComisionPorcentual() {
		return comisionPorcentual;
	}

	public void setCartera(Cliente cartera) {
		this.cartera = cartera;
	}

	public void setComisionPorcentual(float comisionPorcentual) {
		this.comisionPorcentual = comisionPorcentual;
	}

	public float calcularSueldo(int diasAusente) {
		return getSueldoMensual() - diasAusente * 1000;
	}

	public String pagarCuota() {
		return "Estoy pagando la cuota";
	}

}
