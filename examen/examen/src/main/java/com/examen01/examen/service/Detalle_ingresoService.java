package com.examen01.examen.service;

import java.util.List;

import com.examen01.examen.entity.Detalle_ingreso;


public interface Detalle_ingresoService {
	public Detalle_ingreso registrar(Detalle_ingreso a);
	public Detalle_ingreso actualizar(Detalle_ingreso a);
	public void eliminar(Detalle_ingreso a);
	public List<Detalle_ingreso>ver();

}
