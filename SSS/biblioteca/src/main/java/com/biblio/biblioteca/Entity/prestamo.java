package com.biblio.biblioteca.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "prestamo")
public class prestamo {

	
	/*Fecha de préstamo
o
Fecha de devolución
o
Usuario que realiza el préstamo
o
Libro prestado
o
Estado
1.
Préstamo
2.
Entregado
3.
Cancelado*/
	public enum estado{Prestamo, Entregado, Cancelado }
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "fecha_prestamo", nullable = false, unique = false)
	private LocalDateTime fechaPrestamo;
	
	@Column(name = "fecha_devolucion", nullable = false, unique = false)
	private LocalDateTime fechaDevolucion;
	
	@Column(name = "mani", nullable = false, unique = false)
	private estado mani;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="prestar_usuario")
    private usuario usuarioId;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="prestar_libro")
    private libro libroId;
	
	@Column(name = "estado", nullable = false, unique = false)
	private boolean estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(LocalDateTime fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public LocalDateTime getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(LocalDateTime fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public estado getMani() {
		return mani;
	}

	public void setMani(estado mani) {
		this.mani = mani;
	}

	public usuario getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(usuario usuarioId) {
		this.usuarioId = usuarioId;
	}

	public libro getLibroId() {
		return libroId;
	}

	public void setLibroId(libro libroId) {
		this.libroId = libroId;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	


	
}


