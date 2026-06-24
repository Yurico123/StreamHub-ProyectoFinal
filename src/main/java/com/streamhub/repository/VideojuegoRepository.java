package com.streamhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.streamhub.model.Videojuego;

@Repository
public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer>{

}
