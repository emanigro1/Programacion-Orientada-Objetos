package modelo;

public class OperadorMovil {
	private int codigoMovil;
	private String companiaMovil;
	public OperadorMovil(int codigoMovil, String companiaMovil) {

		this.codigoMovil = codigoMovil;
		this.companiaMovil = companiaMovil;
	}
	protected int getCodigoMovil() {
		return codigoMovil;
	}
	protected void setCodigoMovil(int codigoMovil) {
		this.codigoMovil = codigoMovil;
	}
	protected String getCompaniaMovil() {
		return companiaMovil;
	}
	protected void setCompaniaMovil(String companiaMovil) {
		this.companiaMovil = companiaMovil;
	}
	@Override
	public String toString() {
		return "OperadorMovil [codigoMovil=" + codigoMovil + ", companiaMovil=" + companiaMovil + "]";
	}
	
}
