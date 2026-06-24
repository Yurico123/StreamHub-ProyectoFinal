package com.streamhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.streamhub.model.Favoritos;

@Repository
public interface FavoritosRepository extends JpaRepository<Favoritos, Integer>{

}
