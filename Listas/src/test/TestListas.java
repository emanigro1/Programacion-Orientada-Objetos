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


			listaPeliculas.agregarPelicula(1, "Harry Potter", cienciaFiccion);

			listaPeliculas.agregarPelicula(2, "El señor de los Anillos", accion);
			listaPeliculas.agregarPelicula(3, "Los Simpsons", animadas);
			listaPeliculas.agregarPelicula(4, "Los Simpsons 2", animadas);

			// AGREGO PELICULAS CREANDO PELICULAS POR SEPARADO
			Pelicula pelicula1 = new Pelicula(5, "Dragon Ball Z", animadas);
			Pelicula pelicula2 = new Pelicula(6, "Kill Bill", accion);
			listaPeliculas.agregarPelicula(pelicula1);
			listaPeliculas.agregarPelicula(pelicula2);

			// AGREGO PELICULAS POR METODO DIRECTO
			System.out.println(listaPeliculas.agregarPelicula("Batman", cienciaFiccion));

			// TRAIGO PELICULAS
			System.out.println(listaPeliculas.traerPelicula("Los Simpsons"));
			System.out.println(listaPeliculas.traerPelicula(accion));

			// MODIFICO Y ELIMINO UNA PELICULA
			listaPeliculas.modificarPelicula(2, "Spiderman");
			listaPeliculas.modificarGenero(7, animadas);
			listaPeliculas.eliminarPelicula(1);

			// MUESTRO LISTADO;
			System.out.println(listaPeliculas);
			// POR GENERO
			System.out.println(listaPeliculas.traerPelicula(animadas));

		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}
	}
}
