package consultorio;

public class Medico {
	// atributos
	private String nombre;
	private String apellido;
	private String especialidad;

	// constructor
	public Medico(String nombre, String apellido, String especialidad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
	}

	// getters
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getEspecialidades() {
		return especialidad;
	}

	// setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	// metodo nombre completo
	public String nombreCompleto() {
		String nombreApellido;
		nombreApellido = nombre + " " + apellido;
		return nombreApellido;
	}

	// metodo calcular IMC
	public float calcularIMC(Paciente paciente) {
		float imc;
		imc = paciente.getPeso() / (paciente.getEstatura() * paciente.getEstatura());

		return imc;
	}
}