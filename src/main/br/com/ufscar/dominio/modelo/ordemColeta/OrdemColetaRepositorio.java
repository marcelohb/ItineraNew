package br.com.ufscar.dominio.modelo.ordemColeta;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OrdemColetaRepositorio extends CrudRepository<OrdemColeta, Long> {

	List<OrdemColeta> findByDataBetween(Date dataInicio, Date dataFim);

}
