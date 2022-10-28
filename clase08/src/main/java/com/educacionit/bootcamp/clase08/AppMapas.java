package com.educacionit.bootcamp.clase08;

import java.util.HashMap;
import java.util.Map;

public class AppMapas {
	public static void main(String[] args) {
		
		// set HashMap --> unicos desordenados
		// LinkHashMap --> unicos y mostrador por insert
		// TreeHashMap --< unicos y ordenados segun Comparable o Comparator
		Map<Integer, String> nombres = new HashMap<>();
		nombres.put(1, "Octavio");
		nombres.put(2, "Analia");
		nombres.put(3, "Rafael");

		nombres.put(5, "rocio");
		nombres.put(4, "Sol");
		
		System.out.println(nombres);
		
		System.out.println(nombres.get(2));
		
		

	}
}
