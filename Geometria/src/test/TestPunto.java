package test;
import modelo.Punto;
import modelo.Circulo;

public class TestPunto {

	public static void main(String[] args) {
		
		//Escenario 1
		Punto p1= new Punto (2,7);	
		Punto p2= new Punto(5,9);		
		
		System.out.println("Escenario 1:");
		System.out.println(p1.toString());	
		System.out.println(p2.toString());
		System.out.println(p1.equals(p2));
		
		//Escenario 2
		Punto p3=new Punto (2,5);
		Punto p4=new Punto (2,5);
		
		System.out.println("Escenario 2:");
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		System.out.println(p3.equals(p4));
		
		//Calcular distancia entre dos puntos
		System.out.print ("Distancia entre los puntos p1 y p2:");
		System.out.println(p1.calcularDistancia(p2));
		
		Punto p5=new Punto(15,34);
		System.out.println(p5.toString());
		
		Circulo c1=new Circulo(p5,15);		
		System.out.println(c1.toString());
		
		//Movemos los puntos sin modificar el objeto
		c1.mover(98,74);
		System.out.println(c1.toString());	
		
		System.out.print("Perimetro: ");
		System.out.println(c1.calcularPerimetro());
		
		System.out.print("Area: ");
		System.out.println(c1.calcularArea());
		
		System.out.print("Diametro: ");
		System.out.println(c1.calcularDistancia(c1));
	}

}
