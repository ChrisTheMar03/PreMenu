package com.christhemar.prestamo.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.christhemar.prestamo.app.interfaceService.IUsuarioService;
import com.christhemar.prestamo.app.model.Usuario;
import com.christhemar.prestamo.app.repository.IUsuario;

@Service
public class UsuarioService implements IUsuarioService{

	@Autowired
	private IUsuario data;
	
	@Override
	public Optional<Usuario> validarCorreo(String correo, String clave) {
		// TODO Auto-generated method stub
		return data.findByCorreoAndClave(correo, clave);
	}

	@Override
	public int guardar(Usuario usu) {
		// TODO Auto-generated method stub
		int res=0;
		Usuario usuario=data.save(usu);
		if(!usuario.equals(null)) {
			res=1;
		}
		return res;
	}

}
