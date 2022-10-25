package com.educacionit.bootcamp.clase05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.educacionit.bootcamp.entidades.Alumno;
import com.educacionit.bootcamp.entidades.Documento;
import com.educacionit.bootcamp.enumerados.TipoDocumento;

public class AppSetTreeSetObjetosPropios {
	public static void main(String[] args) {
		Set<Alumno> alumnos = new TreeSet<>();
		alumnos.add(new Alumno(new Documento(TipoDocumento.DNI, 1), "Alumno 01", LocalDate.parse("1981-01-01"), true,
				LocalDateTime.now()));
		alumnos.add(new Alumno(new Documento(TipoDocumento.DNI, 2), "Alumno 02", LocalDate.parse("1982-01-01"), true,
				LocalDateTime.now()));
		alumnos.add(new Alumno(new Documento(TipoDocumento.DNI, 3), "Alumno 03", LocalDate.parse("1982-01-02"), true,
				LocalDateTime.now()));

		// orden natural de los objetos
		System.out.println("Imprimir*******************");
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		
	}
}
