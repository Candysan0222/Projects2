package com.biblio.biblioteca.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblio.biblioteca.Entity.multas;
import com.biblio.biblioteca.IRepository.IMultaRepository;
import com.biblio.biblioteca.IService.IMultasService;
import com.biblio.biblioteca.Service.ObjetoT.ObjectTService;

@Service
public class multasService extends ObjectTService<multas> implements IMultasService{

	 @Autowired
	  private IMultaRepository repository;
	
	@Override
	public multas save(multas object) throws Exception {
		// TODO Auto-generated method stub
		return repository.save(object);
		
	}

	@Override
	public List<multas> buscar(String search){
		
		return repository.buscar(search);
	}
}
