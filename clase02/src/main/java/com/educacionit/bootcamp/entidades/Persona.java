package com.educacionit.bootcamp.entidades;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Persona extends EntidadGenerica {
	private Documento documento;
	private String nombre;
	private String apellido;
	private Direccion[] direcciones;
	public static String pais = "ARGENTINA";

	public Persona() {
		super();
	}

	public Persona(long id, LocalDateTime fechaCreacion, boolean activo, Documento documento, String nombre,
			String apellido, Direccion[] direcciones) {
		super(id, fechaCreacion, activo);
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direcciones = direcciones;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", fechaCreacion=" + fechaCreacion + ", activo=" + activo + ", documento="
				+ documento + ", nombre=" + nombre + ", apellido=" + apellido + ", direcciones="
				+ Arrays.toString(direcciones) + "]";
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion[] getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(Direccion[] direcciones) {
		this.direcciones = direcciones;
	}

	public void guardar() {
		System.out.println("Guardando Persona");
	}

}
