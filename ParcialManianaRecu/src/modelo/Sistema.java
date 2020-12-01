package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {

	ArrayList<Pedido> pedidos;

	public Sistema() {

		this.pedidos = new ArrayList<Pedido>();
	}

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Sistema [pedidos=" + pedidos + "]";
	}

	public boolean agregarPedidoPapelMensual(LocalDate fechaCreacion, double montoBase, LocalDate fechaEntrega,
			int cantidadResmas) throws Exception {

		return pedidos.add(new PedidoPapelMensual(fechaCreacion, montoBase, fechaEntrega, cantidadResmas));
	}

	public boolean agregarPedidoElectronico(LocalDate fechaCreacion, double montoBase, String motivo,
			double porcentajeExtra) throws Exception {

		return pedidos.add(new PedidoElectronico(fechaCreacion, montoBase, motivo, porcentajeExtra));
	}

	public Pedido traerPedido(int idPedido) {
		int i = 0;
		boolean encontrado = false;
		while (i < pedidos.size() && encontrado == false) {
			if (pedidos.get(i).getIdPedido() == idPedido) {
				encontrado = true;
			}
			i++;
		}
		return pedidos.get(i - 1);
	}

	public ArrayList<Pedido> traerPedido(String motivo) {

		ArrayList<Pedido> pedidosNuevos = new ArrayList<Pedido>();

		for (Pedido pedido : pedidos) {
			if (pedido instanceof PedidoElectronico) {

				if (((PedidoElectronico) pedido).equals(motivo)) {
					pedidosNuevos.add(pedido);
				}
			}
		}
		return pedidosNuevos;
	}

	public double calcularTotalGeneral() {
		double totalAPagar = 0;
		for (Pedido pedido : pedidos) {
			totalAPagar = pedido.calcularPrecioFinal();

		}

		return totalAPagar;
	}
}
