package com.educacionit.bootcamp.clase04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EjemploCheckError {
	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(
					"C:\\Users\\Boreal\\Dropbox\\EDUCACION IT\\Java Standard\\Clases\\Clase 05\\01 - Contenido.pdf");

			// leerlo
			// mostrar un navegador
			// mostrar consola

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
