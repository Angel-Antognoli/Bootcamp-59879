package com.educacionit.bootcamp.clase05;

import javax.swing.JOptionPane;

import com.educacionit.bootcamp.entidades.Alumno;
import com.educacionit.bootcamp.entidades.Documento;
import com.educacionit.bootcamp.enumerados.TipoDocumento;
import com.educacionit.bootcamp.excepciones.DocumentoExcepcion;
import com.educacionit.bootcamp.interfaces.Constantes;
import com.educacionit.bootcamp.interfaces.ConstantesDocumento;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Alumno alumno = new Alumno();
		/*
		 * Opcion 1 alumno.setDocumento(new Documento());
		 * alumno.getDocumento().setTipo("DNI"); alumno.getDocumento().setNumero(1);
		 */
		/*
		 * Opcion 2 Documento documento = new Documento(); documento.setTipo("PAS");
		 * documento.setNumero(2); alumno.setDocumento(documento);
		 */

		// opcion 3

		alumno.setDocumento(new Documento(TipoDocumento.DNI	, 1));
		JOptionPane.showMessageDialog(null, alumno);
		
		try {
			alumno.getDocumento().setTipoDocumento(TipoDocumento.valueOf("PAS"));
		} catch (Exception e) {
			
		}
		
		JOptionPane.showMessageDialog(null, alumno);
		

	}
}
