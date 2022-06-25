package br.edu.infnet.api.elnatividade.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.api.elnatividade.model.domain.Funcionario;
import br.edu.infnet.api.elnatividade.model.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository funcionarioService;
	
	public List<Funcionario> obterLista(Integer idEstabelecimento){
		return funcionarioService.obterLista(idEstabelecimento);
	}
	
	public void incluir(Funcionario funcionario) {
		funcionarioService.save(funcionario);
	}

}
