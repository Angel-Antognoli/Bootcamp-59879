package com.educacionit.bootcamp.utilidades;

public class StringUtilidades {

	public static String VERSION;
	public static final float PI;

	static {
		VERSION = "1.0";
		PI = 3.14f;
	}

	public static String capitalizar(String cadena) {
		return cadena.substring(0, 1).toUpperCase() + "" + cadena.substring(1);

	}

}
