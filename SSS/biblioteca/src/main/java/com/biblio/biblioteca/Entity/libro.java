package com.biblio.biblioteca.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "libro")
public class libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "titulo", nullable = false, unique = true, length = 50)
	private String titulo;
	
	@Column(name = "autor", nullable = false, unique = false, length = 50)
	private String autor;
	
	@Column(name = "isbn", nullable = false, unique = true, length = 50)
	private String isbn;

	@Column(name = "genero", nullable = false, unique = false, length = 50)
	private String genero;
	
	@Column(name = "ejemplares_disponibles", nullable = false, unique = false, length = 50)
	private int ejemplaresDisponibles;
	
	@Column(name = "ejemplares_ocupados", nullable = false, unique = false, length = 50)
	private int ejemplaresOcupados;
	
	@Column(name = "estado", nullable = false, unique = false)
	private boolean estado;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEjemplaresDisponibles() {
		return ejemplaresDisponibles;
	}

	public void setEjemplaresDisponibles(int ejemplaresDisponibles) {
		this.ejemplaresDisponibles = ejemplaresDisponibles;
	}

	public int getEjemplaresOcupados() {
		return ejemplaresOcupados;
	}

	public void setEjemplaresOcupados(int ejemplaresOcupados) {
		this.ejemplaresOcupados = ejemplaresOcupados;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}




}
