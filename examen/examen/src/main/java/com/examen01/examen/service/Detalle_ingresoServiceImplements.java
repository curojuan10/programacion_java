package com.examen01.examen.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen01.examen.entity.Detalle_ingreso;
import com.examen01.examen.repository.Detalle_ingresoRepository;
@Service
public class Detalle_ingresoServiceImplements implements Detalle_ingresoService {
	@Autowired
	Detalle_ingresoRepository x;
	@Override
	public Detalle_ingreso registrar(Detalle_ingreso a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Detalle_ingreso actualizar(Detalle_ingreso a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Detalle_ingreso a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Detalle_ingreso> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}