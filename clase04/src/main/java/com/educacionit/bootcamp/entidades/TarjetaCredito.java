package com.educacionit.bootcamp.entidades;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TarjetaCredito extends Producto {
	private LocalDate fechaCorte;

	public TarjetaCredito() {
		super();
	}

	public TarjetaCredito(Long numero, String banco, LocalDateTime fechaCreacion, LocalDate fechaCorte) {
		super(numero, banco, fechaCreacion);
		this.fechaCorte = fechaCorte;
	}

	public String toString() {
		return "TarjetaCredito [numero=" + numero + ", banco=" + banco + ", fechaCreacion=" + fechaCreacion
				+ ", fechaCorte=" + fechaCorte + "]";
	}

	public LocalDate getFechaCorte() {
		return fechaCorte;
	}

	public void setFechaCorte(LocalDate fechaCorte) {
		this.fechaCorte = fechaCorte;
	}

	public boolean emitirPago(float monto, Long numero, String descripcion) {
		System.out.println("Pago Tarjeta  " + String.format("%.2f", monto) + " al numero "
				+ String.format("%010d", numero) + " y referencia : " + descripcion);
		return true;
	}

	public void generarPlastico(String path) throws FileNotFoundException {
		FileOutputStream fileOutputStream = new FileOutputStream(path);
	}

}
