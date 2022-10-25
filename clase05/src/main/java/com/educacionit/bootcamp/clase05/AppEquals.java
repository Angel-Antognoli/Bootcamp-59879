package com.educacionit.bootcamp.clase05;

import com.educacionit.bootcamp.entidades.Documento;
import com.educacionit.bootcamp.enumerados.TipoDocumento;

public class AppEquals {
	public static void main(String[] args) {
		Documento documento1 = new Documento(TipoDocumento.DNI, 1);
		Documento documento2 = new Documento(TipoDocumento.DNI, 1);
		Documento documento3 = documento1;
		
		System.out.println(documento1.equals(documento2));
		System.out.println(documento1.equals(documento3));
		System.out.println(documento1);
		System.out.println(documento2);
		System.out.println(documento3);
		
		documento1.setTipoDocumento(TipoDocumento.PAS);
		documento2.setTipoDocumento(TipoDocumento.LE);
		System.out.println("********************");
		
		System.out.println(documento1);
		System.out.println(documento2);
		System.out.println(documento3);
		
		Documento documento4 = null;
		documento1.equals(documento4);
		
		
		
	}

}
