package com.educacionit.bootcamp.clase04;

import com.educacionit.bootcamp.entidades.Cliente;

public class AppEjemplo2 {
	public static void main(String[] args) {
		// throws delego en metodos a quien lo llame o utilice setFechaNacimiento 
		// throw yo genero el error 
		// try catch 
		
		Cliente cliente = new Cliente();
		//log.info(cliente);
		try {
			cliente.setFechaNacimiento(null);
		} catch (Exception e) {
			// archivo(e.getMessage - "");
			e.printStackTrace();
		}
		System.out.println("fin");
	}
}
