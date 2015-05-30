package br.com.ufscar.dominio.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TelefoneTest {

	@Test
	public void igualdade() {
		assertEquals(new Telefone("16","36335521","casa", TipoTelefone.RESIDENCIAL), new Telefone("16","36335521","casa",TipoTelefone.RESIDENCIAL));
	}
	
	@Test
	public void diferentes() {
		assertNotEquals(new Telefone("16","36335521","casa",TipoTelefone.RESIDENCIAL), new Telefone("16","36335521","casa",TipoTelefone.FAX));
	}

}
