package com.educacionit.bootcamp.clase08;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Vector;

import com.educacionit.bootcamp.eenumerados.TipoDocumento;
import com.educacionit.bootcamp.entidades.Documento;

public class AppColas {
	public static void main(String[] args) throws InterruptedException {
		
		// Queue<Documento> documentos = new ArrayDeque<>(); FIFO o  Filas/Colas

		// Deque<Documento> documentos = new ArrayDeque<>(); Pilas o LIFO
		Deque<Documento> documentos = new ArrayDeque<>(); 
		
		documentos.add(new Documento(TipoDocumento.DNI, "1"));
		documentos.add(new Documento(TipoDocumento.DNI, "2"));
		documentos.add(new Documento(TipoDocumento.PAS, "1"));
		documentos.add(new Documento(TipoDocumento.LE, "1"));
		documentos.add(new Documento(TipoDocumento.PAS, "3"));
		documentos.add(new Documento(TipoDocumento.CI, "1"));

		System.out.println(documentos);

		//Pila
		while (!documentos.isEmpty()) {
			// te voy a atender proximamente -> te devuelve el objeto
			System.out.println("Proximo en atender: " + documentos.peekLast());
			Thread.sleep(1500);
			// te estoy atendiendo -> te lo devuelve y te lo elimina
			System.out.println("Atendiendo: " + documentos.pollLast());
			Thread.sleep(1500);
		}
		
/* Trabajar como Cola o Fila exclusivamente
		while (!documentos.isEmpty()) {
			// te voy a atender proximamente -> te devuelve el objeto
			System.out.println("Proximo en atender: " + documentos.peek());
			Thread.sleep(1500);
			// te estoy atendiendo -> te lo devuelve y te lo elimina
			System.out.println("Atendiendo: " + documentos.poll());
			Thread.sleep(1500);
		}
*/
		System.out.println(documentos);

	}
}
