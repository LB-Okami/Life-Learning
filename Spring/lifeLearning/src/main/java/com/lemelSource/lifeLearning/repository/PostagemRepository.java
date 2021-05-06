package com.lemelSource.lifeLearning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lemelSource.lifeLearning.model.Postagem;
import com.lemelSource.lifeLearning.model.TemaLifeLarning;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	public List<Postagem> findAllByDescricaoContainingIgnoreCase (String descricao);

}
