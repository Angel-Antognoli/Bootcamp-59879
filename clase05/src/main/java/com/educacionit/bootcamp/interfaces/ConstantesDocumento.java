package com.educacionit.bootcamp.interfaces;

public final class ConstantesDocumento {
	public static final String DNI = "DNI";
	public static final String DNI_DESCRIPCION = "Documento Nacional de Identidad";
	public static final String PATH_SERVICIO_BCRA = "/buscarCUIT";

	// para utilitarias --> Patrones de Diseño
	private ConstantesDocumento() {

	}

	public void prueba() {
		ConstantesDocumento constantesDocumento = new ConstantesDocumento();
	}

}
