package com.examen01.examen.service;

import java.util.List;
import com.examen01.examen.entity.Ingreso;

public interface IngresoService {
	public Ingreso registrar(Ingreso a);
	public Ingreso actualizar(Ingreso a);
	public void eliminar(Ingreso a);
	public List<Ingreso>ver();

}
