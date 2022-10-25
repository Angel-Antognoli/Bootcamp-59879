package com.educacionit.bootcamp.entidades;

import com.educacionit.bootcamp.enumerados.TipoDocumento;

public final class Documento {
	private TipoDocumento tipoDocumento;
	private String numero;

	public Documento() {
		super();
	}

	public Documento(TipoDocumento tipoDocumento, String numero) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numero = numero;
	}

	public String toString() {
		return "Documento [" + tipoDocumento + " - " + numero + "]";
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
