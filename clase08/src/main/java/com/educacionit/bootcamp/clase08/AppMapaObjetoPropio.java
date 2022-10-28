package com.educacionit.bootcamp.clase08;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.educacionit.bootcamp.eenumerados.TipoDocumento;
import com.educacionit.bootcamp.entidades.Cliente;
import com.educacionit.bootcamp.entidades.Documento;

public class AppMapaObjetoPropio {
	public static void main(String[] args) {
		Map<Documento, Cliente> clientes = new HashMap<>();

		clientes.put(new Documento(TipoDocumento.DNI, "1"),
				new Cliente(new Documento(TipoDocumento.DNI, "1"), "Octavio", LocalDate.parse("1983-03-15"), true));

		clientes.put(new Documento(TipoDocumento.DNI, "2"),
				new Cliente(new Documento(TipoDocumento.DNI, "2"), "Rafael", LocalDate.parse("1988-03-15"), false));

		clientes.put(new Documento(TipoDocumento.DNI, "3"),
				new Cliente(new Documento(TipoDocumento.DNI, "3"), "Analia", LocalDate.parse("1989-03-15"), true));
		
		
		System.out.println(clientes.get(new Documento(TipoDocumento.DNI, "2") ));
		
		

	}
}
