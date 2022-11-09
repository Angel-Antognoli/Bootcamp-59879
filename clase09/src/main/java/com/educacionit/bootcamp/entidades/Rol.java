package com.educacionit.bootcamp.entidades;

public class Rol {
	private Long id;
	private String descripcion;

	public Rol() {
		super();
	}

	public Rol(Long id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}

	public String toString() {
		return "Rol [id=" + id + ", descripcion=" + descripcion + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
