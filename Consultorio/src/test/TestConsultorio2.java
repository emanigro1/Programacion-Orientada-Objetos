
package test;

import consultorio.Medico;
import consultorio.Paciente;

public class TestConsultorio2 {

	public static void main(String[] args) {
		// Instancio objetos
		Paciente[] pacientes=new Paciente[2];
		 pacientes[0] = new Paciente("Jose", "Perez", 1.80f, 85);
		 pacientes[1] = new Paciente("Jorge", "Fernandez", 1.60f, 90);
		Medico medico = new Medico("Daniel", "Lopez", "Dermatologia",pacientes);

		System.out.println("Visita 1:\n");
		System.out.println("Medico: " + medico.nombreCompleto());
		System.out.println("Paciente " + pacientes[0].traerNombreCompleto() + ": IMC " + medico.calcularIMC(pacientes[0]));
		System.out.println("Paciente " + pacientes[1].traerNombreCompleto() + ": IMC " + medico.calcularIMC(pacientes[1]));

		// cambio los atributos de peso y estatura de paciente utilizando set
		pacientes[0].setPeso(64);
		pacientes[0].setEstatura(1.60f);

		pacientes[1].setPeso(70);
		pacientes[1].setEstatura(1.62f);

		System.out.println("\nVisita 2:\n");
		System.out.println("Medico: " + medico.nombreCompleto());
		System.out.println("Paciente " + pacientes[0].traerNombreCompleto() + ": IMC " + medico.calcularIMC(pacientes[0]));
		System.out.println("Paciente " + pacientes[1].traerNombreCompleto() + ": IMC " + medico.calcularIMC(pacientes[1]));


	}

}