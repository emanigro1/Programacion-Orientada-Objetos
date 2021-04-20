package modelo;

import java.util.ArrayList;

public class Concesionaria {
	ArrayList<Vehiculo> lstVehiculos;

	public Concesionaria() {

		this.lstVehiculos = new ArrayList<Vehiculo>();
	}

	public ArrayList<Vehiculo> getLstVehiculos() {
		return lstVehiculos;
	}

	public void setLstVehiculos(ArrayList<Vehiculo> lstVehiculos) {
		this.lstVehiculos = lstVehiculos;
	}

	public void mostrarVehiculos() {
		for (Vehiculo vehiculo : lstVehiculos) {
			if (vehiculo instanceof Auto)
				System.out.println("Marca: " + vehiculo.getMarca() + " // Modelo: " + vehiculo.getModelo()
						+ " // Puertas: " + ((Auto) vehiculo).getPuertas() + "  //  Precio: " + vehiculo.getPrecio());
			else {
				System.out.println(
						"Marca: " + vehiculo.getMarca() + " // Modelo: " + vehiculo.getModelo() + " // Cilindrada: "
								+ ((Moto) vehiculo).getCilindrada() + "  //  Precio: " + vehiculo.getPrecio());
			}
		}
	}

	public void masCaro() {
		Vehiculo vehiculoMasCaro = lstVehiculos.get(0);
		for (Vehiculo vehiculo : lstVehiculos) {
			if (vehiculo.getPrecio() > vehiculoMasCaro.getPrecio()) {
				vehiculoMasCaro = vehiculo;
			}
		}
		System.out.println("Vehículo más caro: " + vehiculoMasCaro.getMarca() + " " + vehiculoMasCaro.getModelo());
	}

	public void masBarato() {
		Vehiculo vehiculoMasBarato = lstVehiculos.get(0);
		for (Vehiculo vehiculo : lstVehiculos) {
			if (vehiculo.getPrecio() < vehiculoMasBarato.getPrecio()) {
				vehiculoMasBarato = vehiculo;
			}
		}
		System.out
				.println("Vehículo más barato: " + vehiculoMasBarato.getMarca() + " " + vehiculoMasBarato.getModelo());
	}

	public void buscarModeloPorLetra(char letra) {
		int i = 0;
		boolean encontrado = false;
		Vehiculo vehiculoEncontrado = null;
		while (i < lstVehiculos.size() && !encontrado) {
			if (lstVehiculos.get(i).getModelo().toLowerCase().indexOf(Character.toLowerCase(letra)) > -1) {
				encontrado = true;
				vehiculoEncontrado = lstVehiculos.get(i);
			}
			i++;
		}
		if (encontrado) {
			System.out.println(
					"Vehículo que contiene en el modelo la letra '" + letra + "' : " + vehiculoEncontrado.getMarca()
							+ " " + vehiculoEncontrado.getModelo() + " " + vehiculoEncontrado.getPrecio());
		} else {
			System.out.println("No encontrado");
		}
	}

	public void ordenadosPrecio() {
		ArrayList<Vehiculo> lstVehiculosOrdenados = lstVehiculos;
		Vehiculo vehiculoAux = null;
		for (int i = 1; i < lstVehiculosOrdenados.size(); i++) {
			for (int j = 0; j < i; j++) {
				if (lstVehiculosOrdenados.get(i).getPrecio() > lstVehiculosOrdenados.get(j).getPrecio()) {
					vehiculoAux = lstVehiculosOrdenados.get(i);
					lstVehiculosOrdenados.set(i, lstVehiculosOrdenados.get(j));
					lstVehiculosOrdenados.set(j, vehiculoAux);
				}
			}
		}
		for (Vehiculo vehiculo : lstVehiculosOrdenados) {
			System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo());
		}
	}
}
