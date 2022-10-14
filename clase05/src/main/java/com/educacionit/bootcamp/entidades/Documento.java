package com.educacionit.bootcamp.entidades;

import com.educacionit.bootcamp.enumerados.TipoDocumento;

public final class Documento {
	private TipoDocumento tipoDocumento;
	private Integer numero;

	public Documento() {
		super();
	}

	public Documento(TipoDocumento tipoDocumento, Integer numero) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numero = numero;
	}

	public String toString() {
		return "Documento [tipoDocumento={" + tipoDocumento + " , " + tipoDocumento.getDescripcion() + "}, numero="
				+ String.format("%08d", numero) + "]";
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/*
	 * public void setTipo(String tipo) throws DocumentoExcepcion { boolean existe =
	 * false; for (int i = 0; i < Constantes.TIPOS_DOCUMENTOS.length; i++) { if
	 * (Constantes.TIPOS_DOCUMENTOS[i].equalsIgnoreCase(tipo)) { existe = true;
	 * break; } }
	 * 
	 * if (!existe) { throw new DocumentoExcepcion("El documento no es valido"); }
	 * 
	 * this.tipo = tipo.toUpperCase(); }
	 */

}
