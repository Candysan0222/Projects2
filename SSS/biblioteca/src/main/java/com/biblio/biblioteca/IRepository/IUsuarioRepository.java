package com.biblio.biblioteca.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.biblio.biblioteca.Entity.usuario;
import com.biblio.biblioteca.IRepository.ObjetoT.IObjectTRepository;

public interface IUsuarioRepository extends IObjectTRepository<usuario, Long>{

	@Query(value="", nativeQuery = true)
	List<usuario> buscar(String search);
}
