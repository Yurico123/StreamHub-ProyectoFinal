package com.streamhub.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "videojuegos")
public class Videojuego implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_videojuego")
	private Integer idVideojuego;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "anio_lanzamiento")
	private Integer anioLanzamiento;
	
	@Column(name = "id_genero")
	private Integer idGenero;

}
