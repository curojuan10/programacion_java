package com.examen01.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen01.examen.entity.Venta;
import com.examen01.examen.repository.VentaRepository;
@Service
public class VentaServiceImplements implements VentaService {
	@Autowired
	VentaRepository x;

	@Override
	public Venta registrar(Venta a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Venta actualizar(Venta a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Venta a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Venta> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
