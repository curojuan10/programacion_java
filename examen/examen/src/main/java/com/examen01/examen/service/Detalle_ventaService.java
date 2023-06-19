package com.examen01.examen.service;

import java.util.List;
import com.examen01.examen.entity.Detalle_venta;

public interface Detalle_ventaService {
	public Detalle_venta registrar(Detalle_venta a);
	public Detalle_venta actualizar(Detalle_venta a);
	public void eliminar(Detalle_venta a);
	public List<Detalle_venta>ver();

}
