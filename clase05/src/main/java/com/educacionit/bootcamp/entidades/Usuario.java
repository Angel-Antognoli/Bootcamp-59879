package com.educacionit.bootcamp.entidades;

import java.time.LocalDate;
import java.util.Objects;

public class Usuario implements Comparable<Usuario> {
	private Integer id;
	private String desccripcion;
	private LocalDate fechaExpiracion;

	public Usuario() {
		super();
	}

	public Usuario(Integer id, String desccripcion, LocalDate fechaExpiracion) {
		super();
		this.id = id;
		this.desccripcion = desccripcion;
		this.fechaExpiracion = fechaExpiracion;
	}

	public String toString() {
		return "Usuario [id=" + id + ", desccripcion=" + desccripcion + ", fechaExpiracion=" + fechaExpiracion + "]";
	}

	public int hashCode() {
		return Objects.hash(desccripcion, id);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(desccripcion, other.desccripcion) && id == other.id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesccripcion() {
		return desccripcion;
	}

	public void setDesccripcion(String desccripcion) {
		this.desccripcion = desccripcion;
	}

	public LocalDate getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setFechaExpiracion(LocalDate fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	// si es negativo this, yo -> primero
	// si es cero misma pos
	// si es positiva el otro primero
	public int compareTo(Usuario otroUsuario) {
		System.out.println("ejecutandome");
		int comparoDescripcion = this.desccripcion.compareTo(otroUsuario.desccripcion);
		if (comparoDescripcion == 0) {
			return otroUsuario.id.compareTo(this.id);
		}
		
		return comparoDescripcion;
	}

}
