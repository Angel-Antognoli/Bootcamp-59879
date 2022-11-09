package com.educacionit.bootcamp.clase09;

import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

import com.educacionit.bootcamp.entidades.Login;
import com.educacionit.bootcamp.entidades.LoginServicio;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(LoginServicio.usuariosLogueados);
		System.out.println(LoginServicio.crearLogin("oct", "1234"));
		System.out.println(LoginServicio.usuariosLogueados);
		System.out.println(LoginServicio.crearLogin("user1@gmail.com", "1234"));
		System.out.println(LoginServicio.usuariosLogueados);
		System.out.println(LoginServicio.crearLogin("user1@gmail.com", "user1.1234"));
		System.out.println(LoginServicio.usuariosLogueados);
		System.out.println(LoginServicio.crearLogin("user2@gmail.com", "user2.1234"));
		System.out.println(LoginServicio.usuariosLogueados);

		//String uuidUsuario = JOptionPane.showInputDialog("Ingresa el Identificador Unico:");
		// Thread.sleep(10000);

	//	System.out.println(LoginServicio.validarLogin(uuidUsuario));
		System.out.println(LoginServicio.usuariosLogueados);
		
		System.out.println(LoginServicio.usuariosLogueados.entrySet());
		//Map<UUID, Login>
		for ( Entry<UUID, Login>  entrySet :     LoginServicio.usuariosLogueados.entrySet()) {
			
			System.out.println(entrySet.getKey());
			System.out.println(entrySet.getValue());
			if (entrySet.getValue().getCorreo().equals("user2@gmail.com")) {
				System.out.println("Existe un login con el correo user2@gmail.com");
			}
			
		}
		Set<UUID> uuidsLogueados = LoginServicio.usuariosLogueados.keySet();
		System.out.println(uuidsLogueados);
		

	}
}
