package com.educacionit.bootcamp.clase05;

import com.educacionit.bootcamp.entidades.Alumno;
import com.educacionit.bootcamp.entidades.Documento;
import com.educacionit.bootcamp.entidades.GenericoDosDatos;
import com.educacionit.bootcamp.utilitarias.GuardarArchivo;

public class AppGenerico {
	public static void main(String[] args) {
		GenericoDosDatos<String, Integer> generico1 = new GenericoDosDatos<>();
		generico1.setDato1("");
		generico1.setDato2(2);

		GenericoDosDatos<Documento, Long> generico2 = new GenericoDosDatos<>();
		generico2.setDato1(new Documento());
		generico2.setDato2(1L);

		GuardarArchivo.<Documento>guardarPersona2(new Documento());

	}
}
