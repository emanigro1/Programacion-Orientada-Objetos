package test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import modelo.*;

public class Test {

	public static void main(String[] args) {
		

		

		
		System.out.println("Test De parcial recuperatorio Tnoche 2020");
		
		Sistema sistema1 = new Sistema();
		
		// -----------------------
		System.out.println("1-1");
		try {			
			sistema1.agregarTrabajoPresencial(LocalDate.of(2020,10,15),"1578",LocalTime.of(9,0),LocalTime.of(17,00));	
			System.out.println("Agregado Exitosamente");
		} catch (Exception e) {
			System.out.println(e);
		}
		

		
		// -----------------------
		System.out.println("1-2");
		try {			
			sistema1.agregarTeletrabajo(LocalDate.of(2020,10,15),"3782","pandemia",5);
			System.out.println("Agregado Exitosamente");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		// -----------------------
		System.out.println("1-3");
		
		try {			
			sistema1.agregarTrabajoPresencial(LocalDate.of(2020,10,15),"1578",LocalTime.of(10,0),LocalTime.of(18,00));
			
		} catch (Exception e) {
			System.out.println("1-3"+e);
		}
		
		try {			
			sistema1.agregarTeletrabajo(LocalDate.of(2020,10,16),"3724","pandemia",9);
			System.out.println("Agregado Exitosamente");
			
		} catch (Exception e) {
			System.out.println("1-3"+e);
		}

		// -----------------------
		System.out.println("2");
		
		System.out.println(sistema1.traerAsistencia(1));
		System.out.println(sistema1.traerAsistencia(2));
		
		// -----------------------
		System.out.println("3");
		try {			
			sistema1.agregarTrabajoPresencial(LocalDate.of(2020,10,15),"2839",LocalTime.of(9,0),LocalTime.of(17,00));

		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			sistema1.agregarTeletrabajo(LocalDate.of(2020,10,16),"3452","pandemia",5);
			sistema1.agregarTeletrabajo(LocalDate.of(2020,10,16),"5243","pandemia",7);
			System.out.println("Agregados Exitosamente");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("4-1");
		System.out.println(sistema1.traerAsistencia(LocalDate.of(2020,10,15)));
		
		System.out.println("4-2");
		System.out.println( sistema1.traerAsistencia(true));
		
	}

}
