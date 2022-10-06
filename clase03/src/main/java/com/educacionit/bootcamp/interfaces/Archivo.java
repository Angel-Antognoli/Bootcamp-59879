package com.educacionit.bootcamp.interfaces;

// clase totalmente abstracta
// que solo posee metodos abstractos
public interface Archivo {

	// Java 7 o anterior
	boolean guardar();

	void insertar();

	// metodo generico para todos los que implementen archivo
	// desde java 8
	default Object buscar() {
		System.out.println("busco el objeto");
		return new Object();
	}

	static String listarDirectorio(String path) {
		return "lista de elementos";
	}
}
