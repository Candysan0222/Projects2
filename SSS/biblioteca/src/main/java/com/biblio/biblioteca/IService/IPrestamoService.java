package com.biblio.biblioteca.IService;

import java.util.List;

import com.biblio.biblioteca.Entity.prestamo;
import com.biblio.biblioteca.IService.ObjetoT.IObjetoTService;

public interface IPrestamoService extends IObjetoTService<prestamo>{
	List<prestamo> buscar(String search);
}
