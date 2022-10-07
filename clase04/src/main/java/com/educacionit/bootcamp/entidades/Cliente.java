package com.educacionit.bootcamp.entidades;

import java.time.LocalDate;
import java.util.Arrays;

public class Cliente {
	private Documento documento;
	private String nombreCompleto;
	private LocalDate fechaNacimiento;
	private Producto[] productos;

	public Cliente() {
		super();
	}

	public Cliente(Documento documento, String nombreCompleto, LocalDate fechaNacimiento, Producto[] productos) {
		super();
		this.documento = documento;
		this.nombreCompleto = nombreCompleto;
		this.fechaNacimiento = fechaNacimiento;
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Cliente [" + documento + ", nombreCompleto=" + nombreCompleto + ", fechaNacimiento=" + fechaNacimiento
				+ ", \n" + Arrays.toString(productos) + "]";
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Producto[] getProductos() {
		return productos;
	}

	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}

}
