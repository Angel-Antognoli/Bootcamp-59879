package com.educacionit.bootcamp.clase05;

import com.educacionit.bootcamp.entidades.Navegador;
import com.educacionit.bootcamp.utilitarias.UtilitariaInterfazString;

public class AppEjemploInterfaces {
	public static void main(String[] args) throws Exception {
		System.out.println(UtilitariaInterfazString.retornarNombreMayuscula(new Navegador()));
	}
}
