package com.educacionit.bootcamp.clase03;

import com.educacionit.bootcamp.entidades.Cuenta;
import com.educacionit.bootcamp.entidades.PlazoFijo;
import com.educacionit.bootcamp.entidades.Producto;
import com.educacionit.bootcamp.entidades.ProductoGanancia;
import com.educacionit.bootcamp.entidades.Tarjeta;

public class AppPolimorfismo {
	public static void main(String[] args) {

		// polimorfismo: un objeto toma la forma de cualquiera de sus hijos
		Producto producto1 = new Tarjeta();
		Producto producto2 = new Cuenta();
		ProductoGanancia producto3 = new PlazoFijo();

		System.out.println(producto1);// toString
		System.out.println(producto2);
		System.out.println(producto3);

		Cuenta cuenta1 = new Cuenta();
		cuenta1.setBanco("HSBC");
		cuenta1.setSucursal(2);
		imprimirProducto(cuenta1);
		
		Object objeto1 = new Tarjeta();
		System.out.println(objeto1);

	}

	public static void imprimirProducto(Producto producto) {

		System.out.println("Esto es un producto");
		System.out.println(producto.getNumero());
		System.out.println(producto.getBanco());
		System.out.println(producto.getSucursal());
	}

}
