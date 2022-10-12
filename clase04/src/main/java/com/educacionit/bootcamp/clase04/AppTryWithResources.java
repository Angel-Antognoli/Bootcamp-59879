package com.educacionit.bootcamp.clase04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.educacionit.bootcamp.entidades.ArchivoBCRA;

public class AppTryWithResources {
	public static void main(String[] args) {

		try (ArchivoBCRA bcra = new ArchivoBCRA()) {
			bcra.setNombre("nombreBCRA");
		} catch (Exception e) {
			
		}
		
		
		

		// antes de la 1.7
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("octavio.txt");

		} catch (FileNotFoundException e) {
			// logueamos el error
			e.printStackTrace();
		} catch (Exception e) {
			// logueamos el error
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			//try ctah with resource
		try (FileOutputStream fos = new FileOutputStream("octavio.txt")) {

		} catch (FileNotFoundException e) {

		} catch (IOException e1) {

			e1.printStackTrace();
		}

	}
}
