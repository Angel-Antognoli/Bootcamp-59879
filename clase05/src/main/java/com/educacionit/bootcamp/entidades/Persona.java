package com.educacionit.bootcamp.entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Persona {
	protected Documento documento;
	protected String nombreCompleto;
	protected LocalDate fechaNacimiento;
	protected Boolean activo;
	protected LocalDateTime fechaCreacion;

	public Persona() {
		super();
	}

	public Persona(Documento documento, String nombreCompleto, LocalDate fechaNacimiento, Boolean activo,
			LocalDateTime fechaCreacion) {
		super();
		this.documento = documento;
		this.nombreCompleto = nombreCompleto;
		this.fechaNacimiento = fechaNacimiento;
		this.activo = activo;
		this.fechaCreacion = fechaCreacion;
	}

	public String toString() {
		return "Persona [" + documento + ", nombreCompleto=" + nombreCompleto + ", fechaNacimiento=" + fechaNacimiento
				+ ", activo=" + activo + ", fechaCreacion=" + fechaCreacion + "]";
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

}
