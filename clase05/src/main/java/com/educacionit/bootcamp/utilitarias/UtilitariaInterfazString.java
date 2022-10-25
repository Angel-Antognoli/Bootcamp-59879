package com.educacionit.bootcamp.utilitarias;

import com.educacionit.bootcamp.interfaces.INombre;

public class UtilitariaInterfazString {

	public static  String retornarNombreMayuscula(Object objeto) throws Exception {
		
		if (objeto instanceof INombre) {
			INombre aux = (INombre) objeto;
			return aux.nombre().toUpperCase();
		}
		throw new Exception("No tengo el metodo nombre porque no es un INOmbre");
	}
}
