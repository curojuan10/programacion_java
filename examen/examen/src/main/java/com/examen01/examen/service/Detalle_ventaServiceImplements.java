package com.examen01.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen01.examen.entity.Detalle_venta;
import com.examen01.examen.repository.Detalle_ventaRepository;

@Service
public class Detalle_ventaServiceImplements implements Detalle_ventaService {
	@Autowired 
	Detalle_ventaRepository x;
	@Override
	public Detalle_venta registrar(Detalle_venta a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Detalle_venta actualizar(Detalle_venta a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Detalle_venta a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Detalle_venta> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
