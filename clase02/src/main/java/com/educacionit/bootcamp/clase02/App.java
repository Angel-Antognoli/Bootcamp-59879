package com.educacionit.bootcamp.clase02;

import com.educacionit.bootcamp.entidades.Documento;
import com.educacionit.bootcamp.entidades.EntidadGenerica;
import com.educacionit.bootcamp.entidades.Persona;
import com.educacionit.bootcamp.utilidades.StringUtilidades;

/**
 * Hello world!
 *
 */
public class App {
	String descripcion;

	public static void main(String[] args) {
		EntidadGenerica entidadGenerica = new EntidadGenerica(1L, null, false);
		entidadGenerica.guardar();
		entidadGenerica.mostrarAtributos();
		System.out.println(entidadGenerica.toString());

		// nombre de la clase + representacion en hexa de la poosicion en memoria

		Documento documento = new Documento("DNI", "01");
		String nombre = "Octavio";

		System.out.println(documento.toString());
		Persona persona1 = new Persona(2l, null, false, documento, nombre, null, null);
		persona1.guardar();
		persona1.mostrarAtributos();
		System.out.println(persona1);
		Persona persona2 = new Persona(3l, null, false, new Documento("PAS", "02"), "rafael", null, null);

		System.out.println(Persona.pais);
		Persona.pais = "CHILE";
		System.out.println(Persona.pais);
		System.out.println(persona1.pais);

		System.out.println(StringUtilidades.capitalizar(persona2.getNombre()));
		opcion1();
		App app = new App();
		app.opcion2();
		String nombre1 = new String("rafael");
		String nombre2 = new String("rafael");

		System.out.println(nombre1);
		System.out.println(nombre2);
		if (nombre1 == nombre2) {
			System.out.println("si soy rafael");
		}

	}

	private static void opcion1() {
		System.out.println("opcion1");
	}

	private void opcion2() {

	}

}
