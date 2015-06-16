package br.com.ufscar.dominio.modelo.categoriaVeiculo;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.ufscar.Application;
import br.com.ufscar.dominio.modelo.categoriaVeiculo.CategoriaVeiculo;
import br.com.ufscar.dominio.modelo.categoriaVeiculo.CategoriaVeiculoId;
import br.com.ufscar.dominio.modelo.categoriaVeiculo.CategoriaVeiculoRepositorio;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class CategoriaVeiculoRepositorioTest {

	@Autowired
	CategoriaVeiculoRepositorio repositorio;
	
	@Autowired
	private EntityManager em;
	
	@Before
	public void setUp() {
	}
	
	@Test
	public void salvar() {
		CategoriaVeiculo catV = repositorio.save(new CategoriaVeiculo(new CategoriaVeiculoId("123"), "CARRETA", 'T'));
		assertEquals('T', catV.ehReboque());
	}

}