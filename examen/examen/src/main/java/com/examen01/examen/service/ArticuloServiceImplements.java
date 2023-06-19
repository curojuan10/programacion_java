package com.examen01.examen.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen01.examen.entity.Articulo;
import com.examen01.examen.repository.ArticuloRepository;

@Service
public class ArticuloServiceImplements implements ArticuloService{
    @Autowired
    ArticuloRepository x;

	@Override
	public Articulo registrar(Articulo a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Articulo actualizar(Articulo a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Articulo a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Articulo> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}
}
    

