package com.educacionit.bootcamp.clase04;

import java.io.FileNotFoundException;

import com.educacionit.bootcamp.entidades.TarjetaCredito;

public class AppThrowsError {
	public static void main(String[] args) {
		System.out.println("Inicio");
		TarjetaCredito tarjetaCredito = new TarjetaCredito();
		try {
			tarjetaCredito.generarPlastico("/../../arhcivo");
			// int numeroArchivo=operacionmatematica;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (Exception e) {
			// mensaje generico
			e.printStackTrace();
		}
		System.out.println("fin");
	}
}
