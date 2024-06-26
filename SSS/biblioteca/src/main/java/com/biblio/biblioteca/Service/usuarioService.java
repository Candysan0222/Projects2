package com.biblio.biblioteca.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblio.biblioteca.Entity.usuario;
import com.biblio.biblioteca.IRepository.IUsuarioRepository;
import com.biblio.biblioteca.Service.ObjetoT.ObjectTService;


@Service
public class usuarioService extends ObjectTService<usuario>{
	
	 @Autowired
	  private IUsuarioRepository repository;
	
	@Override
	public usuario save(usuario object) throws Exception {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

}
