package br.com.ufscar.dominio.modelo.ordemColeta;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.ufscar.dominio.modelo.motorista.MotoristaId;

public interface OrdemColetaRepositorio extends CrudRepository<OrdemColeta, Long> {

	List<OrdemColeta> findByDataBetween(Date dataInicio, Date dataFim);

	List<OrdemColeta> findByMotorista(MotoristaId motoristaId);

	OrdemColeta findByOrdemColetaId(OrdemColetaId ordemColetaId);

	List<OrdemColeta> findByMotoristaAndDataBetween(MotoristaId motorista, Date dataInicial, Date dataFinal);

}
