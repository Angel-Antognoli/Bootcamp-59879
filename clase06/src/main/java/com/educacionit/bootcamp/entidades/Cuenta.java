package com.educacionit.bootcamp.entidades;

import com.educacionit.bootcamp.enumerados.TipoProducto;
import com.educacionit.bootcamp.excepciones.ExcepcionProducto;

// proyecto lombok
// generaGetters y Setters
public class Cuenta extends Producto {
	private Double saldo;

	public Cuenta() {
		super();
	}

	public Cuenta(Short banco, Short sucursal, Short codigoPostal, TipoProducto tipoProducto, Double saldo)
			throws ExcepcionProducto {
		super(banco, sucursal, codigoPostal, tipoProducto);
		this.saldo = saldo;
	}

	public String toString() {
		return "[" + tipoProducto + " : " + getNumeroProducto() + ", saldo=" + String.format("%.4f", saldo) + "]";
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
