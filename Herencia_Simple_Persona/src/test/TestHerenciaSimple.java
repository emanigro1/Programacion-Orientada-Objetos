package test;

import modelo.Persona;
import modelo.Empleado;
import modelo.Cliente;

import java.time.LocalDate;

public class TestHerenciaSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona[] personas = new Persona[2];
		 personas[0] = new Empleado("Juan","Di Risio",35782415, LocalDate.of(1990, 9, 26), 35215842, 45.000f);
		 personas[1] = new Cliente("Roberto", "Maslaton", 42815421, LocalDate.of(1974, 8, 30),"20-54005541-5",15.321f);

		System.out.println(((Empleado)personas[0]).calcularSueldo(3));
		System.out.println(((Empleado)personas[0]).calcularEdad(LocalDate.now()));
		
		System.out.println(((Cliente)personas[1]).estadoCredito());
		System.out.println(((Cliente)personas[1]).calcularEdad(LocalDate.now()));
		
		
		for (int i = 0; i < personas.length; i++) {
			if(personas[i] instanceof Cliente) {
				System.out.println(personas[i].toString());
			}
		}
	}

}
