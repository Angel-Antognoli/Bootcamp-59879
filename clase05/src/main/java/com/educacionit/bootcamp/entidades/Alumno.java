package com.educacionit.bootcamp.entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import com.educacionit.bootcamp.interfaces.EnviarMail;

public class Alumno extends Persona implements EnviarMail<Alumno>{
	private String[] cursos;

	public Alumno() {
		super();
	}

	public Alumno(Documento documento, String nombreCompleto, LocalDate fechaNacimiento, Boolean activo,
			LocalDateTime fechaCreacion) {
		super(documento, nombreCompleto, fechaNacimiento, activo, fechaCreacion);
	}

	public Alumno(Documento documento, String nombreCompleto, LocalDate fechaNacimiento, Boolean activo,
			LocalDateTime fechaCreacion, String[] cursos) {
		super(documento, nombreCompleto, fechaNacimiento, activo, fechaCreacion);
		this.cursos = cursos;
	}

	public String toString() {
		return "Alumno [" + documento + ", nombreCompleto=" + nombreCompleto + ", fechaNacimiento=" + fechaNacimiento
				+ ", activo=" + activo + ", fechaCreacion=" + fechaCreacion + ", cursos=" + Arrays.toString(cursos)
				+ "]";
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(cursos);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Arrays.equals(cursos, other.cursos);
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	@Override
	public boolean enviarMail(String correo, Alumno e) {
		// TODO Auto-generated method stub
		return false;
	}

	//alumno1 =  new Alumno(octavio 25);
	//alumno2 =  new Alumno(Andrea 39);
	// alumno1.compareTo(alumno2);
	public int compareTo(Persona o) {
		// alumno1.edad - alumno2.edad;
		
		// es negativo el elemento 1 esta primero
		// es cero es igual
		// positivo el alumno2 esta primero
		
		
		// des alumno2.edad - alumno1.edad;

		return 0;
	}


}
