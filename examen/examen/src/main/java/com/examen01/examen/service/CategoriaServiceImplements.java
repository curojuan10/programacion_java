package com.examen01.examen.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen01.examen.entity.Categoria;

import com.examen01.examen.repository.CategoriaRepository;

@Service
public class CategoriaServiceImplements implements CategoriaService{
    @Autowired
    CategoriaRepository x;

	@Override
	public Categoria registrar(Categoria a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Categoria actualizar(Categoria a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Categoria a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Categoria> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}