package bidimensional;

import java.util.Arrays;

public class Bidimensional {

	private double[][] matriz;

	public Bidimensional(double[][] array) {
		this.setArray(array);
	}

	public double[][] getArray() {
		return matriz;
	}

	public void setArray(double[][] array) {
		this.matriz = array;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bidimensional other = (Bidimensional) obj;
		if (!Arrays.deepEquals(matriz, other.matriz))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return Arrays.deepToString(matriz);
	}

	public double[][] sumar(double[][] matrizSumar) {
		double[][] matrizDouble = new double[matrizSumar.length][matrizSumar[0].length];
		for (int i = 0; i < matrizSumar.length; i++) {
			for (int j = 0; j < matrizSumar[0].length; j++) {
				matrizDouble[i][j] = matriz[i][j] + matrizSumar[i][j];
			}
		}
		return matrizDouble;
	}

	public double[][] restar(double[][] matrizSumar) {
		double[][] matrizDouble = new double[matrizSumar.length][matrizSumar[0].length];
		for (int i = 0; i < matrizSumar.length; i++) {
			for (int j = 0; j < matrizSumar[0].length; j++) {
				matrizDouble[i][j] = matriz[i][j] - matrizSumar[i][j];
			}
		}
		return matrizDouble;
	}

	public double[][] calcularTranspuesta() {
		double[][] matrizDouble = new double[matriz.length][matriz[0].length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matrizDouble[j][i] = matriz[i][j];
			}
		}
		return matrizDouble;
	}

	public double[][] multiplicar(double numero) {
		double[][] matrizDouble = new double[matriz.length][matriz[0].length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matrizDouble[i][j] = matriz[i][j] * numero;
			}
		}
		return matrizDouble;
	}

	public double[][] multiplicar(double[][] matrizMultiplicar) {
		double[][] matrizDouble = new double[matriz.length][matriz[0].length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matrizDouble[i][j] = matriz[i][j] * matrizMultiplicar[i][j];
			}
		}
		return matrizDouble;
	}
}