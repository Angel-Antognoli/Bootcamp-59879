package com.educacionit.bootcamp.clase01;

// tipado fuerte - hay otros lenguajes son de tipado debil
// por defecto o default
public class Cliente { // public y default
  protected	int numeroDocumento;
	String nombre;
	public String apellido;
	String direccion;
	private boolean activo;

	protected void desactivar() {

		activo = false;
	}

	private void activar() {
		
		activo = true;
	}

}
