package modelo;

public abstract class Mercancia {
	protected String codMercancia;

	public Mercancia(String codMercancia) throws Exception {

		setCodMercancia(codMercancia);
	}

	protected String getCodMercancia() {
		return codMercancia;
	}

	protected void setCodMercancia(String codMercancia) throws Exception {
		if (codMercancia.length() != 7) {
			throw new Exception("El codigo debe tener 7 digitos");
		}
		this.codMercancia = codMercancia;
	}

	@Override
	public String toString() {
		return "Mercancia [codMercancia=" + codMercancia + "]";
	}

	public boolean equals(String obj) {
		boolean encontrado = false;
		if (codMercancia.equals(obj)) {
			encontrado = true;
		}
		return encontrado;
	}

	public abstract double calcularPrecioFinal();

}
