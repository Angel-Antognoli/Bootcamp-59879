package com.educacionit.bootcamp.entidades;

import com.educacionit.bootcamp.enumerados.TipoProducto;
import com.educacionit.bootcamp.excepciones.ExcepcionProducto;

public class Inversion extends Producto {
	private Float ganancia;

	public Inversion() {
		super();
	}

	public Inversion(Short banco, Short sucursal, Short codigoPostal, TipoProducto tipoProducto, Float ganancia)
			throws ExcepcionProducto {
		super(banco, sucursal, codigoPostal, tipoProducto);
		this.ganancia = ganancia;
	}

	public String toString() {
		return "[" + tipoProducto + " : " + getNumeroProducto() + ", ganancia=" + ganancia + "]";
	}

	public Float getGanancia() {
		return ganancia;
	}

	public void setGanancia(Float ganancia) {
		this.ganancia = ganancia;
	}

}
