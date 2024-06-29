package com.biblio.biblioteca.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.biblio.biblioteca.Entity.prestamo;
import com.biblio.biblioteca.IRepository.ObjetoT.IObjectTRepository;

public interface IPrestamoRepository extends IObjectTRepository<prestamo, Long>{

	@Query(value="SELECT * "
			+ "FROM prestamo pr  "
			+ "	INNER JOIN usuarios u ON pr.usuario_id = u.id; "
			+ "	INNER JOIN libro lb ON pr.libro_id = lb.id; "
			+ "WHERE (:search IS NULL  "
			+ "     "
			+ "    OR DATE_FORMAT(pr.fecha_prestamo, '%Y-%m-%d %H:%i:%s') LIKE CONCAT('%', :search, '%') "
			+ "    OR DATE_FORMAT(pr.fecha_devolucion, '%Y-%m-%d %H:%i:%s') LIKE CONCAT('%', :search, '%') "
			+ "	OR pr.mani LIKE CONCAT('%', :search, '%') "
			+ "	OR u.nombre LIKE CONCAT('%', :search, '%')); "
			+ "	OR lb.titulo LIKE CONCAT('%', :search, '%')); "
			+ "", nativeQuery = true)
	List<prestamo> buscar(String search);
}
