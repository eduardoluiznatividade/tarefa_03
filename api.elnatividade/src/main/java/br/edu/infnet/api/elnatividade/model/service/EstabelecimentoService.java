package br.edu.infnet.api.elnatividade.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.api.elnatividade.model.domain.Estabelecimento;
import br.edu.infnet.api.elnatividade.model.repository.EstabelecimentoRepository;

@Service
public class EstabelecimentoService {
	
	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;
	
	public void incluir(Estabelecimento estabelecimento) {
		estabelecimentoRepository.save(estabelecimento);
	}
}
