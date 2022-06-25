package br.edu.infnet.api.elnatividade.model.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.edu.infnet.api.elnatividade.model.domain.Funcionario;

@Repository
public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {

	//	@Query("from Funcionario f where f.idEtabelecimento = :idEstabelecimento")
	@Query("from Funcionario f where f.id = :idEstabelecimento")
	public List<Funcionario> obterLista(Integer idEstabelecimento);
}
