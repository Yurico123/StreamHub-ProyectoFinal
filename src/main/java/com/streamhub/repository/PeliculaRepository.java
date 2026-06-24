package com.streamhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.streamhub.model.Pelicula;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Integer>{

}
