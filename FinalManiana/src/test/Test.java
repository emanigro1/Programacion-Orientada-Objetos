package test;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.print.attribute.standard.DateTimeAtCompleted;

import modelo.*;

public class Test {

	public static void main(String[] args) {

		Sistema sistema = new Sistema();

		System.out.println("1-1)");
		try {
			// Intentar agregar a la lista el objeto SMS:
			sistema.agregarSMS(LocalDate.of(2020, 12, 10), LocalTime.of(16, 36), 151234567, 159876543,
					"Estoy rindiendo el final de OO1", new OperadorMovil(3, "Claro"), new OperadorMovil(2, "Movistar"));
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("1-2)");
		try {
			// agregar a la lista el objeto SMS:
			sistema.agregarSMS(LocalDate.of(2020, 12, 10), LocalTime.of(16, 36), 151234567, 1598765432,
					"Estoy rindiendo el final de OO1", new OperadorMovil(3, "Claro"), new OperadorMovil(2, "Movistar"));
			System.out.println("Creado");
		} catch (Exception e) {

			System.out.println(e);
		}

		System.out.println("1-3)");
		try {
			// Intentar agregar a la lista el objeto Email:
			sistema.agregarEmail(LocalDate.of(2020, 12, 12), LocalTime.of(16, 28), "oo1@unla.gob.ar", "alumno.com.ar",
					"Orientación a Objetos 1 - UNLa",
					"Estimado alumno, debe presentarse a rendir el final de OO1 el dia 1/12 a las 9Hs");
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("1-4)");
		try {
			// Agregar a la lista e imprimir el objeto Email
			sistema.agregarEmail(LocalDate.of(2020, 12, 12), LocalTime.of(16, 28), "oo1@unla.gob.ar",
					"alumno@gmail.com.ar", "Orientación a Objetos 1 - UNLa",
					"Estimado alumno, debe presentarse a rendir el final de OO1 el dia 1/12 a las 9Hs");
			System.out.println("Creado");
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			System.out.println("2-1)");
			// Traer e imprimir el SMS con IdMensaje = 1 y cambiar el estado a Visto=true
			Mensaje mensaje = (sistema.traerMensaje(1));
			System.out.println(mensaje);
			mensaje.cambiarDeEstado(true);
			System.out.println("correcto");

		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			System.out.println("2-2)");
			// Traer e imprimir el Email con IdMensaje = 2 y cambiar el estado a
			// Recibido=true
			Mensaje mensaje2 = (sistema.traerMensaje(2));
			System.out.println(mensaje2);
			mensaje2.cambiarDeEstado(true);
			System.out.println("correcto");
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("3)");
		// Agregar los siguientes objetos a la lista, al finalizar la carga, imprimirla:

		try {
			sistema.agregarSMS(LocalDate.of(2020, 11, 20), LocalTime.of(17, 19), 151234567, 1598765431, "Recibido OK",
					new OperadorMovil(1, "Personal"), new OperadorMovil(2, "movistar"));

		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			sistema.agregarSMS(LocalDate.of(2020, 12, 15), LocalTime.of(10, 24), 151234567, 1598765430, "Gracias",
					new OperadorMovil(1, "Personal"), new OperadorMovil(2, "movistar"));

		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			sistema.agregarEmail(LocalDate.of(2020, 11, 20), LocalTime.of(17, 15), "oo1@unla.gob.ar",
					"alumno@gmail.com.ar", "Orientación a Objetos 1 - UNLa",
					"Se adjunta la grilla de inscripciones al final de Diciembre");

		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			sistema.agregarEmail(LocalDate.of(2020, 12, 20), LocalTime.of(15, 12), "oo1@unla.gob.ar",
					"persona@gmail.com.ar", "Promoción", "Aproveche nuestras promociones");

		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Agragado todo correctamente");
		
		System.out.println("4-1)");
		
		System.out.println(sistema.traerMensaje("Personal"));
		
		System.out.println("4-2)");
		// Traer e imprimir los mensajes que se hayan enviado el día 11/12/2020 entre las 13 y las 17Hs.
		System.out.println(sistema.traerMensaje(LocalDate.of(2020, 12,11), LocalTime.of(13, 00),LocalTime.of(17,00)));

		
		System.out.println("4-3)");
		
		//Traer e imprimir los mensajes que se hayan enviado el día 10/12/2020 entre las 16 y las 18Hs y que tengan como compañía origen “Claro”
		System.out.println(sistema.traerMensaje(LocalDate.of(2020, 12, 10), LocalTime.of(16, 00), LocalTime.of(18, 00), "Claro"));
		
	}

}
