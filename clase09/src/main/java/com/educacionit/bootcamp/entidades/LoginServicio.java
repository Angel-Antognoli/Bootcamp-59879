package com.educacionit.bootcamp.entidades;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public final class LoginServicio {

	public static Map<UUID, Login> usuariosLogueados = new HashMap<>();//Mapas Concurrentes
	public static List<Usuario> usuarios = List.of(
			new Usuario("user1@gmail.com", "user1.1234", Set.of(new Rol(1L, "ADMIN"), new Rol(2L, "SUPER"))),
			new Usuario("user2@gmail.com", "user2.1234", Set.of(new Rol(1L, "ADMIN"))),
			new Usuario("user3@gmail.com", "user3.1234", Set.of(new Rol(1L, "SUPER"))));

	public static boolean crearLogin(String correo, String clave) {

		for (Usuario usuario : usuarios) {
			if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario.getClave().equals(clave)) {
				UUID uuid = UUID.randomUUID();
				Login login = new Login(uuid, LocalDateTime.now(), correo);
				usuariosLogueados.put(uuid, login);
				return true;
			}
		}
		return false;
	}

	public static boolean validarLogin(String uuid) {
		Login login = usuariosLogueados.get(UUID.fromString(uuid));

		if (login != null) {
			LocalDateTime fechaActual = LocalDateTime.now();
			System.out.println(login.getFechaCreacion());
			System.out.println(fechaActual);
			Long tiempoTranscurrido = ChronoUnit.MILLIS.between(login.getFechaCreacion(), fechaActual);
			System.out.println(tiempoTranscurrido);

			if (tiempoTranscurrido > Login.tiempoExpiracion) {
				usuariosLogueados.remove(UUID.fromString(uuid));
				return false;
			}
			login.setFechaCreacion(fechaActual);
			return true;
		}
		return false;
	}
}
