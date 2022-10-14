package com.educacionit.bootcamp.clase05;

import java.util.Arrays;

public class AppEnum {
	enum TALLES {
		S, M, L, XL, XXL
	}

	public static void main(String[] args) {
		
		System.out.println(TALLES.XL);
		String tallas = "tallas";

		TALLES variable_talle; // nooooooo =  new TALLES();
		variable_talle = TALLES.XXL;
		System.out.println(variable_talle);

		variable_talle = TALLES.valueOf("M");
		System.out.println(variable_talle);

		try {
			variable_talle = TALLES.valueOf("N");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " las opciones correctas son " + Arrays.toString(TALLES.values()));
		}
		// String , numero entero, Enum
		switch (variable_talle) {
		case L:
			System.out.println("Eres talla L");
			break;
		case S:
			System.out.println("Eres talla S");
			break;
		default:
			break;
		}

	}
}
