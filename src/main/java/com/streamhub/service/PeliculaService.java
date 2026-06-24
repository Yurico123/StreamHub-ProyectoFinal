package com.streamhub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.streamhub.model.Pelicula;
import com.streamhub.repository.PeliculaRepository;

@Service
public class PeliculaService {
	
	@Autowired
	private PeliculaRepository peliculaRepository;
	
	
	public List<Pelicula> listar() {
		return peliculaRepository.findAll();
	}

	public Pelicula buscar(int id_pelicula) {
		return peliculaRepository.findById(id_pelicula)
                .orElseThrow(() ->
                    new RuntimeException("Película no encontrada"));
	}

	public Pelicula insertar(Pelicula pelicula) {
		
		pelicula.setIdPelicula(null);
		return peliculaRepository.save(pelicula);
	}

	public Pelicula actualizar(Pelicula pelicula) {
		return peliculaRepository.save(pelicula);
	}

	public void eliminar(int id_pelicula) {
		peliculaRepository.deleteById(id_pelicula);
	}
}
