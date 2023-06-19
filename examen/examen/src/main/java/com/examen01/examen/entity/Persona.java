package com.examen01.examen.entity;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity(name="Persona")
@Table(name="Persona")
public class Persona {
	@Id
	String idpersona;
	String tipo_persona;
	String nombre;
	String tipo_documento;
	String num_documento;
	String direcion;
	String telefono;
	public Persona() {
		super();
	}
	public Persona(String idpersona, String tipo_persona, String nombre, String tipo_documento, String num_documento,
			String direcion, String telefono) {
		super();
		this.idpersona = idpersona;
		this.tipo_persona = tipo_persona;
		this.nombre = nombre;
		this.tipo_documento = tipo_documento;
		this.num_documento = num_documento;
		this.direcion = direcion;
		this.telefono = telefono;
	}
	public String getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(String idpersona) {
		this.idpersona = idpersona;
	}
	public String getTipo_persona() {
		return tipo_persona;
	}
	public void setTipo_persona(String tipo_persona) {
		this.tipo_persona = tipo_persona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo_documento() {
		return tipo_documento;
	}
	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}
	public String getNum_documento() {
		return num_documento;
	}
	public void setNum_documento(String num_documento) {
		this.num_documento = num_documento;
	}
	public String getDirecion() {
		return direcion;
	}
	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "persona",cascade = CascadeType.ALL)
	List<Ingreso>ingreso;
	public List<Ingreso> getIngreso() {
		return ingreso;
	}
	public void setIngreso(List<Ingreso> ingreso) {
		this.ingreso = ingreso;
	}
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "persona",cascade = CascadeType.ALL)
	List<Venta>venta;
	public List<Venta> getVenta() {
		return venta;
	}
	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}
	
	
	

}
