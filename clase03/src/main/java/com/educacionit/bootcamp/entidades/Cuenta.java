package com.educacionit.bootcamp.entidades;

public class Cuenta extends ProductoGanancia {
	private String tipo;
	private boolean mantenimiento;

	public Cuenta() {
		super();
	}

	public Cuenta(String banco, int sucursal, int numero, double ganancia, String tipo, boolean mantenimiento) {
		super(banco, sucursal, numero, ganancia);
		this.tipo = tipo;
		this.mantenimiento = mantenimiento;
	}

	@Override
	public String toString() {
		return "Cuenta [banco=" + banco + ", sucursal=" + sucursal + ", numero=" + numero + ", ganancia=" + ganancia
				+ ", tipo=" + tipo + ", mantenimiento=" + mantenimiento + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(boolean mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	public boolean asignar() {
		System.out.println("asigno cuenta");
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
