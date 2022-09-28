package com.educacionit.bootcamp.entidades;

public class Profesor extends Persona {
	private float sueldo;

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		System.out.println(getNombre());
		this.sueldo = sueldo;
	}

}
