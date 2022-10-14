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


}
