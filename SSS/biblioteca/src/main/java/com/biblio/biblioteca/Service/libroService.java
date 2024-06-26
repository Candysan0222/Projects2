package com.biblio.biblioteca.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblio.biblioteca.Entity.libro;
import com.biblio.biblioteca.IRepository.ILibroRepository;
import com.biblio.biblioteca.Service.ObjetoT.ObjectTService;

@Service
public class libroService extends ObjectTService<libro>{

	
	 @Autowired
	  private ILibroRepository repository;
	 
	@Override
	public libro save(libro object) throws Exception {
		// TODO Auto-generated method stub
		return repository.save(object);
	}


}
