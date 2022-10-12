package com.educacionit.bootcamp.clase04;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import com.educacionit.bootcamp.entidades.Cliente;
import com.educacionit.bootcamp.entidades.Cuenta;
import com.educacionit.bootcamp.entidades.Documento;
import com.educacionit.bootcamp.entidades.Producto;
import com.educacionit.bootcamp.entidades.TarjetaCredito;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		// recordando polimorfismo
		Producto producto = new TarjetaCredito(1L, "HSBC", LocalDateTime.now(), LocalDate.parse("2022-10-26"));
		// arreglo

		Producto[] productos = new Producto[3];
		productos[0] = new TarjetaCredito(1L, "HSBC", LocalDateTime.now(), LocalDate.parse("2022-10-26"));
		productos[1] = new TarjetaCredito(2L, "ICBC", LocalDateTime.now(), LocalDate.parse("2022-10-15"));
		productos[2] = new Cuenta(3L, "BBVA", LocalDateTime.now(), "CA", 0.005F);

		for (Producto productoAuxiliar : productos) {
			productoAuxiliar.emitirPago(5.6f, 1L, "Pago del producto");
		}

		Cliente cliente = new Cliente(new Documento("DNI", 95800001L), "Octavio Robleto", LocalDate.parse("1983-03-15"),
				productos);

		System.out.println(cliente);

		for (Producto productoClienteAuxiliar : cliente.getProductos()) {
			float monto = Float.parseFloat(JOptionPane.showInputDialog(
					cliente.getNombreCompleto() + "\n" + productoClienteAuxiliar + "\nIndica el monto a pagar: "));
			long numero = Long.parseLong(JOptionPane.showInputDialog(
					cliente.getNombreCompleto() + "\n" + productoClienteAuxiliar + "\nIndica la Cuenta:"));
			String descripcion = JOptionPane.showInputDialog(
					cliente.getNombreCompleto() + "\n" + productoClienteAuxiliar + "\nIndica la referencia del pago");

			productoClienteAuxiliar.emitirPago(monto, numero, descripcion);
		}

	}
}
