package com.streamhub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.streamhub.model.Favoritos;
import com.streamhub.service.FavoritoService;

@RestController
@RequestMapping("/api/favoritos")
@CrossOrigin(origins = "*")
public class FavoritoController {
	
	@Autowired
    private FavoritoService favoritoService;

    @GetMapping
    public List<Favoritos> listar() {
        return favoritoService.listar();
    }

    @PostMapping
    public Favoritos insertar(@RequestBody Favoritos favorito) {
        return favoritoService.insertar(favorito);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        favoritoService.eliminar(id);
    }
}
