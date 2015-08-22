package br.com.ufscar.dominio.modelo.despesa;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.ufscar.dominio.modelo.motorista.MotoristaId;

public interface DespesaRepositorio extends CrudRepository<Despesa, Long> {
	
	List<Despesa> findByDespesaId(DespesaId id);

	List<Despesa> findByMotoristaId(MotoristaId motoristaId);

	List<Despesa> findByDataBetween(Date dataInicial, Date dataFinal);

}
