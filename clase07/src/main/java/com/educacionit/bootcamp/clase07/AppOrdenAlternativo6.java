package com.educacionit.bootcamp.clase07;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.educacionit.bootcamp.comparadores.UsuarioOrdenarCorreoClave;
import com.educacionit.bootcamp.comparadores.UsuarioOrdenarPorId;
import com.educacionit.bootcamp.entidades.Usuario;
import com.educacionit.bootcamp.enumerados.TipoUsuario;

public class AppOrdenAlternativo6 {
	public static void main(String[] args) {
		
		//	ADMIN GERENTE OPERADOR SUP;
		
		Comparator<Usuario> compararTipoUsuario = new Comparator<Usuario>() {
			
			public int compare(Usuario usuario1, Usuario usuario2) {

				return usuario1.getTipoUsuario().toString().compareTo(usuario2.getTipoUsuario().toString());
			}
		};

		Set<Usuario> usuarios = new TreeSet<>(compararTipoUsuario);
		usuarios.add(new Usuario(1, "user6@gmail.com", "user1.1224", LocalDate.parse("2000-10-01"), TipoUsuario.ADMIN));
		usuarios.add(new Usuario(3, "user5@gmail.com", "user1.1264", LocalDate.parse("2001-10-01"), TipoUsuario.SUP));

		usuarios.add(new Usuario(8, "user5@gmail.com", "user1.1204", LocalDate.parse("2003-10-01"), TipoUsuario.OPERADOR));
		usuarios.add(new Usuario(7, "user6@gmail.com", "user1.1244", LocalDate.parse("2005-10-01"), TipoUsuario.GERENTE));
		usuarios.add(new Usuario(2, "user1@gmail.com", "user1.1234", LocalDate.parse("2005-08-01"), TipoUsuario.ADMIN));

		System.out.println("*****************************");
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}
	}
}
