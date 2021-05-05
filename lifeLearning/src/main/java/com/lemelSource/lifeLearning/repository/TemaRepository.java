package com.lemelSource.lifeLearning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lemelSource.lifeLearning.model.TemaLifeLarning;

@Repository
public interface TemaRepository extends JpaRepository<TemaLifeLarning, Long> {
	public List<TemaLifeLarning> findAllByTituloContainingIgnoreCase (String titulo);
}
