package com.examen01.examen.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity(name="Categoria")
@Table(name="categoria")
public class Categoria {
	@Id
	String idcategoria;
	String nombre;
	String descripcion;
	String condicion;
	public Categoria() {
		super();
	}
	public Categoria(String idcategoria, String nombre, String descripcion, String condicion) {
		super();
		this.idcategoria = idcategoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.condicion = condicion;
	}
	public String getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(String idcategoria) {
		this.idcategoria = idcategoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCondicion() {
		return condicion;
	}
	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "categoria",cascade = CascadeType.ALL)
	List<Articulo> articulo;
	public List<Articulo> getArticulo() {
		return articulo;
	}
	public void setArticulo(List<Articulo> articulo) {
		this.articulo = articulo;
	}
	
	
	

}
