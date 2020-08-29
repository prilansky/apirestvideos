package com.filmes.apirest;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.filmes.apirest.models.Filmes;
import com.filmes.apirest.repository.FilmeRepository;

@SpringBootApplication
public class ApirestApplication implements CommandLineRunner{

	@Autowired
	private FilmeRepository filmeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Filmes filme  = new Filmes("Batman", "Acao", "102", 2012);
		Filmes filme1 = new Filmes("Roben", "Acao", "102", 2015);
		Filmes filme2 = new Filmes("Homem aranha", "Acao", "102", 2017);
		Filmes filme3 = new Filmes("Super Man", "Acao", "102", 2019);
		Filmes filme4 = new Filmes("Mulher maravilha", "Acao", "102", 2005);
		Filmes filme5 = new Filmes("Coringa", "Acao", "102", 2007);
		
		filmeRepository.saveAll(Arrays.asList(filme,filme1,filme2,filme3,filme4,filme5));
	}

}
