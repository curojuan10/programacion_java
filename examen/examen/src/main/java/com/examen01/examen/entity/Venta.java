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
@Entity(name="Venta")
@Table(name="Venta")
public class Venta {
	@Id
	String idventa;
	String tipo_comprobante;
	String serir_comprobante;
	String num_comprobante;
	String fecha_hora;
	double impuesto;
	double total_venta;
	public Venta() {
		super();
	}
	public Venta(String idventa, String tipo_comprobante, String serir_comprobante,
			String num_comprobante, String fecha_hora, double impuesto, double total_venta) {
		super();
		this.idventa = idventa;
		this.tipo_comprobante = tipo_comprobante;
		this.serir_comprobante = serir_comprobante;
		this.num_comprobante = num_comprobante;
		this.fecha_hora = fecha_hora;
		this.impuesto = impuesto;
		this.total_venta = total_venta;
	}
	public String getIdventa() {
		return idventa;
	}
	public void setIdventa(String idventa) {
		this.idventa = idventa;
	}
	public String getTipo_comprobante() {
		return tipo_comprobante;
	}
	public void setTipo_comprobante(String tipo_comprobante) {
		this.tipo_comprobante = tipo_comprobante;
	}
	public String getSerir_comprobante() {
		return serir_comprobante;
	}
	public void setSerir_comprobante(String serir_comprobante) {
		this.serir_comprobante = serir_comprobante;
	}
	public String getNum_comprobante() {
		return num_comprobante;
	}
	public void setNum_comprobante(String num_comprobante) {
		this.num_comprobante = num_comprobante;
	}
	public String getFecha_hora() {
		return fecha_hora;
	}
	public void setFecha_hora(String fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	public double getTotal_venta() {
		return total_venta;
	}
	public void setTotal_venta(double total_venta) {
		this.total_venta = total_venta;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idpersona")
	private Persona persona;
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "venta",cascade = CascadeType.ALL)
	
	List<Detalle_venta>detalle_venta;
	public List<Detalle_venta> getDetalle_venta() {
		return detalle_venta;
	}
	public void setDetalle_venta(List<Detalle_venta> detalle_venta) {
		this.detalle_venta = detalle_venta;
	}
	

}
