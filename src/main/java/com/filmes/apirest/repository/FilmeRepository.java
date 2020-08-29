package com.filmes.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.filmes.apirest.models.Filmes;

@Repository
public interface FilmeRepository extends JpaRepository<Filmes, Long>{

	Filmes findById(long id);
	
}
