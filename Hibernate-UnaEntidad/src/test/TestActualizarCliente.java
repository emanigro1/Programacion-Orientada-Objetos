package test;

import datos.Cliente;
import negocio.ClienteABM;

public class TestActualizarCliente {
	public static void main(String[] args) {
		ClienteABM abm = new ClienteABM();
		long id =4;
// traer el obj a modificar
		Cliente c = abm.traer(id);
		System.out.println("Cliente a Modificar -->" + c);
// modificar por set los atributos
		c.setDni(35000004);
		try {
			abm.modificar(c);
			System.out.println("Cliente modificado");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // update del objeto
		int dni = 35000004;
		Cliente cModif = abm.traer(dni);
		System.out.println("Cliente Modificado -->" + cModif);
	}
}