package test;

import java.util.List;

import datos.Cliente;
import negocio.ClienteABM;

public class TestTraerTodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteABM abm = new ClienteABM();
		List<Cliente> clientes = abm.traer();
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}

}
