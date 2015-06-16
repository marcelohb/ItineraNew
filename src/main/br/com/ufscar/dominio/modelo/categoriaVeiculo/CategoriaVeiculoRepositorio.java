package br.com.ufscar.dominio.modelo.categoriaVeiculo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CategoriaVeiculoRepositorio extends CrudRepository<CategoriaVeiculo, Long> {
	
	List<CategoriaVeiculo> findByCategoriaVeiculoId(CategoriaVeiculoId categoriaVeiculoId);

}