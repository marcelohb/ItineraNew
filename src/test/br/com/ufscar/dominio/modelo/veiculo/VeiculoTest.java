package br.com.ufscar.dominio.modelo.veiculo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VeiculoTest {

	@Test
	public void igualdade() {
		assertEquals(new Veiculo(new VeiculoId("1"), new Placa("AAA1234")), new Veiculo(new VeiculoId("1"), new Placa("AAA1234")));
	}
	
	@Test
	public void preencherDadosComplementares() {
		// metodos de teste 
	}

}