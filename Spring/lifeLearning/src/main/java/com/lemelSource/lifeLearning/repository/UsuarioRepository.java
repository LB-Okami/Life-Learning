package com.lemelSource.lifeLearning.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lemelSource.lifeLearning.model.Usuario;
import com.lemelSource.lifeLearning.model.UsuarioLogin;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByNome(String usuario);
}
