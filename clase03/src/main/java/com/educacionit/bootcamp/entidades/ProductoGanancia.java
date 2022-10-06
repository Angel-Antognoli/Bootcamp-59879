package com.educacionit.bootcamp.entidades;

public abstract class ProductoGanancia extends Producto {
	protected double ganancia;

	public ProductoGanancia() {
		super();
	}

	public ProductoGanancia(String banco, int sucursal, int numero, double ganancia) {
		super(banco, sucursal, numero);
		this.ganancia = ganancia;
	}

	public String toString() {
		return "ProductoGanancia [banco=" + banco + ", sucursal=" + sucursal + ", numero=" + numero + ", ganancia="
				+ ganancia + "]";
	}

	public double getGanancia() {
		return ganancia;
	}

	public void setGanancia(double ganancia) {
		this.ganancia = ganancia;
	}

}
