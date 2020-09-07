package modelo;

import java.time.LocalDate;

public class Vendedor extends Empleado implements IPorComision {

	private Cliente[] cartera;
	private float comisionPorcentual;

	public Vendedor(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo,
			float sueldoMensual, Cliente[] cartera, float comisionPorcentual) {
		super(nombre, apellido, dni, fechaNacimiento, legajo);
		this.setCartera(cartera);
		this.setComisionPorcentual(comisionPorcentual);
	}

	public Cliente[] getCartera() {
		return cartera;
	}

	public float getComisionPorcentual() {
		return comisionPorcentual;
	}

	public void setCartera(Cliente[] cartera) {
		this.cartera = cartera;
	}

	public void setComisionPorcentual(float comisionPorcentual) {
		this.comisionPorcentual = comisionPorcentual;
	}

	public float calcularSueldo() {
		return comisionPorcentual*30;
	}

	public float calcularComision() {
		return comisionPorcentual*cartera.length;
	}
	
	public  String hablar() {
		return "Soy un vendedor";
	};

}
