package com.educacionit.bootcamp.clase04;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PruebaTime {
	public static void main(String[] args) {

		LocalDate fecha1 = LocalDate.parse("1983-03-15");

		boolean esAntes = fecha1.isAfter(LocalDate.now());// true
		System.out.println(esAntes);
		
		if (fecha1.isAfter(LocalDate.now())) {
			System.out.println("No debe ser una fecha despues de hoy");
		}

	}
}
