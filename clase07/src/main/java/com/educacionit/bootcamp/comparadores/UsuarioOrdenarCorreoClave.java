package com.educacionit.bootcamp.comparadores;

import java.util.Comparator;

import com.educacionit.bootcamp.entidades.Usuario;

public class UsuarioOrdenarCorreoClave implements Comparator<Usuario> {

	public int compare(Usuario usuario1, Usuario usuario2) {
		int correo = usuario1.getCorreo().compareTo(usuario2.getCorreo());
		
		if (correo == 0) {
			return usuario1.getClave().compareTo(usuario2.getClave());
		}
		

		return correo;
	}

}

/*

"user6@gmail.com", "5678"
"user5@gmail.com", "1234"
                               
"user5@gmail.com", "user1.1204"
"user6@gmail.com", "user1.1244"
"user1@gmail.com", "user1.1234"
*/