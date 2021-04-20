package test;

import java.time.LocalDate;
import negocio.ClienteABM;

public class TestAgregarCliente {
	public static void main(String[] args) {
		String apellido = "Silvester";
		String nombre = "Pepe";
		int documento = 35936323;
// tu fecha de nacimiento
		LocalDate fechaDeNacimiento = LocalDate.now();
		ClienteABM abm = new ClienteABM();
		long ultimoIdCliente = abm.agregar(apellido, nombre, documento, fechaDeNacimiento);
	}
}
