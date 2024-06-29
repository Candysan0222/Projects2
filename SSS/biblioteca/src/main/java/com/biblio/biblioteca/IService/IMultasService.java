package com.biblio.biblioteca.IService;

import java.util.List;

import com.biblio.biblioteca.Entity.multas;
import com.biblio.biblioteca.IService.ObjetoT.IObjetoTService;

public interface IMultasService extends IObjetoTService<multas>{

	List<multas> buscar(String search);
}
