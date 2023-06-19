package com.examen01.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen01.examen.entity.Detalle_ingreso;
import com.examen01.examen.service.Detalle_ingresoService;

@RestController
@RequestMapping("/detalle")
public class Detalle_ingresoController{
@Autowired
Detalle_ingresoService x;

@PostMapping
public Detalle_ingreso registrar(@RequestBody Detalle_ingreso a) {
	return x.registrar(a);
}
@PutMapping
public Detalle_ingreso actualizar(@RequestBody Detalle_ingreso a) {
	return x.actualizar(a);
	}
@DeleteMapping
public void eliminar (@RequestBody Detalle_ingreso a) {
	 x.eliminar(a);
}
@GetMapping
public List<Detalle_ingreso>ver(){
	return x.ver();
}
}
