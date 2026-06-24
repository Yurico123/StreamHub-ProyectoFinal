package com.streamhub.model;

import java.io.Serializable;
import java.time.LocalDateTime;

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
@Table(name = "favoritos")
public class Favoritos implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_favorito")
	private Integer idFavorito;
	
	@Column(name = "id_usuario")
	private Integer idUsuario;
	
	@Column(name = "tipo_contenido")
	private String tipoContenido;
	
	@Column(name = "id_contenido")
	private Integer idContenido;
	
	@Column(name = "fecha_registro")
	private LocalDateTime fechaRegistro;
}
