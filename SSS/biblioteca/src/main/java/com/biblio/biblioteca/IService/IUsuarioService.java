package com.biblio.biblioteca.IService;

import java.util.List;

import com.biblio.biblioteca.Entity.usuario;
import com.biblio.biblioteca.IService.ObjetoT.IObjetoTService;

public interface IUsuarioService extends IObjetoTService<usuario>{

	List<usuario> buscar(String search);
}
