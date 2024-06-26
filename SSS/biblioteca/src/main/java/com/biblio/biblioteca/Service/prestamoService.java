package com.biblio.biblioteca.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblio.biblioteca.Entity.prestamo;
import com.biblio.biblioteca.IRepository.IPrestamoRepository;
import com.biblio.biblioteca.Service.ObjetoT.ObjectTService;

@Service
public class prestamoService extends ObjectTService<prestamo>{
	
	 @Autowired
	  private IPrestamoRepository repository;
	
	@Override
	public prestamo save(prestamo object) throws Exception {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

}
