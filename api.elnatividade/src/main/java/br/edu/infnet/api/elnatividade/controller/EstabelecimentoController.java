package br.edu.infnet.api.elnatividade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.api.elnatividade.model.domain.Estabelecimento;
import br.edu.infnet.api.elnatividade.model.service.EstabelecimentoService;

//@Controller
@RestController
@RequestMapping("/api/estabelecimento")
public class EstabelecimentoController {
	
	private EstabelecimentoService estabelecimentoService;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Estabelecimento estabelecimento) {
		estabelecimentoService.incluir(estabelecimento);
	}

}
