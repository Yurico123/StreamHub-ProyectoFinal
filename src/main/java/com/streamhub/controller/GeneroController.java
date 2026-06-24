package com.streamhub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.streamhub.model.Genero;
import com.streamhub.service.GeneroService;

@RestController
@RequestMapping("/api/generos")
@CrossOrigin(origins = "*")
public class GeneroController {
	
	@Autowired
    private GeneroService generoService;

    @GetMapping
    public List<Genero> listar() {
        return generoService.listar();
    }

    @GetMapping("/{id}")
    public Genero buscar(@PathVariable int id) {
        return generoService.buscar(id);
    }

    @PostMapping
    public Genero insertar(@RequestBody Genero genero) {
        return generoService.insertar(genero);
    }

    @PutMapping("/{id}")
    public Genero actualizar(@PathVariable int id, @RequestBody Genero genero) {
        genero.setIdGenero(id);
        return generoService.actualizar(genero);
    }
}
