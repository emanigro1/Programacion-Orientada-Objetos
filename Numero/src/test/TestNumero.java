package test;

import numero.*;

public class TestNumero {

	public static void main(String[] args) {
		Numero n = new Numero(2);

		System.out.println("Suma: " + n.sumar(10));
		System.out.println("Multiplicacion: " + n.multiplicar(3));
		System.out.println("Es par ? " + n.esPar());
		System.out.println("Es primo ? " + n.esPrimo());
		System.out.println("Potencia: " + n.calcularPotencia(5));
		System.out.println("Factorial: " + n.calcularFactorial());
		System.out.println("Combinatoria: " + n.calcularCombinatorio(6));

	}

}
