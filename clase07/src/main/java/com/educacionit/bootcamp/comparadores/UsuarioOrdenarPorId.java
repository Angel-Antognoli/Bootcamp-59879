package com.educacionit.bootcamp.comparadores;

import java.util.Comparator;

import com.educacionit.bootcamp.entidades.Usuario;

public class UsuarioOrdenarPorId implements Comparator<Usuario> {

	public int compare(Usuario usuario1, Usuario usuario2) {
		// usuario1 -> this
		// usuario2 -> otroUsuario
		return usuario1.getId() - usuario2.getId();
	}

}
