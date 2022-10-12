package com.educacionit.bootcamp.clase04;

import com.educacionit.bootcamp.entidades.Cliente;
import com.educacionit.bootcamp.entidades.Cuenta;
import com.educacionit.bootcamp.entidades.Producto;
import com.educacionit.bootcamp.excepciones.ProductoExcepcion;

public class AppEjemplo1 {
public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		
		try {
			cuenta.setNumero(1L);
		} catch (ProductoExcepcion e) {
			e.printStackTrace();
			System.out.println(e.getMessage() + " - Nivel:" + e.getNivel());
		}
		
		Cliente cliente = new Cliente();
		cliente.setProductos(null);
}
}
