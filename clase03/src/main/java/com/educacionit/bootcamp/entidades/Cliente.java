package com.educacionit.bootcamp.entidades;

import com.educacionit.bootcamp.interfaces.Archivo;
import com.educacionit.bootcamp.interfaces.Imprimir;

public class Cliente extends Persona implements Archivo, Imprimir {

	public boolean guardar() {

		return false;
	}

	public void insertar() {

	}

	public void generarPdf() {
		// TODO Auto-generated method stub

	}


	public void generarTxt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void generarExcel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generarWord() {
		// TODO Auto-generated method stub
		
	}

}
