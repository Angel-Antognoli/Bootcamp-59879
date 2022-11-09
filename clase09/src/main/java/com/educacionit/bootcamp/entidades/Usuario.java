package com.educacionit.bootcamp.entidades;

import java.util.Set;

public class Usuario {
	private String correo;
	private String clave;
	private Set<Rol> roles;

	public Usuario() {
		super();
	}

	public Usuario(String correo, String clave, Set<Rol> roles) {
		super();
		this.correo = correo;
		this.clave = clave;
		this.roles = roles;
	}

	public String toString() {
		return "Usuario [correo=" + correo + ", clave=" + clave + ", roles=" + roles + "]";
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

	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}

}
