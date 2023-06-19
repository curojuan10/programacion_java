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

@Entity(name="Ingreso")
@Table(name="Ingreso")
public class Ingreso {
	@Id
	String idingreso;
	String tipo_comprobante;
	String serie_comprobante;
	String fecha_hora;
	double impuesto;
	String estado;
	public Ingreso() {
		super();
	}
	public Ingreso(String idingreso, String tipo_comprobante, String serie_comprobante,
			String fecha_hora, double impuesto, String estado) {
		super();
		this.idingreso = idingreso;
		this.tipo_comprobante = tipo_comprobante;
		this.serie_comprobante = serie_comprobante;
		this.fecha_hora = fecha_hora;
		this.impuesto = impuesto;
		this.estado = estado;
	}
	public String getIdingreso() {
		return idingreso;
	}
	public void setIdingreso(String idingreso) {
		this.idingreso = idingreso;
	}
	public String getTipo_comprobante() {
		return tipo_comprobante;
	}
	public void setTipo_comprobante(String tipo_comprobante) {
		this.tipo_comprobante = tipo_comprobante;
	}
	public String getSerie_comprobante() {
		return serie_comprobante;
	}
	public void setSerie_comprobante(String serie_comprobante) {
		this.serie_comprobante = serie_comprobante;
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "ingreso",cascade = CascadeType.ALL)
	
	List<Detalle_ingreso>detalle_ingreso;
	public List<Detalle_ingreso> getDetalle_ingreso() {
		return detalle_ingreso;
	}
	public void setDetalle_ingreso(List<Detalle_ingreso> detalle_ingreso) {
		this.detalle_ingreso = detalle_ingreso;
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
	
	
		
	
	

}
