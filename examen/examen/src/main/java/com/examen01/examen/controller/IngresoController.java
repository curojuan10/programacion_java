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


import com.examen01.examen.entity.Ingreso;
import com.examen01.examen.service.IngresoService;

@RestController
@RequestMapping("/ingreso")
public class IngresoController {
@Autowired
IngresoService x;

@PostMapping
public Ingreso registrar(@RequestBody Ingreso a) {
	return x.registrar(a);
}
@PutMapping
public Ingreso actualizar(@RequestBody Ingreso a) {
	return x.actualizar(a);
	}
@DeleteMapping
public void eliminar (@RequestBody Ingreso a) {
	 x.eliminar(a);
}
@GetMapping
public List<Ingreso>ver(){
	return x.ver();
}
}

