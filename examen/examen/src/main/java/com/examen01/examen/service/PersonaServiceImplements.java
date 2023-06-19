package com.examen01.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen01.examen.entity.Persona;
import com.examen01.examen.repository.PersonaRepository;
@Service
public class PersonaServiceImplements implements PersonaService{
	@Autowired
	PersonaRepository x;

	@Override
	public Persona registrar(Persona a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Persona actualizar(Persona a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Persona a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Persona> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
