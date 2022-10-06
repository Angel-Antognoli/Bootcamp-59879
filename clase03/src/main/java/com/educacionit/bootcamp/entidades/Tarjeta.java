package com.educacionit.bootcamp.entidades;

import java.time.LocalDate;

public class Tarjeta extends Producto {
	private float mora;
	private LocalDate fechaCorte;

	public Tarjeta() {
		super();
	}

	public Tarjeta(String banco, int sucursal, int numero, float mora, LocalDate fechaCorte) {
		super(banco, sucursal, numero);
		this.mora = mora;
		this.fechaCorte = fechaCorte;
	}


	public float getMora() {
		return mora;
	}

	public void setMora(float mora) {
		this.mora = mora;
	}

	public LocalDate getFechaCorte() {
		return fechaCorte;
	}

	public void setFechaCorte(LocalDate fechaCorte) {
		this.fechaCorte = fechaCorte;
	}

	public boolean asignar() {
		System.out.println("asigo tarjeta");
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
