package com.biblio.biblioteca.IService;

import java.util.List;

import com.biblio.biblioteca.Entity.libro;
import com.biblio.biblioteca.IService.ObjetoT.IObjetoTService;

public interface ILibroService extends IObjetoTService<libro>{

	List<libro> buscar(String search);
}
