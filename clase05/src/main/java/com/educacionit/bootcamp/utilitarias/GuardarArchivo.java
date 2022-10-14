package com.educacionit.bootcamp.utilitarias;

import com.educacionit.bootcamp.entidades.Alumno;
import com.educacionit.bootcamp.entidades.Persona;

public final class GuardarArchivo {
	private GuardarArchivo() {

	}

	public static boolean guardarPersona(Persona persona) {

		if (persona instanceof Alumno) {
			Alumno alumno = (Alumno) persona;
			System.out.println("guardar alumno en hoja alumno " + alumno);
		} else {
			// lanzo error
		}

		// if --> profesor

		return true;
	}

	// GuardarArchivo.guardarPersona2
	public static <E> boolean guardarPersona2(E e) {
		System.out.println(e);
		return true;
	}

}
