package com.educacionit.bootcamp.entidades;

import java.time.LocalDate;

// ?
public class Cliente extends Persona {

	public Cliente() {
		super();

	}

	public Cliente(Documento documento, String razonSocial, LocalDate fechaNacimiento, Boolean activo) {
		super(documento, razonSocial, fechaNacimiento, activo);

	}

}
