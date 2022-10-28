package com.educacionit.bootcamp.clase08;

public class ClasesAnonimas {
	public static void main(String[] args) {
		
		PersonaEjemplo personaEjemplo = new PersonaEjemplo() {
		
			public int anioNacimiento() {

				return 2022-5;
			}
		};
		
		imprimirAnioNacimientoPersona(personaEjemplo);
		
		
		imprimirAnioNacimientoPersona(new PersonaEjemplo() {
		
			public int anioNacimiento() {
				return 2022-9;
			}
		});
	}

	private static void imprimirAnioNacimientoPersona(PersonaEjemplo persona) {
		System.out.println(persona.anioNacimiento());
	}
}

abstract class PersonaEjemplo {
	private String nombre;
	private int edad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public abstract int anioNacimiento();

}
