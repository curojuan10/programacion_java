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

import com.examen01.examen.entity.Articulo;
import com.examen01.examen.service.ArticuloService;

@RestController
@RequestMapping("/articulo")
public class ArticuloController {
@Autowired
ArticuloService x;

@PostMapping
public Articulo registrar(@RequestBody Articulo a) {
	return x.registrar(a);
}
@PutMapping
public Articulo actualizar(@RequestBody Articulo a) {
	return x.actualizar(a);
	}
@DeleteMapping
public void eliminar (@RequestBody Articulo a) {
	 x.eliminar(a);
}
@GetMapping
public List<Articulo>ver(){
	return x.ver();
}
}
