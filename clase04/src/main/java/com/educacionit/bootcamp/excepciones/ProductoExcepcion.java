package com.educacionit.bootcamp.excepciones;

// verificado
public class ProductoExcepcion extends Exception {

	private static final long serialVersionUID = 4L;
	private int nivel;
	private String mensaje;

	public ProductoExcepcion(String message) {
		super(message);
		mensaje = message;
	}

	public ProductoExcepcion(String message, int nivel) {
		super(message);
		mensaje = message;
		this.nivel = nivel;
	}

	public int getNivel() {
		return nivel;
	}

	@Override
	public String getMessage() {

		switch (nivel) {
		case 1:
			return mensaje + " | WARNING";
		case 2:
			return mensaje + " | ERROR";
		default:
			break;
		}
		return super.getMessage();
	}

}
