package com.educacionit.bootcamp.entidades;

import java.util.Objects;

public final class Documento implements Comparable<Documento> {
	private String tipo;
	private String numero;

	public Documento() {
		super();
	}

	public Documento(String tipo, String numero) {
		super();
		this.tipo = tipo;
		this.numero = numero;
	}

	public String toString() {
		return "Documento [tipo=" + tipo + ", numero=" + numero + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
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
		return Objects.equals(numero, other.numero) && Objects.equals(tipo, other.tipo);
	}

	public int compareTo(Documento otroDocumento) {
		int tipo = this.tipo.compareTo(otroDocumento.tipo);
		if (tipo == 0) {
			return this.numero.compareTo(otroDocumento.numero);
		}
		return tipo;
	}

}
