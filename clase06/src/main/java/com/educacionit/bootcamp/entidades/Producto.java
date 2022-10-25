package com.educacionit.bootcamp.entidades;

import java.util.Objects;

import com.educacionit.bootcamp.enumerados.TipoProducto;
import com.educacionit.bootcamp.excepciones.ExcepcionProducto;
import com.educacionit.bootcamp.utilidades.NumeroProducto;

public abstract class Producto implements Comparable<Producto> {
	protected Short banco; // 3
	protected Short sucursal; // 4
	protected Short codigoPostal; // 4
	protected Integer numero; // 8
	protected TipoProducto tipoProducto;

	public Producto() {

	}

	public Producto(Short banco, Short sucursal, Short codigoPostal, TipoProducto tipoProducto)
			throws ExcepcionProducto {
		super();
		setBanco(banco);
		setSucursal(sucursal);
		setCodigoPostal(codigoPostal);
		this.tipoProducto = tipoProducto;
		generarNumero();
	}

	public String toString() {
		return "Producto [" + getNumeroProducto() + ", tipoProducto=" + tipoProducto + "]";
	}

	public int hashCode() {
		return Objects.hash(banco, codigoPostal, numero, sucursal, tipoProducto);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(banco, other.banco) && Objects.equals(codigoPostal, other.codigoPostal)
				&& Objects.equals(numero, other.numero) && Objects.equals(sucursal, other.sucursal)
				&& tipoProducto == other.tipoProducto;
	}

	public Short getBanco() {
		return banco;
	}

	public void setBanco(Short banco) throws ExcepcionProducto {
		if (banco != null && (banco < 1 || banco > 999)) {
			throw new ExcepcionProducto("El banco debe estar entre 1 y 999");
		}
		this.banco = banco;
	}

	public Short getSucursal() {
		return sucursal;
	}

	public void setSucursal(Short sucursal) throws ExcepcionProducto {
		if (sucursal != null && (sucursal < 1 || sucursal > 9999)) {
			throw new ExcepcionProducto("La sucursal debe estar entre 1 y 9999");
		}

		this.sucursal = sucursal;
	}

	public Short getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(Short codigoPostal) throws ExcepcionProducto {
		if (codigoPostal != null && (codigoPostal < 1 || codigoPostal > 9999)) {
			throw new ExcepcionProducto("El CP debe estar entre 1 y 9999");
		}
		this.codigoPostal = codigoPostal;
	}

	public Integer getNumero() {
		return numero;
	}

	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public final String getNumeroProducto() {
		return String.format("%03d%04d%04d%08d", banco == null ? 0 : banco, sucursal == null ? 0 : sucursal,
				codigoPostal == null ? 0 : codigoPostal, numero == null ? 0 : numero);
	}

	public int compareTo(Producto otroProducto) {
		return this.getNumeroProducto().compareTo(otroProducto.getNumeroProducto());
	}

	private void generarNumero() {
		switch (tipoProducto) {
		case CC:
			numero = NumeroProducto.numeroCC.getAndIncrement();// 0
			break;
		case CA:
			numero = NumeroProducto.numeroCA.getAndIncrement();
			break;
		case FCI:
			numero = NumeroProducto.numeroFCI.getAndIncrement();
			break;
		default:
			break;
		}
	}

}
