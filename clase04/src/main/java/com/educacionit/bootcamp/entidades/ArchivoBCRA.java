package com.educacionit.bootcamp.entidades;

// archivo que me exigen
public class ArchivoBCRA implements AutoCloseable{
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void close() throws Exception {
		System.out.println("cerrar la conexion con el BCRA");
		if ("nombreBCRA" == nombre) {
				throw new Exception("Los nombres no coinciden");
		}
	}
}
