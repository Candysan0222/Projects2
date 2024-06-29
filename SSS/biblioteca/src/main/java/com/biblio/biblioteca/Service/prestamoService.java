package com.biblio.biblioteca.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblio.biblioteca.Entity.prestamo;
import com.biblio.biblioteca.IRepository.IPrestamoRepository;
import com.biblio.biblioteca.IService.IPrestamoService;
import com.biblio.biblioteca.Service.ObjetoT.ObjectTService;

@Service
public class prestamoService extends ObjectTService<prestamo> implements IPrestamoService{
	
	 @Autowired
	  private IPrestamoRepository repository;
	
	@Override
	public prestamo save(prestamo object) throws Exception {
		// TODO Auto-generated method stub
		return repository.save(object);
	}
	
	@Override
	public List<prestamo> buscar(String search){
		return repository.buscar(search);
	}

}
