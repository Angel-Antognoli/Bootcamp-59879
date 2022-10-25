package com.educacionit.bootcamp.clase05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.educacionit.bootcamp.entidades.Alumno;
import com.educacionit.bootcamp.entidades.Documento;
import com.educacionit.bootcamp.enumerados.TipoDocumento;

public class AppSetHashSetObjetosPropios {
	public static void main(String[] args) {
		Documento documento1 = new Documento(TipoDocumento.DNI, 1);
		Documento documento2 = new Documento(TipoDocumento.DNI,2);
		
		System.out.println(documento1.compareTo(documento2));
		
		Set<Documento> documentos = new TreeSet<Documento>();
		documentos.add(new Documento(TipoDocumento.DNI, 1));
	
		documentos.add(new Documento(TipoDocumento.DNI, 3));
		documentos.add(new Documento(TipoDocumento.DNI, 2));
		
		for (Documento documento : documentos) {
			System.out.println(documento);
		}
	}
}
