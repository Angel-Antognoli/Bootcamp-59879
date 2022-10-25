package com.educacionit.bootcamp.entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.educacionit.bootcamp.enumerados.TipoCliente;

public class Cliente {
	private Documento documento;
	private String razonSocial;
	private String telefono1;
	private String telefono2;
	private LinkedHashSet<Direccion> direcciones;
	private TipoCliente tipoCliente;
	private LocalDate fechaNacimiento;
	private LocalDateTime fechaCreacion;
	private Boolean activo;
	private TreeSet<Producto> productos;

	public Cliente() {
		super();
	}

	public Cliente(Documento documento, String razonSocial, String telefono1, String telefono2,
			LinkedHashSet<Direccion> direcciones, TipoCliente tipoCliente, LocalDate fechaNacimiento,
			LocalDateTime fechaCreacion, Boolean activo, TreeSet<Producto> productos) {
		super();
		this.documento = documento;
		this.razonSocial = razonSocial;
		this.telefono1 = telefono1;
		this.telefono2 = telefono2;
		this.direcciones = direcciones;
		this.tipoCliente = tipoCliente;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaCreacion = fechaCreacion;
		this.activo = activo;
		this.productos = productos;
	}

	public String toString() {
		return "Cliente [" + documento + ", " + razonSocial + ", telefono1=" + telefono1 + ", telefono2=" + telefono2
				+ ", direcciones=" + direcciones + ", tipoCliente=" + tipoCliente + ", fechaNacimiento="
				+ fechaNacimiento + ", fechaCreacion=" + fechaCreacion + ", activo=" + activo + "] \n"
				+ getProductosCadena();
	}

	public String getProductosCadena() {
		String cadenaProductos = "";
		for (Producto producto : productos) {
			cadenaProductos += producto.toString() + "\n";
		}
		return cadenaProductos;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getTelefono1() {
		return telefono1;
	}

	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}

	public String getTelefono2() {
		return telefono2;
	}

	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}

	public LinkedHashSet<Direccion> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(LinkedHashSet<Direccion> direcciones) {
		this.direcciones = direcciones;
	}

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public TreeSet<Producto> getProductos() {
		return productos;
	}

	public void setProductos(TreeSet<Producto> productos) {
		this.productos = productos;
	}

}
