package br.edu.infnet.api.elnatividade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.api.elnatividade.model.domain.Estabelecimento;
import br.edu.infnet.api.elnatividade.model.domain.Funcionario;
import br.edu.infnet.api.elnatividade.model.service.FuncionarioService;

@Component
public class FuncionarioLoader implements ApplicationRunner{
	
	@Autowired FuncionarioService funcionarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Funcionario funcionario = null;
		Estabelecimento estabelecimento = null;
		
		try {
			estabelecimento = new Estabelecimento();
			estabelecimento.setId(1);
			
			funcionario = new Funcionario();
			funcionario.setCpf("3232323");
			funcionario.setEmail("funcionario@teste.com");
			funcionario.setTelefone("99900088");
			funcionario.setNome("Luiz");
			funcionario.setSenha("");
			funcionario.setSenha("123");
			funcionario.setEstabelecimento(estabelecimento);
			
			funcionarioService.incluir(funcionario);
			System.out.println("Sucesso Inclusao realizada ".concat(funcionario.getNome()));
		
		} catch (Exception e) {
			System.out.println("Erro Inclusao não realizada ".concat(funcionario.getNome()));
			
		}
		
	}

}
