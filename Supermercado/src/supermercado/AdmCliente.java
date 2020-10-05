package supermercado;

import java.util.ArrayList;

public class AdmCliente {
	ArrayList<Cliente> lstClientes;

	public AdmCliente() {
		this.lstClientes = new ArrayList<Cliente>();
	}

	public ArrayList<Cliente> getLstCliente() {
		return lstClientes;
	}

	public void setLstCliente(ArrayList<Cliente> lstCliente) {
		this.lstClientes = lstCliente;
	}

	public boolean agregarCliente(String cliente, int dni, String direccion) {

		return lstClientes.add(new Cliente(cliente, dni, direccion));
	}

	public Cliente traerCliente(int id) {
		int i = 0;
		Cliente cliente=null;

		boolean encontrado = false;
		while (i < lstClientes.size() && encontrado == false) {
			if (lstClientes.get(i).equals(id)) {
				encontrado = true;
				cliente=lstClientes.get(i);
			}
			i++;
		}
		return cliente;
	}
	
	public Cliente traerCliente(long dni) {
		int i = 0;
		Cliente cliente=null;

		boolean encontrado = false;
		while (i < lstClientes.size() && encontrado == false) {
			if (lstClientes.get(i).equals(dni)) {
				encontrado = true;
				cliente=lstClientes.get(i);
			}
			i++;
		}
		return cliente;
	}
	
	public boolean eliminarCliente(int id) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < lstClientes.size() && encontrado == false) {
			if (lstClientes.get(i).equals(id)) {
				lstClientes.remove(i);
				encontrado = true;
			}i++;
		}
		return encontrado;
	}
	
	
	
}
