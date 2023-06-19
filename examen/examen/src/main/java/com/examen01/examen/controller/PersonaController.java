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

import com.examen01.examen.entity.Persona;
import com.examen01.examen.service.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {
@Autowired
PersonaService x;

@PostMapping
public Persona registrar(@RequestBody Persona a) {
	return x.registrar(a);
}
@PutMapping
public Persona actualizar(@RequestBody Persona a) {
	return x.actualizar(a);
	}
@DeleteMapping
public void eliminar (@RequestBody Persona a) {
	 x.eliminar(a);
}
@GetMapping
public List<Persona>ver(){
	return x.ver();
}
}

