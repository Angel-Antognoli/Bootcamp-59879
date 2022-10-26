package com.educacionit.bootcamp.clase07;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.educacionit.bootcamp.entidades.Documento;

public class AppOrdenDocumento {
	public static void main(String[] args) {

		// PAS - DNI 1 - 0 = 1

		// DNI PAS LE CI
		// NUMERO DESC
		Set<Documento> documentos = new TreeSet<>(new DocumentoOrdenTipoEspecial());
		documentos.add(new Documento("DNI", "1"));
		documentos.add(new Documento("DNI", "3"));
		documentos.add(new Documento("LE", "1"));
		documentos.add(new Documento("PAS", "5"));
		documentos.add(new Documento("PAS", "4"));
		documentos.add(new Documento("CI", "1"));
		documentos.add(new Documento("DNI", "5"));

		for (Documento documento : documentos) {
			System.out.println(documento);
		}

	}
}

class DocumentoOrdenTipoEspecial implements Comparator<Documento> {

	public int compare(Documento documento1, Documento documento2) {
		int tipo = indiceDocumento(documento1.getTipo()) - indiceDocumento(documento2.getTipo());
		if (tipo == 0) {
			return documento2.getNumero().compareTo(documento1.getNumero());
		}
		return tipo;
	}

	private int indiceDocumento(String tipo) {
		String[] documentosOrden = { "DNI", "PAS", "LE", "CI" };

		for (int i = 0; i < documentosOrden.length; i++) {
			if (documentosOrden[i].equals(tipo)) {
				return i;
			}
		}

		return documentosOrden.length;
	}

}
