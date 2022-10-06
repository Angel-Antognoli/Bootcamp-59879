package com.educacionit.bootcamp.utilidades;

public class StringUtilidad {

	public static final String ESPACIO_EN_BLANCO = " . ";

	public static String capitalizar(String cadena) {
		return cadena.substring(0, 1).toUpperCase() + "" + cadena.substring(1);

	}
}
