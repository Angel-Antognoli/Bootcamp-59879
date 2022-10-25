package com.educacionit.bootcamp.clase06;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import javax.swing.JOptionPane;

import com.educacionit.bootcamp.entidades.Cliente;
import com.educacionit.bootcamp.entidades.Cuenta;
import com.educacionit.bootcamp.entidades.Direccion;
import com.educacionit.bootcamp.entidades.Documento;
import com.educacionit.bootcamp.entidades.Inversion;
import com.educacionit.bootcamp.entidades.Producto;
import com.educacionit.bootcamp.enumerados.TipoCliente;
import com.educacionit.bootcamp.enumerados.TipoDocumento;
import com.educacionit.bootcamp.enumerados.TipoProducto;
import com.educacionit.bootcamp.excepciones.ExcepcionProducto;

/**
 * Hello world!
 *
 */
public class App {

	enum EstadoCliente {
		ACTIVO(true), INACTIVO(false);

		private boolean estado;

		private EstadoCliente(boolean estado) {
			this.estado = estado;
		}

		public boolean getEstado() {
			return estado;
		}
	}

	public static void main(String[] args) throws ExcepcionProducto {

		TipoDocumento tipoDocumento = (TipoDocumento) JOptionPane.showInputDialog(null, "Elige un Documento",
				"Documentos", 3, null, TipoDocumento.values(), 0);
		String numeroDocumento = JOptionPane.showInputDialog("Indica el Numero de Documento: ");
		String razonSocial = JOptionPane.showInputDialog("Indica la Razon Social: ");
		String telefono1 = JOptionPane.showInputDialog("Indica el Primer Telefono: ");
		String telefono2 = JOptionPane.showInputDialog("Indica el Segundo Telefono: ");
		LinkedHashSet<Direccion> direcciones = new LinkedHashSet<>();

		// cargar las direcciones
		while (true) {
			Direccion direccion = new Direccion();
			direccion.setCalle(JOptionPane.showInputDialog("Indica la Calle: "));
			direccion.setCodigoPostal(JOptionPane.showInputDialog("Indica el CP: "));
			direccion.setNumero(JOptionPane.showInputDialog("Indica el Numero: "));
			direcciones.add(direccion);

			int cargarDireccion = JOptionPane.showConfirmDialog(null, "Desea cargar otra direccion? ");
			if (cargarDireccion != 0) {
				break;
			}
		}

		TipoCliente tipoCliente = (TipoCliente) JOptionPane.showInputDialog(null, "Elige un Segmento", "Tipo Cliente",
				3, null, TipoCliente.values(), 0);

		LocalDate fechaNacimiento = null;

		while (true) {
			try {
				String fechaN = JOptionPane.showInputDialog("Indica la fecha de Nacimiento [AAAA-MM-DD]: ");
				fechaNacimiento = LocalDate.parse(fechaN);// 2023-01-03
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error en formato Fecha [AAAA-MM-DD]", "Formato",
						JOptionPane.DEFAULT_OPTION);
			}
		}
		EstadoCliente estadoCliente = (EstadoCliente) JOptionPane.showInputDialog(null, "Elige un Estado",
				"Estado Cliente", 3, null, EstadoCliente.values(), 0);
		boolean activo = estadoCliente.getEstado();

		// vamos a pedir los productos

		TreeSet<Producto> productos = new TreeSet<>();
		while (true) {
			Producto producto = null;
			Short banco = Short.valueOf(JOptionPane.showInputDialog("Indica el Banco: "));
			Short sucursal = Short.valueOf(JOptionPane.showInputDialog("Indica la Sucursal: "));
			Short codigoPostal = Short.valueOf(JOptionPane.showInputDialog("Indica el CP: "));
			TipoProducto tipoProducto = (TipoProducto) JOptionPane.showInputDialog(null, "Elige un Tipo de Producto",
					"Productos Banco Educacion IT", 3, null, TipoProducto.values(), 0);

			switch (tipoProducto) {
			case CC:
			case CA:
				Double saldo = Double.valueOf(JOptionPane.showInputDialog("Indica el Saldo de la Cuenta: "));
				producto = new Cuenta(banco, sucursal, codigoPostal, tipoProducto, saldo);
				break;
			case FCI:
				Float ganancia = Float.valueOf(JOptionPane.showInputDialog("Indica el % de Ganancia: "));
				producto = new Inversion(banco, sucursal, codigoPostal, tipoProducto, ganancia);
				break;
			default:
				break;
			}

			productos.add(producto);

			int cargarProductos = JOptionPane.showConfirmDialog(null, "Desea cargar otro Producto? ");
			if (cargarProductos != 0) {
				break;
			}

		}

		Cliente cliente = new Cliente(new Documento(tipoDocumento, numeroDocumento), razonSocial, telefono1, telefono2,
				direcciones, tipoCliente, fechaNacimiento, LocalDateTime.now(), activo, productos);

		JOptionPane.showMessageDialog(null, cliente);
	}
}
