package com.christhemar.prestamo.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.christhemar.prestamo.app.model.Usuario;

@Repository
public interface IUsuario extends JpaRepository<Usuario, Integer>{

	public Optional<Usuario> findByCorreoAndClave(String correo, String clave);
	
}
