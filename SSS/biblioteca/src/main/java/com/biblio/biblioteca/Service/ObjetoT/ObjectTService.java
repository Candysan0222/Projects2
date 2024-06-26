package com.biblio.biblioteca.Service.ObjetoT;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblio.biblioteca.IRepository.ObjetoT.IObjectTRepository;
import com.biblio.biblioteca.IService.ObjetoT.IObjetoTService;
import com.biblio.biblioteca.Utils.GlobalConstants;





@Service
public abstract class ObjectTService<T> implements IObjetoTService<T> {

	   @Autowired
	    private IObjectTRepository<T, Long> repository;

	    @Override
	    public List<T> all() throws Exception {
	        return repository.findAll();
	    }

	    @Override
	    public Optional<T> findById(Long id) throws Exception {
	        return repository.findById(id);
	    }

	    @Override
	    public void update(Long id, T object) throws Exception {
	        Optional<T> optionalEntity = repository.findById(id);

	        if (optionalEntity.isEmpty()) {
	            throw new Exception("No se encontró registro");
	        }

	        T entityToUpdate = optionalEntity.get();
	        BeanUtils.copyProperties(object, entityToUpdate, GlobalConstants.EXCLUDED_FIELDS.toArray(new String[0]));

	        repository.save(entityToUpdate);
	    }

	    @Override
	    public void delete(Long id) throws Exception {
	        Optional<T> optionalEntity = repository.findById(id);

	        if (optionalEntity.isEmpty()) {
	            throw new Exception("No se encontró registro");
	        }

	        repository.deleteById(id);
	    }

	    @Override
	    public List<T> findByStateTrue() throws Exception {
	        throw new UnsupportedOperationException("El método findByEstadoTrue() no está implementado para esta entidad");
	    }
}
