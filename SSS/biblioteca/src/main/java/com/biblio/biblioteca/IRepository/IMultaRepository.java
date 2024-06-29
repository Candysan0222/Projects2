package com.biblio.biblioteca.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.biblio.biblioteca.Entity.multas;
import com.biblio.biblioteca.IRepository.ObjetoT.IObjectTRepository;

public interface IMultaRepository extends IObjectTRepository<multas, Long>{
	
	@Query(value="SELECT * "
			+ "FROM multas ml  "
			+ "	INNER JOIN usuarios u ON ml.usuario_id = u.id; "
			+ "	INNER JOIN prestamos pr ON ml.prestamo_id = pr.id; "
			+ "WHERE (:search IS NULL  "
			+ "    OR CAST(ml.valor_multa AS CHAR) LIKE CONCAT('%', :search, '%')  "
			+ "    OR DATE_FORMAT(ml.fecha_multa, '%Y-%m-%d %H:%i:%s') LIKE CONCAT('%', :search, '%') "
			+ "	OR u.nombre LIKE CONCAT('%', :search, '%')); "
			+ "	OR CAST(pr.fecha_prestamo AS CHAR) LIKE CONCAT('%', :search, '%'));", nativeQuery= true)
	List<multas> buscar(String search);
}
