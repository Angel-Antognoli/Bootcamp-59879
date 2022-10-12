package com.educacionit.bootcamp.entidades;

import java.time.LocalDateTime;

import com.educacionit.bootcamp.excepciones.ProductoExcepcion;
import com.educacionit.bootcamp.interfaces.Pago;

public abstract class Producto implements Pago {
	protected Long numero;
	protected String banco;
	protected LocalDateTime fechaCreacion;

	public Producto() {
		super();
	}

	public Producto(Long numero, String banco, LocalDateTime fechaCreacion) {
		super();
		this.numero = numero;
		this.banco = banco;
		this.fechaCreacion = fechaCreacion;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) throws ProductoExcepcion {
		if (numero < 0) {
			throw new ProductoExcepcion("Debe ser un numero valido, mayor a cero",1);
		} else if (numero == 0) {
			throw new ProductoExcepcion("No puede ser cero", 2);
		}
		this.numero = numero;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

}
