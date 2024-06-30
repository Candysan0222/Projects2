package com.biblio.biblioteca.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.biblio.biblioteca.Entity.usuario;
import com.biblio.biblioteca.IRepository.ObjetoT.IObjectTRepository;

public interface IUsuarioRepository extends IObjectTRepository<usuario, Long>{
	
	@Query(value = "SELECT u.* " +
            "FROM usuario u " +
            "WHERE (:search IS NULL " +
            "       OR u.nombre LIKE CONCAT('%', :search, '%') " +
            "       OR u.direccion LIKE CONCAT('%', :search, '%') " +
            "       OR u.correo LIKE CONCAT('%', :search, '%') " +
            "       OR u.tipo_usuario LIKE CONCAT('%', :search, '%'))",
    nativeQuery = true)
	List<usuario> buscar(String search);
	
	
	
}
