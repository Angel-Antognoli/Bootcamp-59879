package com.educacionit.bootcamp.clase04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// fechaNacimiento
public class Pruebaerrores {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		// 1983-03-15
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		String fecha = "198P-03-15";

		try {
			date = formato.parse(fecha);
		} catch (ParseException e) {
			int datoErroneo = e.getErrorOffset();
			System.out.println(
					fecha.substring(datoErroneo, datoErroneo + 1) + " No es un dato correcto, enviaste " + fecha);
			e.printStackTrace();
		}

		try {
			// llamar al BCRA

		} catch (Exception e) {
			// 192.168.0.1 BCRA DIO error 503.. no habia comunicacion
			e.printStackTrace();
		}

	}
}
