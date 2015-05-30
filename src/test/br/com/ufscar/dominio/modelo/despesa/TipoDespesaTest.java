package br.com.ufscar.dominio.modelo.despesa;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.ufscar.dominio.modelo.despesa.TipoDespesa;
import br.com.ufscar.dominio.modelo.despesa.TipoDespesaId;

public class TipoDespesaTest {

	@Test
	public void igualdade() {
		assertEquals(new TipoDespesa(new TipoDespesaId("123"), "ALIMENTACAO",'N'), new TipoDespesa(new TipoDespesaId("123"), "ALIMENTACAO",'N'));
	}

	@Test
	public void diferenca() {
		assertNotEquals(new TipoDespesa(new TipoDespesaId("123"), "ALIMENTACAO",'S'), new TipoDespesa(new TipoDespesaId("123"), "ALIMENTACAO",'N'));
	}
}
