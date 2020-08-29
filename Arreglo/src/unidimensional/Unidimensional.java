package unidimensional;

import java.util.Arrays;

public class Unidimensional {

	private int[] array;

	public Unidimensional(int[] array) {
		this.setArray(array);
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}


	@Override
	public String toString() {
		return Arrays.toString(array);
	}

	public int traerElMenor() {
		int minimo = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minimo)
				minimo = array[i];
		}
		return minimo;
	}

	public int traerElMaximo() {
		int maximo = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maximo)
				maximo = array[i];
		}
		return maximo;
	}

	public double calcularPromedio() {
		double promedio = 0;
		double[] arrayDouble = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			arrayDouble[i] = array[i];
			promedio = promedio + arrayDouble[i];
		}
		return promedio / array.length;

	}

	public int[] ordenarAscendente() {
		int aux;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
		return array;
	}

	public int[] ordenarDescendente() {
		int aux;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
		return array;
	}

	public double traerFrecuencia(int numero) {
		double cantidad = 0;
		for (int i = 0; i < array.length; i++) {
			if (numero == array[i]) {
				cantidad++;
			}
		}
		return cantidad / array.length;
	}

	public int traerModa() {
		int[] moda = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			moda[i] = 0;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					moda[i]++;
				}
			}
		}
		int posicion = moda[0];
		for (int i = 1; i < moda.length; i++) {
			if (moda[i] > posicion)
				posicion = array[i];
		}
		return array[posicion];
	}
}
