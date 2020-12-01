package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Funciones {
	/*
	 * Help: LocalDate fecha=LocalDate.of (2019,9,30); 
	 * int nroDiaSem=fecha.getDayOfWeek().getValue(); *  nroDiaSem=1,from 1 (Monday) to 7 * (Sunday)
	 */

	public static boolean esDiaHabil(LocalDate fecha) {
		int d = fecha.getDayOfWeek().getValue();
		return ((d >= 1) && (d <= 5));
	}

	public static double convertirADouble(int n) {
		return ((double) n);
	}

	public static boolean esBisiesto(int anio) {
		boolean esBisiesto = false;
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
			esBisiesto = true;
		return esBisiesto;
	}

	public static boolean esFechaValida(LocalDate fecha) {
		boolean valido = esBisiesto(fecha.getYear());
		return valido;
	}

	public static String traerFechaCorta(LocalDate fecha) {
		return fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear();
	}

	public static String traerHoraCorta(LocalTime hora) {
		return hora.getHour() + ":" + hora.getMinute();
	}

	public static String traerDiaDeLaSemana(LocalDate fecha) {
		return fecha.getDayOfWeek() + "";
	}

	public static String traerMesEnLetras(LocalDate fecha) {
		return fecha.getMonth() + "";
	}

	public static String traerFechaLarga(LocalDate fecha) {
		return traerDiaDeLaSemana(fecha) + " " + fecha.getDayOfMonth() + " de " + traerMesEnLetras(fecha) + " del "
				+ fecha.getYear();
	}

	public static int traerCantDiasDeUnMes(int anio, int mes) throws Exception {
		if (mes < 1 || mes > 12)
			throw new Exception("El mes debe estar entre 1 - 12");
		int cantidadDiasMes = 0;
		switch (mes) {
		case 1: // Enero
		case 3: // Marzo
		case 5: // Mayo
		case 7: // Julio
		case 8: // Agosto
		case 10: // Octubre
		case 12: // Diciembre
			cantidadDiasMes = 31;
			break;
		case 4: // Abril
		case 6: // Junio
		case 9: // Septiembre
		case 11: // Noviembre
			cantidadDiasMes = 30;
			break;
		case 2: // Febrero
			if (esBisiesto(anio))
				cantidadDiasMes = 29; // Año Bisiesto
			else
				cantidadDiasMes = 28;

		}
		return cantidadDiasMes;
	}

	public static double aproximar2Decimal(double valor) {
		return Math.round(valor * 100d) / 100d;
	}

	public static boolean esNumero(char c) {
		return Character.isDigit(c);
	}

	public static boolean esLetra(char c) {
		return !esNumero(c);
	}

	public static boolean esCadenaNros(String cadena) {
		boolean resultado = true;
		int i = 0;
		while (i < cadena.length() && resultado) {
			if (esLetra(cadena.charAt(i))) {
				resultado = false;
			}
			i++;
		}
		return resultado;
	}

	public static boolean esCadenaLetras(String cadena) {
		boolean resultado = true;
		int i = 0;
		while (i < cadena.length() && resultado) {
			if (esNumero(cadena.charAt(i))) {
				resultado = false;
			}
			i++;
		}
		return resultado;
	}
}
