package supermercado;

import java.util.ArrayList;

import com.sun.javafx.beans.IDProperty;

public class AdmProducto {

	ArrayList<Producto> lstProductos;

	public AdmProducto() {
		this.lstProductos = new ArrayList<Producto>();
	}

	public ArrayList<Producto> getLstProductos() {
		return lstProductos;
	}

	public void setLstProductos(ArrayList<Producto> lstProductos) {
		this.lstProductos = lstProductos;
	}

	public boolean agregarProducto(String nombre, float precio) {
		return lstProductos.add(new Producto(nombre, precio));
	}

	public Producto traerProducto(int id) {
		int i = 0;
		Producto producto = null;
		boolean encontrado = false;

		while (i < lstProductos.size() && encontrado == false) {

			if (lstProductos.get(i).equals(id)) {
				encontrado = true;
				producto = lstProductos.get(i);
			}
			i++;
		}
		return producto;
	}

	public boolean eliminarProducto(int id) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < lstProductos.size() && encontrado == false) {
			if (lstProductos.get(i).equals(id)) {
				lstProductos.remove(i);
				encontrado = true;
			}i++;
		}
		return encontrado;
	}

}
