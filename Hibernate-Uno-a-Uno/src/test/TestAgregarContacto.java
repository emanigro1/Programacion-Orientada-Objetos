package test;

import datos.Cliente;
import negocio.ClienteABM;
import negocio.ContactoABM;

public class TestAgregarContacto {
	public static void main(String[] args) {
		ClienteABM abmCliente = new ClienteABM();
		ContactoABM abmContacto = new ContactoABM();
		
		long idCliente =15;
		Cliente cliente = abmCliente.traer(idCliente);
		
		abmContacto.agregar("hhhhh@unla.edu.ar", "66666333", "8888888877", cliente);
		System.out.println(abmCliente.traer(idCliente));
	}
}