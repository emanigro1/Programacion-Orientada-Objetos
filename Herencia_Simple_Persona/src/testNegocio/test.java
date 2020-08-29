package testNegocio;

import java.time.LocalDate;
import java.time.Month;

import modelo.Empleado;
import modelo.Persona;
import modelo.Cliente;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.of(1990, Month.SEPTEMBER, 26);
		LocalDate date2 = LocalDate.of(1954, Month.JUNE, 1);
		Persona ema = new Empleado("ema", "nigro", 23263, date, 2153l, 95f);
		Persona alfredo = new Cliente("alfredo", "rico", 4815, date2, "2153", 12314f);
		System.out.println(ema.hablar()+":");
		System.out.println("Edad: " + ema.calcularEdad(date));
		// CASTEO PARA UTILIZAR METODO DE EMPLEADO CON PERSONA
		System.out.println(((Empleado) ema).calcularSueldo(3));
		// AL TENER METODO ABSTRACTO NO HACE FALTA CASTEAR
		System.out.println(alfredo.hablar()+":");
		System.out.println(((Cliente) alfredo).estadoCredito());	
		System.out.println("Edad: " + alfredo.calcularEdad(date2));


	}

}
