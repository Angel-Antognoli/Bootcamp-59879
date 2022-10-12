package com.educacionit.bootcamp.clase04;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import com.educacionit.bootcamp.entidades.Cliente;
import com.educacionit.bootcamp.entidades.Documento;

public class PruebaThrow {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		String fecha = JOptionPane.showInputDialog("Indica la fecha de nacimiento: ");
		LocalDate fechaN = LocalDate.parse(fecha);// 1983-03-15

		try {
			cliente.setFechaNacimiento(fechaN);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage() + ", Debe ingresar una fecha inferior");
			e.printStackTrace();
		}

		Cliente cliente2 = null;
		try {
			cliente2 = new Cliente(new Documento("DNI", 95853001L), "Octavio Robleto", LocalDate.parse("2025-01-01"),
					null);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage() + ", Debe ingresar una fecha inferior");
			e.printStackTrace();
		}

		JOptionPane.showMessageDialog(null, cliente);
		JOptionPane.showMessageDialog(null, cliente2);
	}
}
