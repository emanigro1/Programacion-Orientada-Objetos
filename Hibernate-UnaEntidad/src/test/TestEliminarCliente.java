package test;

import negocio.ClienteABM;

public class TestEliminarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteABM abm =new ClienteABM();
		try {
			abm.eliminar(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
