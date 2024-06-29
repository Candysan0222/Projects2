package com.biblio.biblioteca.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblio.biblioteca.Entity.libro;
import com.biblio.biblioteca.IRepository.ILibroRepository;
import com.biblio.biblioteca.IService.ILibroService;
import com.biblio.biblioteca.Service.ObjetoT.ObjectTService;

@Service
public class libroService extends ObjectTService<libro> implements ILibroService{

	
	 @Autowired
	  private ILibroRepository repository;
	 
	@Override
	public libro save(libro object) throws Exception {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public List<libro> buscar(String search) {
		// TODO Auto-generated method stub
		return repository.buscar(search);
	}


}
