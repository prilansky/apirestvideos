package com.filmes.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.filmes.apirest.models.Filmes;
import com.filmes.apirest.repository.FilmeRepository;

@RestController
@RequestMapping(value="/api")
public class FilmeResource {

	@Autowired
	private FilmeRepository filmeRepository;
	
	@GetMapping("/filmes")
	public List<Filmes> listaFilmes(){
		return filmeRepository.findAll();
	}
	
	@GetMapping("/filmes{id}")
	public Filmes listaFilmeUnico(@PathVariable(value="id") long id) {
		return filmeRepository.findById(id);
    }
	
	@PostMapping("/filme")
	public Filmes salvaFilme(@RequestBody Filmes filme) {
		return filmeRepository.save(filme);
	}
	
	@DeleteMapping("/filme")
	public void deletaFilmes(@RequestBody Filmes filme) {
		filmeRepository.delete(filme);
	}
	
	@PutMapping("/filme")
	public Filmes atualizaFilme(@RequestBody Filmes filme) {
		return filmeRepository.save(filme);
	}
}

