package testUnidimensional;
import java.util.Arrays;
import unidimensional.*;


public class ArregloUnidimensionalTest {

	public static void main(String[] args) {

		int[] array = {9,5,11,3,7,6,2,11,6,8,2,4,11,11,5,8,2,3,1,7,5};
		Unidimencional numerosUnidimensionales = new Unidimencional(array);
		
		System.out.println("Vector : "+numerosUnidimensionales.toString());
		System.out.println("Menor: "+numerosUnidimensionales.traerElMenor());
		System.out.println("Maximo: "+numerosUnidimensionales.traerElMaximo());
		System.out.println("Promedio: "+numerosUnidimensionales.calcularPromedio());
		System.out.println("Ordenado ascendente: "+Arrays.toString(numerosUnidimensionales.ordenarAscendente()));
		System.out.println("Ordenado descendente: "+Arrays.toString(numerosUnidimensionales.ordenarDescendente()));
		System.out.println("Frecuencia: "+numerosUnidimensionales.traerFrecuencia(11));
		System.out.println("Moda: "+numerosUnidimensionales.traerModa());
	}

}
