package com.streamhub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.streamhub.model.Favoritos;
import com.streamhub.repository.FavoritosRepository;

@Service
public class FavoritoService {
	
	@Autowired
	private FavoritosRepository favoritoRepository;
	
	public List<Favoritos> listar() {
	    return favoritoRepository.findAll();
	}
	
	public Favoritos insertar(Favoritos favorito) {
		favorito.setIdFavorito(null);
	    return favoritoRepository.save(favorito);
	}
	
	public void eliminar(int id_favorito) {
	    favoritoRepository.deleteById(id_favorito);
	}
	
}
