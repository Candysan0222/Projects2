package com.biblio.biblioteca.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblio.biblioteca.Entity.multas;
import com.biblio.biblioteca.IRepository.ILibroRepository;
import com.biblio.biblioteca.IRepository.IMultaRepository;
import com.biblio.biblioteca.Service.ObjetoT.ObjectTService;

@Service
public class multasService extends ObjectTService<multas>{

	 @Autowired
	  private IMultaRepository repository;
	
	@Override
	public multas save(multas object) throws Exception {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

}
