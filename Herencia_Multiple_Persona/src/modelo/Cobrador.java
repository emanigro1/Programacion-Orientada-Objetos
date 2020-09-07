package modelo;

import java.time.LocalDate;

public class Cobrador extends Empleado implements IPorComision {

	private Cliente[] cartera;
	float comisionFija;

	public Cobrador(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo,
			float sueldoMensual, Cliente cartera[], float comisionFija) {
		super(nombre, apellido, dni, fechaNacimiento, legajo);
		this.setCartera(cartera);
		this.setComisionFija(comisionFija);
	}

	public Cliente[] getCartera() {
		return cartera;
	}

	public float getLimiteCredito() {
		return comisionFija;
	}

	public void setCartera(Cliente[] cartera) {
		this.cartera = cartera;
	}

	public void setComisionFija(float comisionFija) {
		this.comisionFija = comisionFija;
	}

	public float calcularSueldo() {
		return calcularComision()*30;
	}

	public float calcularComision() {
		return comisionFija*cartera.length;
	}
	
	public  String hablar() {
		return "Soy un cobrador";
	};
}
