package com.streamhub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.streamhub.model.Usuario;
import com.streamhub.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> listar() {
		return usuarioRepository.findAll();
	}

	public Usuario buscar(int id_usuario) {
		return usuarioRepository.findById(id_usuario).orElseThrow(() -> 
			new RuntimeException("Usuario no encontrado con ID: " + id_usuario));
	}

	public Usuario insertar(Usuario usuario) {
		
		usuario.setIdUsuario(null);
		return usuarioRepository.save(usuario);
	}

	public Usuario actualizar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public void eliminar(int id_usuario) {
		usuarioRepository.deleteById(id_usuario);
	}
}
