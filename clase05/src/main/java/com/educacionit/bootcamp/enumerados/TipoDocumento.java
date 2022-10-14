package com.educacionit.bootcamp.enumerados;

// ERROR("Contacte al administrador", "red")
public enum TipoDocumento {
	DNI("Documento Nacional de Identidad"), LE("Libreta de Enrolamiento"), PAS("Pasaporte"), CUIT("CUIT"), CUIL("CUIL");

	private String descripcion;

	// new DNI();
	private TipoDocumento(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

}
