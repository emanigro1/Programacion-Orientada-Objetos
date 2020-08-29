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

	@Override
	public String toString() {
		return "Numero [n=" + n + "]";
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
		return Double.parseDouble(convertirAString());
	}

	public double calcularPotencia(double exp) {
		return Math.pow(convertirADouble(), exp);
	}

	public String pasarBase2() {
		return Long.toBinaryString(Long.parseLong(convertirAString()));
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
		int combinatoria;
		int factorial1 = calcularFactorial();
		int factorial2 = new Numero(n1).calcularFactorial();		
		if (this.n > 0 && n1 > 0 && this.n > n1) {
			int factorial3 = new Numero(this.n - n1).calcularFactorial();
			combinatoria = (factorial1 / (factorial2 * factorial3));
			return combinatoria;
		}
		return 1;
	}
}
