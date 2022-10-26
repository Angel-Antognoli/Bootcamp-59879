package com.educacionit.bootcamp.comparadores;

import java.util.Comparator;

import com.educacionit.bootcamp.entidades.Usuario;

public class UsuarioOrdenarPorIdDesc implements Comparator<Usuario> {

	public int compare(Usuario usuario1, Usuario usuario2) {

		return usuario2.getId() - usuario1.getId();
	}

}

// yo negativo primero
// si da cero somos iguales
// si da positivo yo despues
