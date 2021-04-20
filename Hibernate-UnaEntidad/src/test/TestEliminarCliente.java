package test;

import datos.Cliente;
import negocio.ClienteABM;

public class TestEliminarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteABM abm = new ClienteABM();
		long id = 1;
		System.out.println("Cliente a Eliminar --> " + abm.traer(id));
		abm.eliminar(id);

	}

}
