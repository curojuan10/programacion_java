package com.examen01.examen.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity(name="Articulo")
@Table(name="articulo")

public class Articulo {
	@Id
	String idarticulo;
	String codigo;
	String nombre;
	String stock;
	String descripcion;
	String imagen;
	String estado;
	public Articulo() {
		super();
	}
	public Articulo(String idarticulo, String codigo, String nombre, String stock, String descripcion, String imagen,
			String estado) {
		super();
		this.idarticulo = idarticulo;
		this.codigo = codigo;
		this.nombre = nombre;
		this.stock = stock;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.estado = estado;
	}
	public String getIdarticulo() {
		return idarticulo;
	}
	public void setIdarticulo(String idarticulo) {
		this.idarticulo = idarticulo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="idcategoria")
	private Categoria categoria;
		
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "articulo",cascade = CascadeType.ALL)
	List<Detalle_ingreso>detalle_ingreso;
	public List<Detalle_ingreso> getDetalle_ingreso() {
		return detalle_ingreso;
	}
	public void setDetalle_ingreso(List<Detalle_ingreso> detalle_ingreso) {
		this.detalle_ingreso = detalle_ingreso;
	}
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "articulo",cascade = CascadeType.ALL)
	List<Detalle_venta>detalle_venta;
	public List<Detalle_venta> getDetalle_venta() {
		return detalle_venta;
	}
	public void setDetalle_venta(List<Detalle_venta> detalle_venta) {
		this.detalle_venta = detalle_venta;
	}
	
	

}
