package com.biblio.biblioteca.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.biblio.biblioteca.Entity.libro;
import com.biblio.biblioteca.IRepository.ObjetoT.IObjectTRepository;


public interface ILibroRepository extends IObjectTRepository<libro, Long>{
	
	@Query(value="SELECT * FROM libro "
			+ "WHERE (:search IS NULL  "
			+ "	OR titulo LIKE CONCAT('%', :search, '%')  "
			+ "	OR autor LIKE CONCAT('%', :search, '%')  "
			+ "	OR isbn LIKE CONCAT('%', :search, '%') "
			+ "	OR genero LIKE CONCAT('%', :search, '%') "
			+ "	OR ejemplares_ocupados LIKE CONCAT('%', :search, '%') "
			+ "	OR ejemplares_disponibles LIKE CONCAT('%', :search, '%'));", nativeQuery = true)
	List<libro> buscar(String search);
}
