package com.educacionit.bootcamp.entidades;

import java.time.LocalDateTime;
import java.util.UUID;

public class Login {
	public static final Long tiempoExpiracion = 15000L;// milisegundos
	private UUID identificador;
	private LocalDateTime fechaCreacion;
	private String correo;

	public Login() {
		super();
	}

	public Login(UUID identificador, LocalDateTime fechaCreacion, String correo) {
		super();
		this.identificador = identificador;
		this.fechaCreacion = fechaCreacion;
		this.correo = correo;
	}

	public UUID getIdentificador() {
		return identificador;
	}

	public void setIdentificador(UUID identificador) {
		this.identificador = identificador;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String toString() {
		return "Login [identificador=" + identificador + ", fechaCreacion=" + fechaCreacion + ", correo=" + correo
				+ "]";
	}

}
