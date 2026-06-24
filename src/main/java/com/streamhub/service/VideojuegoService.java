package com.streamhub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.streamhub.model.Videojuego;
import com.streamhub.repository.VideojuegoRepository;

@Service
public class VideojuegoService {
	
	@Autowired
	private VideojuegoRepository videojuegoRepository;
	
	 public List<Videojuego> listar() {
	        return videojuegoRepository.findAll();
	    }

	 public Videojuego buscar(int id_videojuego) {
	        return videojuegoRepository.findById(id_videojuego).orElse(null);
	    }

	 public Videojuego insertar(Videojuego videojuego) {
		 
		 videojuego.setIdVideojuego(null);
	        return videojuegoRepository.save(videojuego);
	    }

	 public Videojuego actualizar(Videojuego videojuego) {
	        return videojuegoRepository.save(videojuego);
	    }

	 public void eliminar(int id_videojuego) {
		 videojuegoRepository.deleteById(id_videojuego);
	    }
}
