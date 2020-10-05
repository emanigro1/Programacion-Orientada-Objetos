package test;

import proyectoIncaa.*;

public class TestListas {
	public static void main(String argv[]) {

		try {
			// CREO CATALOGO INCAA
			Incaa listaPeliculas = new Incaa();

			// AGREGO PELICULAS POR METODO DIRECTO
			Genero cienciaFiccion = new Genero(1, "Ciencia Ficcion");
			Genero animadas = new Genero(2, "Animadas");
			Genero accion = new Genero(3, "Accion");

			listaPeliculas.agregarPelicula(1, "Harry Potter", new Genero(1, "Ciencia Ficcion"));
			listaPeliculas.agregarPelicula(2, "El señor de los Anillos", accion);
			listaPeliculas.agregarPelicula(3, "Los Simpsons", animadas);
			listaPeliculas.agregarPelicula(4, "Los Simpsons 2", animadas);
			listaPeliculas.agregarPelicula(5, "Batman", cienciaFiccion);

			// TRAIGO PELICULAS
			System.out.println(listaPeliculas.traerPelicula("Los Simpsons"));
			System.out.println(listaPeliculas.traerPelicula(accion));

			// MODIFICO GENERO Y PELICULA, Y ELIMINO UNA PELICULA
			listaPeliculas.modificarPelicula(2, "Spiderman");
			listaPeliculas.modificarGenero(3, accion);
			listaPeliculas.eliminarPelicula(4);

			// MUESTRO LISTADO;
			System.out.println(listaPeliculas);
			// POR GENERO
			System.out.println(listaPeliculas.traerPelicula(accion));

		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}
	}
}
