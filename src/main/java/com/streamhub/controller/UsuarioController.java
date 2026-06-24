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

import com.streamhub.model.Usuario;
import com.streamhub.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping
	public List<Usuario> listar() {
		return usuarioService.listar();
	}


	@GetMapping("/{id}")
	public Usuario buscar(@PathVariable int id) {
		return usuarioService.buscar(id);
	}

	@PostMapping
    public Usuario insertar(@RequestBody Usuario usuario) {
        return usuarioService.insertar(usuario);
    }

    @PutMapping("/{id}")
    public Usuario actualizar(@PathVariable int id, @RequestBody Usuario usuario) {
    	usuario.setIdUsuario(id);
        return usuarioService.actualizar(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        usuarioService.eliminar(id);
    }
}
