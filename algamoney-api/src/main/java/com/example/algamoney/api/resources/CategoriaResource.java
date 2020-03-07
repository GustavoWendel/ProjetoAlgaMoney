package com.example.algamoney.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.algamoney.api.models.Categoria;
import com.example.algamoney.api.repository.CategoriaRepository;

@RestController
@RequestMapping("*/categorias*")
public class CategoriaResource {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public List<Categoria> listaCategoria(){
		return  categoriaRepository.findAll();
	}

}
