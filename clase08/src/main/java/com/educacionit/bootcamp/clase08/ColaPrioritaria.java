package com.educacionit.bootcamp.clase08;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import com.educacionit.bootcamp.eenumerados.TipoDocumento;
import com.educacionit.bootcamp.entidades.Documento;

public class ColaPrioritaria {
	public static void main(String[] args) throws InterruptedException {
		Queue<Documento> documentos = new PriorityQueue<>(new Comparator<Documento>() {
			public int compare(Documento o1, Documento o2) {
				return o2.getNumero().compareTo(o1.getNumero());
			}
		});

		documentos.add(new Documento(TipoDocumento.DNI, "1"));
		documentos.add(new Documento(TipoDocumento.DNI, "2"));
		documentos.add(new Documento(TipoDocumento.PAS, "1"));
		documentos.add(new Documento(TipoDocumento.LE, "1"));
		documentos.add(new Documento(TipoDocumento.PAS, "3"));
		documentos.add(new Documento(TipoDocumento.CI, "1"));

		System.out.println(documentos);
		while (!documentos.isEmpty()) {
			// te voy a atender proximamente -> te devuelve el objeto
			System.out.println("Proximo en atender: " + documentos.peek());
			Thread.sleep(1500);
			// te estoy atendiendo -> te lo devuelve y te lo elimina
			System.out.println("Atendiendo: " + documentos.poll());
			Thread.sleep(1500);
		}

		System.out.println(documentos);
		
		

	}
}
