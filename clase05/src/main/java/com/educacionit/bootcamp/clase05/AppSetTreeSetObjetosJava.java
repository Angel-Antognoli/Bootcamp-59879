package com.educacionit.bootcamp.clase05;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AppSetTreeSetObjetosJava {
	public static void main(String[] args) {
		// recupera la informacion mas rapida que cualquier otra coleccion
		// no duplicados
		// me importa un orden Lexicograficamente
		// natural asc a-z -inf + inf
		Set<String> roles = new TreeSet<>();
		roles.add("A");
		roles.add("Z");
		roles.add("F");
		roles.add("F");
		roles.add("E");
		System.out.println(roles);
	}
}
