package br.com.ufscar.dominio.modelo.veiculo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlacaTest {

	@Test
	public void igualdade() {
		assertEquals(new Placa("AAA1234"), new Placa("AAA1234"));
	}
	
	@Test
	public void diferente() {
		assertNotEquals(new Placa("AAA1234"), new Placa("AAA1235"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void somenteNumeros() {
		new Placa("1111234");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void somenteLetras() {
		new Placa("AAAA123");
	}
	
	@Test
	public void placaFormatada() {
		Placa placa = new Placa("AAA1234");
		assertEquals("AAA-1234", placa.placaFormatada());
	}
	
	@Test
	public void letrasMinusculas() {
		assertEquals(new Placa("AAA1234"), new Placa("aaa1234"));
	}

}
