package com.biblio.biblioteca.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biblio.biblioteca.Controller.ObjetoT.ObjectTController;
import com.biblio.biblioteca.Entity.libro;
import com.biblio.biblioteca.Service.libroService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("Api/biblioteca/libros")
public class libroController extends ObjectTController<libro>{

	@Autowired
	private libroService service;
	
	@Operation(summary = "Consultar registro por filtro", responses = {
			@ApiResponse(responseCode = "200", description = "Consulta realizada"),
			@ApiResponse(responseCode = "404", description = "No se encontraron consultas") })
	@GetMapping("/filtro")
	public List<libro> buscar(@RequestParam(required = false) String search ) throws Exception {
		return service.buscar(search);
	}
}
