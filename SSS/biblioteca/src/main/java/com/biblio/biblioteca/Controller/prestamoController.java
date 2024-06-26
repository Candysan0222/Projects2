package com.biblio.biblioteca.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblio.biblioteca.Controller.ObjetoT.ObjectTController;
import com.biblio.biblioteca.Entity.prestamo;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("Api/biblioteca/prestamo")
public class prestamoController extends ObjectTController<prestamo>{

}
