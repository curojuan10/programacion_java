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

import com.examen01.examen.entity.Detalle_venta;
import com.examen01.examen.service.Detalle_ventaService;

@RestController
@RequestMapping("/detalles")
public class Detalle_ventaController {
@Autowired
Detalle_ventaService x;

@PostMapping
public Detalle_venta registrar(@RequestBody Detalle_venta a) {
	return x.registrar(a);
}
@PutMapping
public Detalle_venta actualizar(@RequestBody Detalle_venta a) {
	return x.actualizar(a);
	}
@DeleteMapping
public void eliminar (@RequestBody Detalle_venta a) {
	 x.eliminar(a);
}
@GetMapping
public List<Detalle_venta>ver(){
	return x.ver();
}
}
