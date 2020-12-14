package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Sistema {
	ArrayList<Mensaje> listaMensajes;

	public Sistema() {
		this.listaMensajes = new ArrayList<Mensaje>();
	}

	protected ArrayList<Mensaje> getListaMensajes() {
		return listaMensajes;
	}

	protected void setListaMensajes(ArrayList<Mensaje> listaMensajes) {
		this.listaMensajes = listaMensajes;
	}

	@Override
	public String toString() {
		return "Sistema [listaMensajes=" + listaMensajes + "]";
	}

	public boolean agregarEmail(LocalDate fechaEnvio, LocalTime horaEnvio, String origen, String destino, String asunto,
			String cuerpo) throws Exception {
		// El atributo recibido se inicializará por defecto en falso.
		Mensaje email = new Email(fechaEnvio, horaEnvio, origen, destino, asunto, cuerpo);
		listaMensajes.add(email);
		email.setIdMensaje(listaMensajes.size());
		return true;
	}

	public boolean agregarSMS(LocalDate fechaEnvio, LocalTime horaEnvio, int numeroOrigen, int numeroDestino,
			String texto, OperadorMovil operadorOrigen, OperadorMovil operadorDestino) throws Exception {
		// El atributo visto se inicializará por defecto en falso.
		Mensaje sms = new SMS(fechaEnvio, horaEnvio, numeroOrigen, numeroDestino, texto, operadorOrigen,
				operadorDestino);
		listaMensajes.add(sms);
		sms.setIdMensaje(listaMensajes.size());
		return true;

	}

	public Mensaje traerMensaje(int idMensaje) {
		int i = 0;
		Mensaje mensaje = null;
		boolean encontrado = false;
		while (i < listaMensajes.size() && !encontrado) {
			if (listaMensajes.get(i).getIdMensaje() == idMensaje) {
				encontrado = true;
				mensaje = listaMensajes.get(i);

			}
			i++;
		}

		return mensaje;
	}

	public ArrayList<Mensaje> traerMensaje(String nombreCompania) {
		ArrayList<Mensaje> mensajesTraidos = new ArrayList<Mensaje>();
		for (Mensaje mensaje : listaMensajes) {
			if (mensaje instanceof SMS) {
				if (((SMS) mensaje).equals(nombreCompania)) {
					mensajesTraidos.add(mensaje);
				}
			}
		}
		return mensajesTraidos;
	}

	public ArrayList<Mensaje> traerMensaje(LocalDate fecha, LocalTime horaDesde,
			LocalTime horaHasta) { /*
									 * * * retorna una lista del tipo Mensaje con aquellos que tengan fecha y hora
									 * dentro de los parámetros ingresados.
									 */
		ArrayList<Mensaje> mensajesTraidos = new ArrayList<Mensaje>();
		for (Mensaje mensaje : listaMensajes) {
			if (mensaje.getFechaEnvio().equals(fecha)) {

				if (mensaje.getHoraEnvio().isAfter(horaDesde)) {
					if (mensaje.getHoraEnvio().isBefore(horaHasta)) {
						mensajesTraidos.add(mensaje);

					}

				}
			}
		}
		return mensajesTraidos;
	}

	public ArrayList<Mensaje> traerMensaje(LocalDate fecha, LocalTime horaDesde, LocalTime horaHasta,
			String codigoCompania) {/*
									 * retorna una lista del tipo Mensaje con aquellos que tengan fecha y hora
									 * dentro de los parámetros ingresados y además contentan operador origen de
									 * código compañía con la compañía que ingresa como parámetro
									 */
		ArrayList<Mensaje> mensajesTraidos = new ArrayList<Mensaje>();
		mensajesTraidos.addAll(traerMensaje(fecha, horaDesde, horaHasta));
		for (Mensaje mensaje : mensajesTraidos) {
			if (!((SMS) mensaje).equals(codigoCompania)) {
				mensajesTraidos.remove(mensaje);
			}
		}

		return mensajesTraidos;
	}

}
