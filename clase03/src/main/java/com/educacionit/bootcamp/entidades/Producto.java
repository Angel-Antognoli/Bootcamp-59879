package com.educacionit.bootcamp.entidades;

import com.educacionit.bootcamp.interfaces.Archivo;
import com.educacionit.bootcamp.interfaces.Office;

public abstract class Producto extends Object implements Archivo, Office {
	protected String banco;
	protected int sucursal;
	protected int numero;
	private static int contador = 0;

	public Producto() {
		super();
		contador++;
		numero = contador;
	}

	public Producto(String banco, int sucursal, int numero) {
		super();
		this.banco = banco;
		this.sucursal = sucursal;
		this.numero = numero;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getSucursal() {
		return sucursal;
	}

	public void setSucursal(int sucursal) {
		this.sucursal = sucursal;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	// modificador de acceso
	// tipo de retorno
	// identificador
	// parametros
	public abstract boolean asignar(); // no posee cuerpo
}
