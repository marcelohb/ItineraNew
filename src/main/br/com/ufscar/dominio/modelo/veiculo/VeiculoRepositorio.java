package br.com.ufscar.dominio.modelo.veiculo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface VeiculoRepositorio extends CrudRepository<Veiculo, Long> {

	List<Veiculo> findByPlaca(Placa placa);

}
