package test;

import modelo.Auto;
import modelo.Concesionaria;
import modelo.Moto;

public class Test {

	public static void main(String[] args) {
		
		Concesionaria concesionaria = new Concesionaria();

		concesionaria.getLstVehiculos().add(new Auto("Peugeot", "206", 200000, "4"));
		concesionaria.getLstVehiculos().add(new Moto("Honda", "Titan", 60000, "125cc"));
		concesionaria.getLstVehiculos().add(new Auto("Peugeot", "208", 250000, "5"));
		concesionaria.getLstVehiculos().add(new Moto("Yamaha", "YBR", 80500.50, "160cc"));
		concesionaria.mostrarVehiculos();
		
		System.out.println("\n=========================\n");

		concesionaria.masCaro();
		concesionaria.masBarato();
		concesionaria.buscarModeloPorLetra('Y');

		System.out.println("\n=========================\n");
		
		System.out.println("Vehículos ordenados por precio de mayor a menor: ");
		concesionaria.ordenadosPrecio();

	}

}
