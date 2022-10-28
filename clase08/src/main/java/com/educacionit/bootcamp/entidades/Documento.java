package com.educacionit.bootcamp.entidades;

import java.util.Objects;

import com.educacionit.bootcamp.eenumerados.TipoDocumento;

public class Documento {
	private TipoDocumento tipo;
	private String numero;

	public Documento() {
		super();
	}

	public Documento(TipoDocumento tipo, String numero) {
		super();
		this.tipo = tipo;
		this.numero = numero;
	}

	public String toString() {
		return "Documento [" + tipo + " - " + numero + "]";
	}

	public int hashCode() {
		return Objects.hash(numero, tipo);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Documento other = (Documento) obj;
		return Objects.equals(numero, other.numero) && tipo == other.tipo;
	}

	public TipoDocumento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDocumento tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
