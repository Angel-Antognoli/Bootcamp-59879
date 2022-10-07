package com.educacionit.bootcamp.entidades;

public final class Documento {
	private String tipo;
	private Long numero;

	public Documento() {
		super();
	}

	public Documento(String tipo, Long numero) {
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

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

}
