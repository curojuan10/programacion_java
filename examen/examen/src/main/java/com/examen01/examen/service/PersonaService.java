package com.examen01.examen.service;

import java.util.List;

import com.examen01.examen.entity.Persona;

public interface PersonaService {
	public Persona registrar(Persona a);
	public Persona actualizar(Persona a);
	public void eliminar(Persona a);
	public List<Persona>ver();

}
