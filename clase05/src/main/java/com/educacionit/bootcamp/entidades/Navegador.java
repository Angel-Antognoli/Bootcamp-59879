package com.educacionit.bootcamp.entidades;

import com.educacionit.bootcamp.interfaces.INombre;

public class Navegador implements INombre{

	@Override
	public String nombre() {
		
		return "yo soy un navegador";
	}

}
