package com.educacionit.bootcamp.entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;

import com.educacionit.bootcamp.excepciones.ClienteException;
// Spring
// JSF - la creacion de Clases deberian implementar serializable
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	private Documento documento;
	private String nombreCompleto;
	private LocalDate fechaNacimiento;
	private Producto[] productos;

	public Cliente() {
		super();
	}

	public Cliente(Documento documento, String nombreCompleto, LocalDate fechaNacimiento, Producto[] productos) throws Exception {
		super();
		this.documento = documento;
		this.nombreCompleto = nombreCompleto;
		setFechaNacimiento(fechaNacimiento);
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

	public void setFechaNacimiento(LocalDate fechaNacimiento) throws Exception {
		if (fechaNacimiento == null) {
			throw new Exception("No puedes enviar null");
		}

		if (fechaNacimiento.isAfter(LocalDate.now())) {
			// ocurre el error
			throw new Exception("La fecha " + fechaNacimiento + " es mayor " + LocalDate.now());
		}
		
		

		this.fechaNacimiento = fechaNacimiento;
	}

	public Producto[] getProductos() {
		return productos;
	}

	public void setProductos(Producto[] productos) {
		if (productos == null) {
			throw new ClienteException("No puedes enviar null en los productos");
		}
		
		this.productos = productos;
	}
	

}
