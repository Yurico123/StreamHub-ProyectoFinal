package com.streamhub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.streamhub.model.Pelicula;
import com.streamhub.service.PeliculaService;

@RestController
@RequestMapping("/api/peliculas")
@CrossOrigin(origins = "*")
public class PeliculaController {
	
	 @Autowired
	 private PeliculaService peliculaService;

	 @GetMapping
	 public List<Pelicula> listar() {
	    return peliculaService.listar();
	 }

	 @GetMapping("/{id}")
	 public Pelicula buscar(@PathVariable int id) {
		 return peliculaService.buscar(id);
	}

	 @PostMapping
	 public Pelicula insertar(@RequestBody Pelicula pelicula) {
		 return peliculaService.insertar(pelicula);
	 }

	 @PutMapping("/{id}")
	 public Pelicula actualizar(@PathVariable int id, @RequestBody Pelicula pelicula) {
		 pelicula.setIdPelicula(id);
		 return peliculaService.actualizar(pelicula);
	 }

	 @DeleteMapping("/{id}")
	 public void eliminar(@PathVariable int id) {
		 peliculaService.eliminar(id);
	 }
}
