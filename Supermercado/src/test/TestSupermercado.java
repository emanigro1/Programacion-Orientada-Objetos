package test;

import java.time.LocalDate;

import java.time.LocalTime;

import supermercado.*;

public class TestSupermercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// INSTANCIO SUPERMERCADO

		// Instancio las clases que utilizaran los metodos de agregacion

		Supermercado dia = new Supermercado(new AdmProducto(), new AdmCliente(), new AdmCarrito());

		try {
			// Agregacion de productos al super
			dia.getAdmProducto().agregarProducto("Pan", 160.70f);
			dia.getAdmProducto().agregarProducto("Galletitas", 20);
			dia.getAdmProducto().agregarProducto("Yerba", 80);
			dia.getAdmProducto().agregarProducto("Manteca", 52.5f);
			dia.getAdmProducto().agregarProducto("Azucar", 55.30f);

			// Clientes nuevos
			dia.getAdmCliente().agregarCliente("Lucas Fernandez", 682154723, "CABA");
			dia.getAdmCliente().agregarCliente("Ramon Suarez", 464324130, "Las Lomitas");
			
			// Carrito nuevo
			dia.getAdmCarrito().agregarCarrito(dia.getAdmCliente().traerCliente(1), LocalDate.now(), LocalTime.now());
			System.out.println(dia.getAdmProducto().traerProducto(1));
			System.out.println(dia.getAdmProducto().traerProducto(2));

			System.out.println(dia.getAdmProducto().traerProducto(3));
			System.out.println(dia.getAdmProducto().traerProducto(4));
			System.out.println(dia.getAdmProducto().traerProducto(5));

			// Agrego items al carrito
			dia.getAdmCarrito().traerCarrito(1).agregarItem(dia.getAdmProducto().traerProducto(1), 2);
			dia.getAdmCarrito().traerCarrito(1).agregarItem(dia.getAdmProducto().traerProducto(2), 4);
			dia.getAdmCarrito().traerCarrito(1).agregarItem(dia.getAdmProducto().traerProducto(3), 6);
			dia.getAdmCarrito().traerCarrito(1).agregarItem(dia.getAdmProducto().traerProducto(4), 1);
			dia.getAdmCarrito().traerCarrito(1).agregarItem(dia.getAdmProducto().traerProducto(5), 7);
			dia.getAdmCarrito().traerCarrito(1).eliminarItem(4);
			
			// calculo total
			System.out.println(dia.getAdmCarrito().traerCarrito(1).calcularTotal());

			
		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}

	}

}
