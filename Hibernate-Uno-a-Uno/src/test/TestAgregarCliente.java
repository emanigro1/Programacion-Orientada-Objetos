package test;

import java.time.LocalDate;

import negocio.ClienteABM;
import negocio.ContactoABM;

public class TestAgregarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String apellido = "Andrada";
		String nombre = "NOriaia";
		int documento = 1111991;
		LocalDate fechaDeNacimiento = LocalDate.now();

		ClienteABM abmCliente = new ClienteABM();
		ContactoABM abmContacto = new ContactoABM();

		try {
			int ultimoIdCliente = abmCliente.agregar(apellido, nombre, documento, fechaDeNacimiento, null);
			System.out.println(abmCliente.traer(documento));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
