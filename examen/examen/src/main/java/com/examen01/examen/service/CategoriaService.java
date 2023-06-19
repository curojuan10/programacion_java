package com.examen01.examen.service;

import java.util.List;
import com.examen01.examen.entity.Categoria;

public interface CategoriaService {
	public Categoria registrar(Categoria a);
	public Categoria actualizar(Categoria a);
	public void eliminar(Categoria a);
	public List<Categoria>ver();

}
