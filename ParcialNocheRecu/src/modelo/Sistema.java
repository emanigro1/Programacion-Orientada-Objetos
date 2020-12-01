package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Sistema {

	ArrayList<Asistencia> asistencias;

	public Sistema() {

		this.asistencias = new ArrayList<Asistencia>();
	}

	@Override
	public String toString() {
		return "Sistema [asistencias=" + asistencias + "]";
	}

	public ArrayList<Asistencia> getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(ArrayList<Asistencia> asistencias) {
		this.asistencias = asistencias;
	}

	public ArrayList<Asistencia> traerAsistencia(LocalDate fecha) {
		ArrayList<Asistencia> lista = new ArrayList<Asistencia>();
		for (Asistencia asistencia : asistencias) {
			if (asistencia.fecha.equals(fecha))
				;
			lista.add(asistencia);
		}
		return lista;
	}

	public ArrayList<Asistencia> traerAsistencia(boolean esPresencial) {
		ArrayList<Asistencia> lista = new ArrayList<Asistencia>();
		for (Asistencia asistencia : asistencias) {
			if (asistencia instanceof TrabajoPresencial) {
				lista.add(asistencia);
			}
		}
		return lista;

	}

	public Asistencia traerAsistencia(int id) {
		int i = 0;
		boolean encontrado = false;
		Asistencia asistencia = null;
		while (i < asistencias.size() && !encontrado) {
			if (asistencias.get(i).idAsistencia == id) {
				encontrado = true;
				asistencia = asistencias.get(i);
			}
			i++;
		}
		return asistencia;

	}

	public Asistencia traerAsistencia(LocalDate fecha, String legajo) {
		boolean encontrado = false;
		int i = 0;
		Asistencia asistencia = null;
		ArrayList<Asistencia> lista = new ArrayList<Asistencia>();
		lista.addAll(traerAsistencia(fecha));
		while (i < lista.size() && !encontrado) {
			if (lista.get(i).equals(legajo)) {
				encontrado = true;
				asistencia = lista.get(i);
			}

			i++;
		}

		return asistencia;
	}

	// valida que aún no exista una asistencia para la misma fecha y legajo, lanza
	// excepcion
	public boolean agregarTrabajoPresencial(LocalDate fecha, String legajo, LocalTime horaDesde, LocalTime horaHasta)
			throws Exception {
		if (traerAsistencia(fecha, legajo) != null) {
			throw new Exception("Ya existe fecha y legajo");
		}
		return asistencias.add(new TrabajoPresencial(legajo, fecha, horaDesde, horaHasta));
	}

	public boolean agregarTeletrabajo(LocalDate fecha, String legajo, String motivo, int tareasRealizadas)
			throws Exception {

		return asistencias.add(new Teletrabajo(legajo, fecha, motivo, tareasRealizadas));
	}

}
