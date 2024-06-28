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
@Table(name = "multas")
public class multas {
	
	/*Usuario multado.
o
Préstamo
o
Valor multa.
o
Fecha multa.
o
Estado.*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name="valor_multa", nullable = false, unique = false)
	private int valorMulta;
	
	@Column(name="fecha_multa", nullable = false, unique = false)
	private LocalDateTime fechaMulta;
	
	@Column(name = "estado", nullable = false, unique = false)
	private boolean estado;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="usuario_id")
    private usuario usuarioId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="prestamoId")
    private prestamo prestamoId;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public int getValorMulta() {
		return valorMulta;
	}

	public void setValorMulta(int valorMulta) {
		this.valorMulta = valorMulta;
	}

	public LocalDateTime getFechaMulta() {
		return fechaMulta;
	}

	public void setFechaMulta(LocalDateTime fechaMulta) {
		this.fechaMulta = fechaMulta;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public usuario getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(usuario usuarioId) {
		this.usuarioId = usuarioId;
	}

	public prestamo getPrestamoId() {
		return prestamoId;
	}

	public void setPrestamoId(prestamo prestamoId) {
		this.prestamoId = prestamoId;
	}
	


	
	
	
	
}
