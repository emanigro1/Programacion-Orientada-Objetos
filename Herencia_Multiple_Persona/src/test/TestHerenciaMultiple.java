package test;

import java.time.LocalDate;
import java.time.Month;

import modelo.Empleado;
import modelo.Persona;
import modelo.Vendedor;
import modelo.Cliente;
import modelo.Cobrador;

public class TestHerenciaMultiple {

	public static void main(String[] args) {
		
		Cliente clientes[]=new Cliente[2];

		clientes[0]= new Cliente("Ignacio", "Ortiz", 36251548, LocalDate.of(1985, 6, 18), "20-65821545-2", 15.000f);
		clientes[1]= new Cliente("Maria", "Rodriguez", 25485451, LocalDate.of(1985, 2, 19), "23-45418965-5", 9.900f);
		Cobrador cobrador1=new Cobrador("Roberto", "Garcia",	64454514, LocalDate.of(1990, 12, 1), 15481211, 20.000f, clientes, 2.000f);
		Vendedor vendedor1=new Vendedor("Vanesa", "Andrada", 23153753, LocalDate.of(1960,1,14), 2162024, 50.222f, clientes, 6.000f);
		
		System.out.println(cobrador1.calcularSueldo());
		System.out.println(vendedor1.calcularEdad(LocalDate.now()));
		System.out.println(vendedor1.calcularComision());
	}

}
