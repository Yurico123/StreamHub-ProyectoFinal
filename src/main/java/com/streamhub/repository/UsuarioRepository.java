package com.streamhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.streamhub.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
