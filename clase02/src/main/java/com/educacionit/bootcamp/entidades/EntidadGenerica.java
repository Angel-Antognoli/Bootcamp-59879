package com.educacionit.bootcamp.entidades;

import java.time.LocalDateTime;

public class EntidadGenerica {
	protected long id;
	protected LocalDateTime fechaCreacion;
	protected boolean activo;

	public EntidadGenerica() {

	}

	public EntidadGenerica(long id, LocalDateTime fechaCreacion, boolean activo) {
		this.id = id;
		this.fechaCreacion = fechaCreacion;
		this.activo = activo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public void guardar() {
		System.out.println("Guardando Entidad Generica...");
	}

	public final void mostrarAtributos() {
		System.out.println("mostrando mis atributos -->" + id);
	}

	@Override
	public String toString() {
		return "EntidadGenerica [id=" + id + ", fechaCreacion=" + fechaCreacion + ", activo=" + activo + "]";
	}

}
