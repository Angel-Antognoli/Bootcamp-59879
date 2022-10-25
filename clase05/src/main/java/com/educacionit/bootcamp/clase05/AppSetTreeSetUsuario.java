package com.educacionit.bootcamp.clase05;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.educacionit.bootcamp.entidades.Usuario;

public class AppSetTreeSetUsuario {
	public static void main(String[] args) {
		Set<Usuario> usuarios = new TreeSet<>();
		
		System.out.println(usuarios);
		
		usuarios.add(new Usuario(1, "user5", LocalDate.parse("2022-01-01")));
		System.out.println("*************");
		usuarios.add(new Usuario(3, "user2", LocalDate.parse("2022-02-01")));
		System.out.println("*************");
		usuarios.add(new Usuario(4, "user2", LocalDate.parse("2022-03-01")));
		System.out.println("*************");
		usuarios.add(new Usuario(5, "user4", LocalDate.parse("2022-01-15")));
		System.out.println("*************");
		usuarios.add(new Usuario(5, "user4", LocalDate.parse("2022-01-15")));
		
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}
	}
}
