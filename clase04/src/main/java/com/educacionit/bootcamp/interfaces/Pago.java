package com.educacionit.bootcamp.interfaces;

public interface Pago {
	String PESOS = "$";
	String DOLAR = "U$D";

	boolean emitirPago(float monto, Long numero, String descripcion);
}
