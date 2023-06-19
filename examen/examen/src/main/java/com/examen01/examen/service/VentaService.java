package com.examen01.examen.service;

import java.util.List;
import com.examen01.examen.entity.Venta;

public interface VentaService {
	public Venta registrar(Venta a);
	public Venta actualizar(Venta a);
	public void eliminar(Venta a);
	public List<Venta>ver();

}
