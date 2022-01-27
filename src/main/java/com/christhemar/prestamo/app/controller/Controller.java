package com.christhemar.prestamo.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.christhemar.prestamo.app.interfaceService.IUsuarioService;
import com.christhemar.prestamo.app.model.Usuario;


@org.springframework.stereotype.Controller
public class Controller {

public String nombre="";
	
	@Autowired
	private IUsuarioService data;

	@GetMapping("/login")
	public String login(Model model) {
		return "/login";
	}
	
	@PostMapping("/login")
	public String loginPost(Usuario log, Model model) {
		log.setNombre("Anonimo");
		Optional<Usuario> res=data.validarCorreo(log.getCorreo(), log.getClave());
		if(res.isEmpty()) {
			return "login";
		}
		nombre=log.getNombre()!=null?log.getNombre():"";
		return "redirect:/main";
	
	}
	
	@PostMapping("/registro")
	public String registroUser(Usuario usuario,Model model) {
		int res=data.guardar(usuario);
		if(res!=0) {
			return "redirect:/login";
		}
		return "";
	}
	
	@GetMapping("/main")
	public String main(Model model) {
		//model.addAttribute("nombre", nombre);
		return "main";
	}
	
}
