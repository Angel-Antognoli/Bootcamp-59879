package com.educacionit.bootcamp.entidades;

import java.time.LocalDate;
import java.util.Objects;

import com.educacionit.bootcamp.enumerados.TipoUsuario;

public class Usuario implements Comparable<Usuario> {
	private int id;
	private String correo;
	private String clave;
	private LocalDate fechaCreacion;
	private TipoUsuario tipoUsuario;

	public Usuario() {
		super();
	}

	public Usuario(int id, String correo, String clave, LocalDate fechaCreacion, TipoUsuario tipoUsuario) {
		super();
		this.id = id;
		this.correo = correo;
		this.clave = clave;
		this.fechaCreacion = fechaCreacion;
		this.tipoUsuario = tipoUsuario;
	}

	public String toString() {
		return "Usuario [id=" + id + ", correo=" + correo + ", clave=" + clave + ", fechaCreacion=" + fechaCreacion
				+ ", tipoUsuario=" + tipoUsuario + "]";
	}

	public int hashCode() {
		return Objects.hash(correo);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(correo, other.correo);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	// natural o por defecto
	public int compareTo(Usuario otroUsuario) {
		int comparacion = this.correo.compareTo(otroUsuario.correo);
		System.out.println("yo: " + this);
		System.out.println("Otro: " + otroUsuario);
		System.out.println(comparacion);
		return comparacion;
	}

}
