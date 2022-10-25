package com.educacionit.bootcamp.clase05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AppSetHashSetObjetosJava {
	public static void main(String[] args) {
		// recupera la informacion mas rapida que cualquier otra coleccion
		// no duplicados
		// no me importa el orden 
			Set<Integer> edades = new HashSet<>();
			edades.add(39);
			edades.add(5);
			edades.add(10);
			edades.add(12);
			edades.add(11);
			edades.add(7);
			
			System.out.println(edades);
			
			edades.remove(5);
			
			System.out.println(edades);
			
			Iterator<Integer> iterador = edades.iterator();
			
			System.out.println("*********************");
			while(iterador.hasNext()) {
				int edad = iterador.next();
				if (edad<15) {
					System.out.println("La edad " + edad + " es menor a 15");
					iterador.remove();
				}
			}
			
			System.out.println(edades);
			
			/*
			for (Integer edad : edades) {
				if (edad<15) {
					edades.remove(edad);
				}
			}*/
			
	}
}
