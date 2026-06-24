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
@Table(name = "peliculas")
public class Pelicula implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pelicula")
	private Integer idPelicula;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "anio_estreno")
	private Integer anioEstreno;
	
	@Column(name = "id_genero")
	private Integer idGenero;
}
