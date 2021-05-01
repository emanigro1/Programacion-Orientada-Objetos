package test;

import negocio.ClienteABM;

import java.util.List;

import datos.Cliente;

public class TestTraerTodosLosClientes {

	public static void main(String[] args) {

		ClienteABM abm = new ClienteABM();
		List<Cliente> clientes = abm.traer();
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}

}
