package com.educacionit.bootcamp.entidades;

// Telefono cod y nun  String int
// direccion  String String
// Documento String Long

public class GenericoDosDatos<V1, V2> {
	private V1 dato1;
	private V2 dato2;
//	private V2 dato3;

	public GenericoDosDatos() {
		super();
	}

	public GenericoDosDatos(V1 dato1, V2 dato2) {
		super();
		this.dato1 = dato1;
		this.dato2 = dato2;
	}

	public V1 getDato1() {
		return dato1;
	}

	public void setDato1(V1 dato1) {
		this.dato1 = dato1;
	}

	public V2 getDato2() {
		return dato2;
	}

	public void setDato2(V2 dato2) {
		this.dato2 = dato2;
	}

}

// private GenericoDosDatos<String,Integer> telefono;
// setTelefono("+54",);
