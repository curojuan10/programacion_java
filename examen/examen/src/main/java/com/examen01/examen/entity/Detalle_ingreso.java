package com.examen01.examen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name="Detalle_ingreso")
@Table(name="detalle_ingreso")
public class Detalle_ingreso {
	@Id
	String iddetalleingreso;
	String cantidad;
	double precio_compra;
	double precio_venta;

	public Detalle_ingreso() {
		super();
		
	}
	
	public Detalle_ingreso(String iddetalleingreso, String cantidad, double precio_compra, double precio_venta) {
		super();
		this.iddetalleingreso = iddetalleingreso;
		this.cantidad = cantidad;
		this.precio_compra = precio_compra;
		this.precio_venta = precio_venta;
	}
	


	public String getIddetalleingreso() {
		return iddetalleingreso;
	}

	public void setIddetalleingreso(String iddetalleingreso) {
		this.iddetalleingreso = iddetalleingreso;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}

	public double getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idarticulo")
	private Articulo articulo;

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idingreso")
	private Ingreso ingreso;
	

}



