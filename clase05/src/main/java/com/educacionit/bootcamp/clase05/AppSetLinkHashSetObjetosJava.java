package com.educacionit.bootcamp.clase05;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class AppSetLinkHashSetObjetosJava {
	public static void main(String[] args) {
		
		// recupera la informacion mas rapida que cualquier otra coleccion
		// no duplicados
		// me importa el orden como los agregue 
		Set<String> roles = new LinkedHashSet<>();
		roles.add("ADMIN");
		roles.add("SUP");
		roles.add("GERENTE");
		roles.add("GERENTE");
		
		System.out.println(roles);
		
	}
		
		
}
