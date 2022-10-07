package com.educacionit.bootcamp.clase04;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class EjemploErrores {
	public static void main(String[] args) {
		LocalDate fechaNacimiento;

	

		try {
			String aux = JOptionPane.showInputDialog("Indica tu Fecha de Nacimiento:");
			fechaNacimiento = LocalDate.parse(aux);// AAAA-MM-DD el mensaje es incorrecto 

			JOptionPane.showMessageDialog(null, fechaNacimiento);
		} catch (Exception error) {
			// generar archivo log
			// mensaje al usuario
			error.printStackTrace();
			JOptionPane.showMessageDialog(null, "No es una fecha valida " + error.getMessage());
					
		}

		System.out.println("Finaliza");
	}
}
