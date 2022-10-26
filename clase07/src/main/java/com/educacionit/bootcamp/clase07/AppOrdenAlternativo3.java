package com.educacionit.bootcamp.clase07;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.educacionit.bootcamp.comparadores.UsuarioOrdenarPorId;
import com.educacionit.bootcamp.comparadores.UsuarioOrdenarPorIdDesc;
import com.educacionit.bootcamp.entidades.Usuario;
import com.educacionit.bootcamp.enumerados.TipoUsuario;

public class AppOrdenAlternativo3 {
	public static void main(String[] args) {

		Set<Usuario> usuarios = new TreeSet<>(new UsuarioOrdenarPorFecha());// puedo tomar la fomra de cualquier de mis
																			// hijos
		usuarios.add(new Usuario(1, "user6@gmail.com", "user1.1234", LocalDate.parse("2000-10-01"), TipoUsuario.ADMIN));
		usuarios.add(new Usuario(3, "user5@gmail.com", "user1.1234", LocalDate.parse("2001-10-01"), TipoUsuario.ADMIN));

		usuarios.add(new Usuario(8, "user3@gmail.com", "user1.1234", LocalDate.parse("2003-10-01"), TipoUsuario.ADMIN));
		usuarios.add(new Usuario(7, "user4@gmail.com", "user1.1234", LocalDate.parse("2005-10-01"), TipoUsuario.ADMIN));
		usuarios.add(new Usuario(2, "user1@gmail.com", "user1.1234", LocalDate.parse("2005-08-01"), TipoUsuario.ADMIN));

		System.out.println("*****************************");
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}
	}
}

// clase interna
class UsuarioOrdenarPorFecha implements Comparator<Usuario> {

	public int compare(Usuario usuario1, Usuario usuario2) {

		return usuario1.getFechaCreacion().compareTo(usuario2.getFechaCreacion());
	}

}
