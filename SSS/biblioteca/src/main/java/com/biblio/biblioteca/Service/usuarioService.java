package com.biblio.biblioteca.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblio.biblioteca.Entity.usuario;
import com.biblio.biblioteca.IRepository.IUsuarioRepository;
import com.biblio.biblioteca.IService.IUsuarioService;
import com.biblio.biblioteca.Service.ObjetoT.ObjectTService;


@Service
public class usuarioService extends ObjectTService<usuario> implements IUsuarioService{
	
	 @Autowired
	  private IUsuarioRepository repository;
	
	@Override
	public usuario save(usuario object) throws Exception {
		// TODO Auto-generated method stub
		return repository.save(object);
	}
	
	@Override
	public List<usuario> buscar(String search){
		
		return repository.buscar(search);
	}

}
