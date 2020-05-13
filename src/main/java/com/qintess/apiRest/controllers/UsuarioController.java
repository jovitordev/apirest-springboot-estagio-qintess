package com.qintess.apiRest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qintess.apiRest.entidades.Usuario;
import com.qintess.apiRest.repository.UsuarioRepository;

@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping("/usuario")
	public List<Usuario> getUsuario() {
		return usuarioRepository.findAll();
	}

	@PostMapping("/usuario")
	public void criarUsuario(@RequestBody Usuario usuario) {
		usuarioRepository.save(usuario);
	}
}
