package com.educacionit.bootcamp.excepciones;

public class ServicioExcepcion extends Exception {

	private static final long serialVersionUID = 1L;

	public ServicioExcepcion() {
		super();

	}

	public ServicioExcepcion(String message, Throwable cause) {
		super(message, cause);

	}

	public ServicioExcepcion(String message) {
		super(message);

	}

}
