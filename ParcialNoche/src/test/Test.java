package test;

import modelo.*;

public class Test {

	public static void main(String[] args) {
		Sistema sistema = new Sistema();

		// 1-1) Intentar crear el objeto Servicio:
		System.out.println("1-1)");
		try {
			Servicio servicio = new Servicio("897323", "Mantenimiento maquina de cortar el pasto", 2500.0, 15.0, true);
		} catch (Exception e) {
			System.out.println(e);
		}

		// 1-2) Crear e imprimir el objeto Servicio:
		System.out.println("1-2)");
		try {
			Servicio servicio2 = new Servicio("8973231", "Mantenimiento maquina de cortar el pasto", 2500.0, 15.0,
					true);
			System.out.println("Creado correctamente");

			// 2-1) Calcular e imprimir precio final del servicio:
			System.out.println("2-1)");
			System.out.println(servicio2.calcularPrecioFinal());

		} catch (Exception e) {
			System.out.println(e);
		}

		// 1-3) Intentar crear el objeto Producto:
		System.out.println("1-3)");
		try {
			Producto producto = new Producto("432597", "Manguera de desagote lavarropa", 650.0, 15.0, true);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("1-4)");
		try {
			Producto producto2 = new Producto("4325971", "Manguera de desagote lavarropa", 650.0, 15.0, true);
			System.out.println("Creado correctamente");

			// 2-2) Calcular e imprimir precio final del servicio:
			System.out.println("2-2)");
			System.out.println(producto2.calcularPrecioFinal());

		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			// 3-1) Agregar los siguientes objetos:
			System.out.println("3-1)");
			sistema.agregarProducto("3892871", "Aceite para maquinas", 430.0, 10.0, true);
			sistema.agregarServicio("3892815", "Mantenimiento de cortadora de ceped", 2520.0, 15.0, true);
			sistema.agregarProducto("9381925", "Tambor lavaropa", 7500.0, 25.0, false);
			sistema.agregarServicio("3481759", "Mantenimiento estufa", 1250.0, 15.0, false);

			System.out.println("Creados correctamente");

			try {
//				3-2) Reintentar agregar el siguiente objeto:
				sistema.agregarServicio("3892815", "Mantenimiento de cortadora de ceped", 2520.0, 15.0, true);

			} catch (Exception e) {

				System.out.println(e);
			}

			try {
				// 3-3) Reintentar agregar el siguiente objeto:
				sistema.agregarProducto("9381925", "Tambor lavaropa", 7500.0, 25.0, false);
			} catch (Exception e) {
				System.out.println(e);
			}

			System.out.println("4-1)");
			// 4) Traer todos los objetos Mercancia en oferta enOferta=true
			System.out.println(sistema.traerMercancia(true));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
