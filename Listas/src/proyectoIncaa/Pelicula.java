package proyectoIncaa;

public class Pelicula {

	private int idPelicula;
	private String nombre;
	private Genero genero;

	public Pelicula(int idPelicula, String nombre, Genero genero) {
		this.setIdPelicula(idPelicula);
		this.setPelicula(nombre);
		this.setGenero(genero);
	}

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setPelicula(String nombre) {
		this.nombre = nombre;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "[ idPelicula= " + idPelicula + ", nombre= " + nombre + ", genero= " + genero + " ]";
	}
	
	// COMPARAR IGUALDAD CON OBJETO
	public boolean equals(Pelicula pelicula) {
		if (idPelicula == pelicula.getIdPelicula() || genero == pelicula.getGenero()
				|| nombre == pelicula.getNombre()) {
			return true;
		}
		return false;
	}
	public boolean equals(int id) {
		if (this.idPelicula == id) {
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
	public boolean equals(Genero genero) {
		if (this.genero == genero) {
			return true;
		}
		return false;
	}
}
