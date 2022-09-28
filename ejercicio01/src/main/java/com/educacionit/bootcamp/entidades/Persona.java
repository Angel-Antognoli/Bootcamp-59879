package com.educacionit.bootcamp.entidades;

public class Persona {
	private String tipoDocumento;
	private String numeroDocumento;
	private String nombre;
	private String apellido;
	private boolean activo;
	private byte edad;
	private String[] direcciones;

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
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

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public String[] getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(String[] direcciones) {
		this.direcciones = direcciones;
	}

}
