package numero;

public class Numero {

	private int n;

	public Numero(int n) {
		this.setN(n);
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int sumar(int n1) {
		return n + n1;
	}

	public int multiplicar(int n1) {
		return n * n1;
	}

	public boolean esPar() {
		return (n % 2 == 0);
	}

	public boolean esPrimo() {
		int contador = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				contador++;
		}
		return (contador == 2);
	}

	public String convertirAString() {
		return String.valueOf(n);
	}

	public double convertirADouble() {
		return Double.parseDouble(String.valueOf(n));
	}

	public double calcularPotencia(double exp) {
		return Math.pow(Double.parseDouble(String.valueOf(n)), exp);
	}

	public String pasarBase2() {
		return Long.toBinaryString(Long.parseLong(String.valueOf(n)));
	}

	public int calcularFactorial() {
		int factorial = 1;
		int contador = 2;
		while (n > 0 && contador != n + 1) {
			factorial = factorial * contador;
			contador++;
		}
		return factorial;
	}



	public int calcularCombinatorio(int n1) {
		int combinatoria = 0, resultado = 0, factorial1 = 1, factorial2 = 1, factorial3 = 1;

		if (this.n > n1) {
		return	combinatoria = 1;
		}
		if (this.n > 0 && n1 > 0) {
			for (int i = 1; i <= this.n; i++) {
				factorial1 = factorial1 * i;
			}
			for (int j = 1; j <= n1; j++) {
				factorial2 = factorial2 * j;
			}
			resultado = this.n - n1;
			for (int k = 1; k <= resultado; k++) {
				factorial3 = factorial3 * k;
			}
			combinatoria = (factorial1 / (factorial2 * factorial3));
		}
		return combinatoria;
	}

}
