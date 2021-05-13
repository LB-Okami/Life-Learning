package com.lemelSource.lifeLearning.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lemelSource.lifeLearning.model.Usuario;
import com.lemelSource.lifeLearning.model.UsuarioLogin;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Optional<Usuario> findByNome(String nome);
	public Optional<Usuario> findByEmail(String email);
	
}
