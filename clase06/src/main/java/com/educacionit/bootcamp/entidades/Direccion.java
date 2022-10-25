package com.educacionit.bootcamp.entidades;

import java.util.Objects;

public final class Direccion {
	private String codigoPostal;
	private String calle;
	private String numero;

	public Direccion() {
		super();
	}

	public Direccion(String codigoPostal, String calle, String numero) {
		super();
		this.codigoPostal = codigoPostal;
		this.calle = calle;
		this.numero = numero;
	}

	public String toString() {
		return "Direccion [CP =" + codigoPostal + ", " + calle + " " + numero + "]";
	}

	public int hashCode() {
		return Objects.hash(calle, codigoPostal, numero);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Direccion other = (Direccion) obj;
		return Objects.equals(calle, other.calle) && Objects.equals(codigoPostal, other.codigoPostal)
				&& Objects.equals(numero, other.numero);
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
