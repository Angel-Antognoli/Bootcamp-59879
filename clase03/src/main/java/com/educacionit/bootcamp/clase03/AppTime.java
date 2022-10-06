package com.educacionit.bootcamp.clase03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class AppTime {
	public static void main(String[] args) {
		Date fecha = new Date();
		System.out.println(fecha);

		Date fechaNacimiento = new Date(83, 2, 15);
		System.out.println(fechaNacimiento);

		// 15-03-1983

		LocalDate fechaNueva = LocalDate.parse("1983-03-15");
		LocalDateTime fechaTiempo = LocalDateTime.parse("1989-06-05T18:36:55");
		System.out.println(fechaNueva);
		System.out.println(fechaTiempo);
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
	}
}
