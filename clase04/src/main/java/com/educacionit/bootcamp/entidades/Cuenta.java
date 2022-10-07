package com.educacionit.bootcamp.entidades;

import java.time.LocalDateTime;

// POJO
public class Cuenta extends Producto {
	private String tipo;
	private Float ganancia;

	public Cuenta() {
		super();
	}

	public Cuenta(Long numero, String banco, LocalDateTime fechaCreacion, String tipo, Float ganancia) {
		super(numero, banco, fechaCreacion);
		this.tipo = tipo;
		this.ganancia = ganancia;
	}

	public String toString() {
		return "Cuenta [numero=" + numero + ", banco=" + banco + ", fechaCreacion=" + fechaCreacion + ", tipo=" + tipo
				+ ", ganancia=" + ganancia + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Float getGanancia() {
		return ganancia;
	}

	public void setGanancia(Float ganancia) {
		this.ganancia = ganancia;
	}

	public boolean emitirPago(float monto, Long numero, String descripcion) {
		System.out.println("Pago Tarjeta  " + String.format("%.2f", monto) + " al numero "
				+ String.format("%010d", numero) + " y referencia : " + descripcion);
		return true;
	}

}
