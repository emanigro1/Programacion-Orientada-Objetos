package supermercado;

public class Cliente {
	private int idCliente;
	private String cliente;
	private int dni;
	private String direccion;
	private static int idAutomaticaCliente = 0;

	// CONSTRUCTOR
	public Cliente(String cliente, int dni, String direccion) {
		this.idCliente=++idAutomaticaCliente;
		this.cliente = cliente;
		this.dni = dni;
		this.direccion = direccion;
		
	}

	// GETTERS Y SETTERS
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCiente) {
		this.idCliente = idCiente;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	// TOSTRING Y EQUALS
	public boolean equals(String cliente) {
		if (this.cliente == cliente) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equals(int id) {
		boolean encontrado = false;
		if (this.idCliente == id) {
			encontrado = true;
		}
		return encontrado;
	}

	public boolean equals(long  dni) {
		boolean encontrado = false;
		if (this.dni == dni) {
			encontrado = true;
		}
		return encontrado;
	}


	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", cliente=" + cliente + ", dni=" + dni + ", direccion=" + direccion
				+ "]";
	}

}
