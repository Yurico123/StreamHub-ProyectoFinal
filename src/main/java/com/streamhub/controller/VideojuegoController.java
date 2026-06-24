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

import com.streamhub.model.Videojuego;
import com.streamhub.service.VideojuegoService;


@RestController
@RequestMapping("/api/videojuegos")
@CrossOrigin(origins = "*")
public class VideojuegoController {
	
	@Autowired
    private VideojuegoService videojuegoService;

    @GetMapping
    public List<Videojuego> listar() {
        return videojuegoService.listar();
    }

    @GetMapping("/{id}")
    public Videojuego buscar(@PathVariable int id) {
        return videojuegoService.buscar(id);
    }

    @PostMapping
    public Videojuego insertar(@RequestBody Videojuego videojuego) {
        return videojuegoService.insertar(videojuego);
    }

    @PutMapping("/{id}")
    public Videojuego actualizar(@PathVariable int id, @RequestBody Videojuego videojuego) {
        videojuego.setIdVideojuego(id);
        return videojuegoService.actualizar(videojuego);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        videojuegoService.eliminar(id);
    }
}
