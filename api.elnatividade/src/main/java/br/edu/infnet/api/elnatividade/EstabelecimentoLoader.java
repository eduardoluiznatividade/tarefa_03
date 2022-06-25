package br.edu.infnet.api.elnatividade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.api.elnatividade.model.domain.Estabelecimento;
import br.edu.infnet.api.elnatividade.model.service.EstabelecimentoService;

@Component
class EstabelecimentoLoader implements ApplicationRunner{

	@Autowired
	private EstabelecimentoService estabelecimentoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Estabelecimento estabelecimento = null;
		
		try {
			estabelecimento = new Estabelecimento();
			estabelecimento.setCnpj("212121");
			estabelecimento.setEdtech(true);
			estabelecimento.setEndereco("Rua x");
			estabelecimento.setNome("Eduardo");
			estabelecimento.setSenha("123");
			estabelecimentoService.incluir(estabelecimento);
			System.out.println("Sucesso Inclusao realizada ".concat(estabelecimento.getNome()));
		
		} catch (Exception e) {
			System.out.println("Erro Inclusao não realizada ".concat(estabelecimento.getNome()));
			
		}
	}

}
