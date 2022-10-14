package com.educacionit.bootcamp.interfaces;

import com.educacionit.bootcamp.entidades.Persona;

public interface EnviarMail<E extends Persona> {
	boolean enviarMail(String correo, E e);
}
