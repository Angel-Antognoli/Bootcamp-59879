package com.educacionit.bootcamp.clase05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
// HashSet , List y Map
public class AppHashSetObjetosJava {
	public static void main(String[] args) {
		// recupera la informacion mas rapida que cualquier otra coleccion
		// no duplicados
		// no me importa el orden 
		Set<String> roles = new HashSet<>();
		// agregar elementos

		System.out.println(roles.add("GSUPERVISOR"));
		System.out.println(roles.add("GERENTE"));
		System.out.println(roles.add("ADMINISTRADOR"));
		System.out.println(roles);
		System.out.println(roles.add("administrador"));
		System.out.println(roles);

		Set<String> rolesBasicos = new HashSet<>();
		rolesBasicos.add("OPERADOR1");
		rolesBasicos.add("OPERADOR2");
		System.out.println(rolesBasicos);

		// agregar todos los elementos
		roles.addAll(rolesBasicos);
		System.out.println(roles);

		// limpiar la coleccion
		// rolesBasicos.clear();
		System.out.println(rolesBasicos);

		// PREGUNTAR SI CONTIENE UN OBJETO
		System.out.println("Roles contiene a OPERADOR1 ? " + roles.contains("OPERADOR1"));
		System.out.println("Roles contiene a OPERADOR3 ? " + roles.contains("OPERADOR3"));

		// PREGUNTAR SI CONTIENE UNA COLECCION COMPLETA DENTRO DE OTRA
		System.out.println("Roles contiene a RolesBasicos ? " + roles.containsAll(rolesBasicos));

		System.out.println("Esta vacia la coleccion ? " + roles.isEmpty());

		// ELIMINAR UN ELEMENTO
		System.out.println(roles.remove("administra"));
		System.out.println(roles);
		// ELIMINAR TODA UNA COLECCION QUE ESTE DENTRO DE OTRA
		System.out.println(roles.removeAll(rolesBasicos));
		System.out.println(roles);

		// RECORRER UNA COLECCION
		for (String rol : roles) {
			System.out.println(rol);
			if (rol.startsWith("G")) {
				//roles.remove(rol);
			}
		}
		System.out.println("Iteradores***************");
		
		// Creamos un iterador con los elementos de la coleccion
		
		Iterator<String> iterator  = roles.iterator();
		
		while(iterator.hasNext()) {
			String rolAuxiliar = iterator.next();
			if (rolAuxiliar.startsWith("G")) {
				iterator.remove();
			}
			
		}
		
		System.out.println(roles);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
