package com.educacionit.bootcamp.entidades;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Persona {
	protected Documento documento;
	protected String razonSocial;
	protected LocalDate fechaNacimiento;
	protected Boolean activo;

	public Persona() {
		super();
	}

	public Persona(Documento documento, String razonSocial, LocalDate fechaNacimiento, Boolean activo) {
		super();
		this.documento = documento;
		this.razonSocial = razonSocial;
		this.fechaNacimiento = fechaNacimiento;
		this.activo = activo;
	}

	public int hashCode() {
		return Objects.hash(documento);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(documento, other.documento);
	}

	public String toString() {
		return "Persona [" + documento + ", razonSocial=" + razonSocial + ", fechaNacimiento=" + fechaNacimiento
				+ ", activo=" + activo + "]";
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
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

}
