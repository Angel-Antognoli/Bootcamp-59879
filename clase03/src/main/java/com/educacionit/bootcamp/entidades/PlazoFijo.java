package com.educacionit.bootcamp.entidades;

public class PlazoFijo extends ProductoGanancia {
	private short plazo;

	public PlazoFijo() {
		super();
	}

	public PlazoFijo(String banco, int sucursal, int numero, double ganancia, short plazo) {
		super(banco, sucursal, numero, ganancia);
		this.plazo = plazo;
	}

	public String toString() {
		return "PlazoFijo [banco=" + banco + ", sucursal=" + sucursal + ", numero=" + numero + ", ganancia=" + ganancia
				+ ", plazo=" + plazo + "]";
	}

	public short getPlazo() {
		return plazo;
	}

	public void setPlazo(short plazo) {
		this.plazo = plazo;
	}

	public boolean asignar() {
		System.out.println("asigno plazo fijo ");
		return false;
	}

	@Override
	public boolean guardar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void insertar() {
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
