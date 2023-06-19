package com.examen01.examen.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name="Detalle_venta")
@Table(name="Detalle_venta")
public class Detalle_venta {
	@Id
	String iddetalle_venta;
	String cantidad;
	double precio_venta;
	double descuento;
	public Detalle_venta() {
		super();
	}
	public Detalle_venta(String iddetalle_venta,  String cantidad,
			double precio_venta, double descuento) {
		super();
		this.iddetalle_venta = iddetalle_venta;
		this.cantidad = cantidad;
		this.precio_venta = precio_venta;
		this.descuento = descuento;
	}
	public String getIddetalle_venta() {
		return iddetalle_venta;
	}
	public void setIddetalle_venta(String iddetalle_venta) {
		this.iddetalle_venta = iddetalle_venta;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id articulo")
	private Articulo articulo;
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idventa")
	private Venta venta;
	
	}
	

	

