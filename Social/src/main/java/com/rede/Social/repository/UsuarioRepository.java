package com.rede.Social.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rede.Social.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	Optional<Usuario> findByUsuario(String usuario);

}
