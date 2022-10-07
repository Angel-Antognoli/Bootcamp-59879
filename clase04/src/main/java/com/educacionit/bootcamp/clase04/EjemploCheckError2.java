package com.educacionit.bootcamp.clase04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.educacionit.bootcamp.entidades.TarjetaCredito;

public class EjemploCheckError2 {
	public static void main(String[] args) {
		TarjetaCredito tarjetaCredito = new TarjetaCredito();
// mensjae al cliente
		try {
			tarjetaCredito.generarPlastico("hola");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}
}
