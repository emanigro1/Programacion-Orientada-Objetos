package modelo;

import java.time.LocalDate;

public abstract class Persona {
	protected String nombre;
	protected String apellido;
	protected long dni;
	protected LocalDate fechaNacimiento;

	public Persona(String nombre, String apellido, long dni, LocalDate fechaNacimiento) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDni(dni);
		this.setFechaNacimiento(fechaNacimiento);
	}

	// Agregar Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int calcularEdad(LocalDate fechaAhora) {

		int año = fechaAhora.getYear() - fechaNacimiento.getYear();
		if (fechaAhora.getMonthValue() < fechaNacimiento.getMonthValue()
				|| fechaAhora.getMonthValue() == fechaNacimiento.getMonthValue()
						&& fechaAhora.getDayOfMonth() < fechaNacimiento.getDayOfMonth()) {
			return --año;
		}
		return año;
	}

}
