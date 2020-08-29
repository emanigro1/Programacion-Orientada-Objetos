package consultorio;


public class Medico {
	// atributos
	private String nombre;
	private String apellido;
	private String especialidad;
	private Paciente[] pacientesFrecuentes;

	// constructor
	public Medico(String nombre, String apellido, String especialidad, Paciente[] pacientesFrecuentes) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEspecialidad(especialidad);
		this.setPacientesFrecuentes(pacientesFrecuentes);
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

	public Paciente[] getPaciente() {
		return pacientesFrecuentes;
	}

	// setters
	public void setNombre(String nombre) {
		this.setNombre(nombre);
		;
	}

	public void setApellido(String apellido) {
		this.setApellido(apellido);
	}

	public void setEspecialidad(String especialidad) {
		this.setEspecialidad(especialidad);
	}

	public void setPacientesFrecuentes(Paciente[] pacientesFrecuentes) {
		this.setPacientesFrecuentes(pacientesFrecuentes);
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

	public double traerPromedioPeso() {
		double promedio = 0;
		for (int i = 0; i < pacientesFrecuentes.length; i++) {
			promedio = promedio + pacientesFrecuentes[i].getPeso();
		}
		return promedio / pacientesFrecuentes.length;
	}

	public Paciente traerPacienteMayorEstatura() {
		double mayorEstatura = pacientesFrecuentes[0].getEstatura();
		int paciente = 0;
		for (int i = 1; i < pacientesFrecuentes.length; i++) {
			if (pacientesFrecuentes[i].getEstatura() > mayorEstatura) {
				mayorEstatura = pacientesFrecuentes[i].getEstatura();
				paciente = i;
			}
		}
		return pacientesFrecuentes[paciente];
	}

	public Paciente traerMenorIMC() {
		double menorIMC = calcularIMC(pacientesFrecuentes[0]);
		int paciente = 0;
		for (int i = 1; i < pacientesFrecuentes.length; i++) {
			if (calcularIMC(pacientesFrecuentes[i]) < menorIMC) {
				menorIMC = calcularIMC(pacientesFrecuentes[i]);
				paciente = i;
			}
		}
		return pacientesFrecuentes[paciente];
	}
}