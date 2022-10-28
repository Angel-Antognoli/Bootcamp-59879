package com.educacionit.bootcamp.clase08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.educacionit.bootcamp.eenumerados.TipoDocumento;
import com.educacionit.bootcamp.entidades.Documento;

public class AppListasObjetosPropios {
	public static void main(String[] args) {

		List<Documento> documentos = new ArrayList<>();
		Documento documento = new Documento(TipoDocumento.CUIL, "2");
		documentos.add(new Documento(TipoDocumento.DNI, "1"));
		documentos.add(new Documento(TipoDocumento.DNI, "2"));
		documentos.add(new Documento(TipoDocumento.PAS, "1"));
		documentos.add(new Documento(TipoDocumento.LE, "1"));
		documentos.add(new Documento(TipoDocumento.PAS, "3"));
		documentos.add(new Documento(TipoDocumento.CI, "1"));
		documentos.add(documento);
		imprimirColeccion(documentos);
		/*
		 * Comparator<Documento> ordenNumero = new Comparator<Documento>() {
		 * 
		 * public int compare(Documento documento1, Documento documento2) {
		 * 
		 * return documento1.getNumero().compareTo(documento2.getNumero()); } };
		 */
		Collections.sort(documentos, new Comparator<Documento>() {

			public int compare(Documento documento1, Documento documento2) {

				return documento2.getNumero().compareTo(documento1.getNumero());
			}
		});

		imprimirColeccion(documentos);

		documentos.sort(new Comparator<Documento>() {

			public int compare(Documento documento1, Documento documento2) {
				int tipo = documento1.getTipo().compareTo(documento2.getTipo());
				if (tipo == 0) {
					return documento1.getNumero().compareTo(documento2.getNumero());
				}
				return tipo;
			}
		});

		imprimirColeccion(documentos);

	}

	public static <E> void imprimirColeccion(List<E> lista) {
		System.out.println("*********************");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
}
