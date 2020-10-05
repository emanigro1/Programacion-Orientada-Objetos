package proyectoIncaa;

public class Genero {
	private int idGenero;
	private String nombre;

	public Genero(int idGenero, String nombre) {

		this.setNombre(nombre);
		this.setIdGenero(idGenero);

	}

	public int getIdGenero() {

		return idGenero;
	}

	public void setIdGenero(int id) {
		this.idGenero = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "[ idGenero= " + idGenero + ", nombre= " + nombre + " ]";
	}

	public boolean equals(Genero genero) {
		if (idGenero == genero.getIdGenero() || nombre == genero.getNombre()) {
			return true;
		}
		return false;
	}

	public boolean equals(int id) {
		if (this.getIdGenero() == id) {
			return true;
		}
		return false;
	}

	public boolean equals(String nombre) {
		if (this.nombre == nombre) {
			return true;
		}
		return false;
	}

}
