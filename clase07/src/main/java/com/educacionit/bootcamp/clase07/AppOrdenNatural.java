package com.educacionit.bootcamp.clase07;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

import com.educacionit.bootcamp.entidades.Usuario;
import com.educacionit.bootcamp.enumerados.TipoUsuario;

/**
 * Hello world!
 *
 */
public class AppOrdenNatural {
	public static void main(String[] args) {
		Set<Usuario> usuarios = new TreeSet<>();
		usuarios.add(new Usuario(1, "user6@gmail.com", "user1.1234", LocalDate.parse("2000-10-01"), TipoUsuario.ADMIN));
		usuarios.add(new Usuario(3, "user5@gmail.com", "user1.1234", LocalDate.parse("2000-10-01"), TipoUsuario.ADMIN));

		usuarios.add(new Usuario(8, "user3@gmail.com", "user1.1234", LocalDate.parse("2000-10-01"), TipoUsuario.ADMIN));
		usuarios.add(new Usuario(7, "user4@gmail.com", "user1.1234", LocalDate.parse("2000-10-01"), TipoUsuario.ADMIN));
		usuarios.add(new Usuario(1, "user1@gmail.com", "user1.1234", LocalDate.parse("2000-10-01"), TipoUsuario.ADMIN));

		System.out.println("*****************************");
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}
	}
}
