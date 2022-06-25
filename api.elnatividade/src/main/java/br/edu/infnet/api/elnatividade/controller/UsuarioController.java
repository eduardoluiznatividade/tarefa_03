package br.edu.infnet.api.elnatividade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.edu.infnet.api.elnatividade.model.domain.Usuario;
import br.edu.infnet.api.elnatividade.model.service.UsuarioService;

//@Controller
@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping(value = "/validar")
	public Usuario validar(@RequestParam String login, @RequestParam String senha) {
		return usuarioService.validar(login, senha);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(Integer id) {
		usuarioService.excluir(id);
	}
	
	@GetMapping(value = "/listar")
	public List<Usuario> obterLista(){
		return usuarioService.obterLista();
	}

}
