package modelo;

public class Auto extends Vehiculo {

	private String puertas;

	public Auto(String marca, String modelo, double precio, String puertas) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}

	public String getPuertas() {
		return puertas;
	}

	public void setPuertas(String puertas) {
		this.puertas = puertas;
	}

}
