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

import com.examen01.examen.entity.Venta;
import com.examen01.examen.service.VentaService;

@RestController
@RequestMapping("/ventas")
public class VentaController {
@Autowired
VentaService x;

@PostMapping
public Venta registrar(@RequestBody Venta a) {
	return x.registrar(a);
}
@PutMapping
public Venta actualizar(@RequestBody Venta a) {
	return x.actualizar(a);
	}
@DeleteMapping
public void eliminar (@RequestBody Venta a) {
	 x.eliminar(a);
}
@GetMapping
public List<Venta>ver(){
	return x.ver();
}
}

