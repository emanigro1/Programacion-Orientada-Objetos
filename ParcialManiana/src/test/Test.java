package test;

import java.time.LocalDate;

import modelo.*;

public class Test {

	public static void main(String[] args) {

		Sistema sistema = new Sistema();
		System.out.println("1-1");
		try {
			// 1-1) Intentar crear el objeto Gastronomia:
			Gastronomia gastronomia = new Gastronomia("4892", 15.0, true, "Hamburguesa criolla", 180.0, 4);

		} catch (Exception e) {
			System.out.println(e);

		}
		System.out.println("1-2");
		try {
			// 1-2) Crear elobjeto Gastronomia:
			Gastronomia gastronomia = new Gastronomia("489235", 15.0, true, "Hamburguesa criolla", 180.0, 4);
			System.out.println("Creado correctamente");
		} catch (Exception e) {
			System.out.println(e);

		}
		System.out.println("1-3");
		try {
			// 1-3) Intentar crear el objeto Hospedaje:
			Hospedaje hospedaje = new Hospedaje("2872", 10.0, true, "Cabaña 3 personas", 1500.0);
		} catch (Exception e) {
			System.out.println(e);

		}
		System.out.println("1-4");
		try {
			// 1-4) Crear el objeto Hospedaje:
			Hospedaje hospedaje = new Hospedaje("287282", 10.0, true, "Cabaña 3 personas", 1500.0);
			System.out.println("Creado correctamente");
		} catch (Exception e) {
			System.out.println(e);

		}

		System.out.println("2-1");
		try {
			Gastronomia gastronomia = new Gastronomia("489235", 15.0, true, "Hamburguesa criolla", 180.0, 4);
			System.out.println(gastronomia.calcularPrecioFinal(LocalDate.of(2020, 10, 20)));
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("2-2");
		try {
			Hospedaje hospedaje = new Hospedaje("287282", 10.0, true, "Cabaña 3 personas", 1500.0);
			System.out.println(hospedaje.calcularPrecioFinal(LocalDate.of(2020, 10, 27)));
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("3");
		// 3) Agregar los siguientes objetos e imprimir la lista de servicios
		try {
			sistema.agregarGastronomia("858927", 15.0, true, "Milanesa con pure", 350.0, 3);

			sistema.agregarHospedaje("489259", 10.0, true, "Habitación triple", 2200.0);

			sistema.agregarGastronomia("182835", 20.0, false, "Gaseosa", 120.0, 3);
	
			sistema.agregarHospedaje("758972", 15.0, false, "Habitación simple", 1000.0);
			
			System.out.println("Creados correctamente");
		} catch (Exception e) {
			System.out.println(e);
		}

		// 4-1) Traer todos los objetos Servicios enPromocion=true
		System.out.println("Servicios en promocion:");
		System.out.println(sistema.traerServicio(true));		

		// 4-2) Traer todos los objetos Servicios del dia=2020-10-28 y enPromocion=true
		System.out.println("Servicios en promocion con fecha parametro:");
		System.out.println(sistema.traerServicio(true, LocalDate.of(2020,10, 28)));
	}

}
