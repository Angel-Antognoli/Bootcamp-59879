package com.educacionit.bootcamp.clase08;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		List<String> nombres = new ArrayList<>();
		nombres.add("Andrea");
		nombres.add("Octavio");
		nombres.add("Carlos");
		nombres.add("Angel");
		nombres.add("Nahuel");
		nombres.add("Melisa");
		nombres.add("Nahuel");

		imprimirColeccion(nombres);
		nombres.add(3, "Luciano");
		imprimirColeccion(nombres);
		nombres.set(4, "Pedro");
		imprimirColeccion(nombres);
		System.out.println(nombres.indexOf("Nahuel"));
		System.out.println(nombres.lastIndexOf("Nahuel"));
		
		System.out.println(nombres.subList(4, 6));

		ListIterator<String> it = nombres.listIterator();
		imprimirColeccion(nombres);
		while (it.hasNext()) {
			String nombre = it.next();
			System.out.println(it.nextIndex());
			if (nombre.startsWith("A")) {
				it.remove();
			}
		}
		imprimirColeccion(nombres);

		while (it.hasPrevious()) {
			
			String nombre = it.previous();
			System.out.println(it.previousIndex());
			if (nombre.endsWith("o")) {
				it.remove();
			}
		}

		/*
		 * 
		 * List<String> nombresAEliminar = new ArrayList<>();
		 * 
		 * for (int i = 0; i < nombres.size(); i++) { if (nombres.get(i).contains("e"))
		 * { System.out.println("Procedo a eliminar a " + nombres.get(i) +
		 * " que se encuentra en el indice " + i); nombresAEliminar.add(nombres.get(i));
		 * } }
		 * 
		 * nombres.removeAll(nombresAEliminar);
		 */

		imprimirColeccion(nombres);
		


	}

	public static <E> void imprimirColeccion(List<E> lista) {
		System.out.println("*********************");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}

}
