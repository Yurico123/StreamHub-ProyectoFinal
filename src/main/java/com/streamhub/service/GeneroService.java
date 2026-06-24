package com.streamhub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.streamhub.model.Genero;
import com.streamhub.repository.GeneroRepository;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository generoRepository;

    public List<Genero> listar() {
        return generoRepository.findAll();
    }

    public Genero buscar(int id) {
        return generoRepository.findById(id).orElse(null);
    }

    public Genero insertar(Genero genero) {
        return generoRepository.save(genero);
    }

    public Genero actualizar(Genero genero) {
        return generoRepository.save(genero);
    }

}
