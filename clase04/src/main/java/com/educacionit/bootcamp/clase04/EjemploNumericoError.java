package com.educacionit.bootcamp.clase04;

import javax.swing.JOptionPane;

public class EjemploNumericoError {
	public static void main(String[] args) {
		System.out.println("Inicia");
		int num1;
		int num2;

		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Indica un Numerador:"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Indica un Denominador:"));
			JOptionPane.showMessageDialog(null, "La division es : " + (num1 / num2));
//conecte
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "No se puede dividir por cero");
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Tiene que ser un numero");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// siempre se ejecuta pase o no el error
			// trate de cerrarla
			System.out.println("siempre me ejecuto");
		}

		System.out.println("Finaliza");

	}

}
