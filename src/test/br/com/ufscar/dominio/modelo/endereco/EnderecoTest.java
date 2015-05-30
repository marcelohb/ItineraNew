package br.com.ufscar.dominio.modelo.endereco;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.ufscar.dominio.modelo.endereco.CEP;
import br.com.ufscar.dominio.modelo.endereco.Endereco;
import br.com.ufscar.dominio.modelo.endereco.TipoLogradouro;

public class EnderecoTest {

	@Test
	public void igualdade() {
		assertEquals(new Endereco(new CEP("11111111"),
					 TipoLogradouro.RUA,
					 "X",
					 123,
					 "JD"), 
					 new Endereco(new CEP("11111111"),
					 TipoLogradouro.RUA,
					 "X",
					 123,
					 "JD"));
	}
	
	@Test
	public void diferenca() {
		assertNotEquals(new Endereco(new CEP("11111111"),
					 TipoLogradouro.TRAVESSA,
					 "X",
					 123,
					 "JD"), 
					 new Endereco(new CEP("11111111"),
					 TipoLogradouro.RUA,
					 "X",
					 123,
					 "JD"));
	}
	
	@Test
	public void retornaCep() {
		CEP cep = new CEP("14055560");
		assertEquals("14055560",cep.retornaCEP());
	}
	
	@Test
	public void cepFormatado() {
		CEP cep = new CEP("14055560");
		assertEquals("14055-560",cep.retornaCEPFormatado());
	}

	@Test
	public void tipoLogradouroPeloTipo() {
		assertEquals(TipoLogradouro.obterTipoLogradouro('R'), TipoLogradouro.RUA);
	}
}
