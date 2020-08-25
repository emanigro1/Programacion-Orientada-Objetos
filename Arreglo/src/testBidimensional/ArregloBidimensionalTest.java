package testBidimensional;

import java.util.Arrays;

import bidimensional.*;;

public class ArregloBidimensionalTest {

	public static void main(String[] args) {

		double[][] matriz = { { 7, 5, 2, 1, 6 }, { 7, 8, 2, 1, 6 }, { 8, 1, 2, 3, 7 }, { 7, 8, 2, 1, 4 },
				{ 8, 4, 3, 9, 5 } };
		double[][] matrizAuxiliar = { { 8, 4, 3, 9, 5 }, { 8, 1, 2, 3, 7 }, { 7, 8, 2, 1, 4 }, { 7, 8, 2, 1, 6 },
				{ 7, 5, 2, 1, 6 } };

		Bidimensional numerosBidimensionales = new Bidimensional(matriz);
		Bidimensional numerosAuxiliares = new Bidimensional(matrizAuxiliar);

		System.out.println("Vector : " + numerosBidimensionales.toString());
		System.out.println("Vector auxiliar : " + numerosAuxiliares.toString());

		System.out.println("Suma del vector: " + Arrays.deepToString(numerosBidimensionales.sumar(matrizAuxiliar)));
		System.out.println("Resta del vector: " + Arrays.deepToString(numerosBidimensionales.restar(matrizAuxiliar)));
		System.out.println("Tranpuesto: "+ Arrays.deepToString(numerosBidimensionales.calcularTranspuesta()));
		System.out.println("Multiplicar: "+ Arrays.deepToString(numerosBidimensionales.multiplicar(2)));
		System.out.println("Multiplicar con vector: "+ Arrays.deepToString(numerosBidimensionales.multiplicar(matrizAuxiliar)));
	}

}
