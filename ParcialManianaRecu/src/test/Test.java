package test;

import java.time.LocalDate;

import modelo.Sistema;

public class Test {

	public static void main(String[] args) {

		Sistema sistema = new Sistema();
		try {
			System.out.println(" 1-1");
			sistema.agregarPedidoPapelMensual(LocalDate.of(2020, 11, 11), 2000.0, LocalDate.of(2020, 11, 5), 3);

			System.out.println(" 1-2");
			sistema.agregarPedidoElectronico(LocalDate.of(2020, 11, 12), 3500.0, "PC rota", 200.0);
			System.out.println("Creados correctamente");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(" 1-3");
		try {

			sistema.agregarPedidoPapelMensual(LocalDate.of(2020, 11, 11), 2000.0, LocalDate.of(2020, 11, 5), 0);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		try {
			sistema.agregarPedidoElectronico(LocalDate.of(2020, 11, 12), 3500.0, "", 200.0);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

		System.out.println(" 2-1");
		System.out.println(sistema.traerPedido(1));
		System.out.println(sistema.traerPedido(2));
		
		try {
			System.out.println(" 3");
			sistema.agregarPedidoPapelMensual(LocalDate.of(2020, 11, 12), 1200.0, LocalDate.of(2020, 11, 16), 3);
			sistema.agregarPedidoElectronico(LocalDate.of(2020, 11, 14), 3000.0, "PC rota", 200.0);
			sistema.agregarPedidoElectronico(LocalDate.of(2020, 11, 15), 3100.0, "Monitor roto", 210.0);
			System.out.println("Creados correctamente");
			
			
			System.out.println("4-1");
			System.out.println(sistema.traerPedido("PC rota"));

			System.out.println("4-2");
			System.out.println(sistema.calcularTotalGeneral());


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}