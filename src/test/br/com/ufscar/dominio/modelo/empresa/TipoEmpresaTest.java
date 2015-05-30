package br.com.ufscar.dominio.modelo.empresa;

import static org.junit.Assert.*;

import org.junit.Test;

public class TipoEmpresaTest {

	@Test
	public void igualdade() {
		assertEquals(TipoEmpresa.FORNECEDOR, TipoEmpresa.obterPeloTipo('N'));
	}
	
	@Test
	public void diferenca() {
		assertNotEquals(TipoEmpresa.FORNECEDOR, TipoEmpresa.obterPeloTipo('C'));
	}

}
