package br.com.ufscar.dominio.modelo.categoriaVeiculo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CategoriaVeiculoTest {
	
	CategoriaVeiculo categoria;
	
	@Before
	public void setup() {
		categoria = new CategoriaVeiculo(new CategoriaVeiculoId("123"), "REBOQUE",'S');
	}

	@Test
	public void igualdade() {
		assertEquals(new CategoriaVeiculo(new CategoriaVeiculoId("123"), "REBOQUE",'S'), new CategoriaVeiculo(new CategoriaVeiculoId("123"), "REBOQUE",'S'));				
	}

	@Test
	public void diferente() {
		assertNotEquals(new CategoriaVeiculo(new CategoriaVeiculoId("1234"), "REBOQUE",'S'), new CategoriaVeiculo(new CategoriaVeiculoId("123"), "REBOQUE",'S'));				
	}
	
	@Test
	public void ehReboque() {
		assertEquals(categoria.ehReboque(), 'S');
	}
}
