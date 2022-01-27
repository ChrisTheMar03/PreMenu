package com.christhemar.prestamo.app.interfaceService;

import java.util.Optional;

import com.christhemar.prestamo.app.model.Usuario;

public interface IUsuarioService {

	public Optional<Usuario> validarCorreo(String correo,String clave);
	public int guardar(Usuario usu);
}
