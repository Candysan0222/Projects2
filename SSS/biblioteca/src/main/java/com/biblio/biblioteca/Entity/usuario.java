package com.biblio.biblioteca.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class usuario {
	
	public enum tipoUsuario{Lector, Bibliotecario, Administrador }
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "nombre", nullable = false, unique = true, length = 50)
	private String nombre;
	
	@Column(name = "direccion", nullable = false, unique = false, length = 50)
	private String direccion;
	
	@Column(name = "correo", nullable = false, unique = true, length = 50)
	private String correo;
	
	@Column(name = "tipo_usuario", nullable = false, unique = false)
	private tipoUsuario tipoUsuario;
	
	@Column(name = "estado", nullable = false, unique = false)
	private boolean estado;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public tipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(tipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	
	
	

}
