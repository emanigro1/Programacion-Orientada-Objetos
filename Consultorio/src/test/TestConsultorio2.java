
package test;

import consultorio.Medico;
import consultorio.Paciente;

public class TestConsultorio2 {

	public static void main(String[] args) {
		// Instancio objetos
		Paciente paciente1 = new Paciente("Jose", "Perez", 1.80f, 85);
		Paciente paciente2 = new Paciente("Jorge", "Fernandez", 1.60f, 90);
		Medico medico = new Medico("Daniel", "Lopez", "Dermatologia");

		System.out.println("Visita 1:\n");
		System.out.println("Medico: " + medico.nombreCompleto());
		System.out.println("Paciente " + paciente1.traerNombreCompleto() + ": IMC " + medico.calcularIMC(paciente1));
		System.out.println("Paciente " + paciente2.traerNombreCompleto() + ": IMC " + medico.calcularIMC(paciente2));

		// cambio los atributos de peso y estatura de paciente utilizando set
		paciente1.setPeso(64);
		paciente1.setEstatura(1.60f);

		paciente2.setPeso(70);
		paciente2.setEstatura(1.62f);

		System.out.println("\nVisita 2:\n");
		System.out.println("Medico: " + medico.nombreCompleto());
		System.out.println("Paciente " + paciente1.traerNombreCompleto() + ": IMC " + medico.calcularIMC(paciente1));
		System.out.println("Paciente " + paciente2.traerNombreCompleto() + ": IMC " + medico.calcularIMC(paciente2));

	}

}