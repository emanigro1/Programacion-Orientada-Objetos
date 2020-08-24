package modelo;

public class Circulo {

	private Punto origen;
	private double radio;

	public Circulo(Punto origen, double radio) {
		this.origen = origen;
		this.radio = radio;
	}

	public Punto getOrigen() {
		return origen;
	}

	public void setOrigen(Punto origen) {
		this.origen = origen;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public boolean equals(Circulo c) {
		return ((origen == c.origen) && (radio == c.radio));
	}

	@Override
	public String toString() {
		return "Circulo [origen=" + origen + ", radio=" + radio + "]";
	}

	public void mover(double desplazamientoX, double desplazamientoY) {
		Punto nuevoOrigen = new Punto(origen.getX(), origen.getY());
		origen = nuevoOrigen;
		origen.mover(desplazamientoX, desplazamientoY);
	}

	public double calcularPerimetro() {
		return 2*Math.PI*radio;
	}
	
	public double calcularArea() {			
		return Math.PI*Math.pow(radio,2);
	}
	
	public double calcularDistancia(Circulo c) {
		return c.radio*2;
	}
}
