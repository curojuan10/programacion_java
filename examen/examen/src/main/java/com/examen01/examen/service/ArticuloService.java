package com.examen01.examen.service;

import java.util.List;

import com.examen01.examen.entity.Articulo;

public interface ArticuloService {
	public Articulo registrar(Articulo a);
	public Articulo actualizar(Articulo a);
	public void eliminar(Articulo a);
	public List<Articulo>ver();


}
