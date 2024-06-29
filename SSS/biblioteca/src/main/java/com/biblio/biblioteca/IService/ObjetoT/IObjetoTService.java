package com.biblio.biblioteca.IService.ObjetoT;

import java.util.List;
import java.util.Optional;


public interface IObjetoTService<T> {

	List<T> all() throws Exception;

    Optional<T> findById(Long id) throws Exception;

    T save(T object) throws Exception;

    void update(Long id, T object) throws Exception;

    void delete(Long id) throws Exception;
    
    public List<T> findByEstadoTrue();


}
