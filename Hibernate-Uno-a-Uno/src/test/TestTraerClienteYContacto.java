package test;

import datos.Cliente;
import negocio.ClienteABM;
import negocio.ContactoABM;

public class TestTraerClienteYContacto {
	public static void main(String[] args) {
		ClienteABM abmCliente = new ClienteABM();

		long idCliente = 6;
		Cliente cliente = abmCliente.traer(idCliente);
		
		System.out.println("\ntraer Cliente y contacto\n" + cliente + "\n" + cliente.getContacto());
	}
}