package br.com.ufscar.dominio.modelo.empresa;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.ufscar.dominio.modelo.MunicipioId;

public class EmpresaTest {

	@Test
	public void igualdadeEmpresaID() {
		EmpresaId id1 = new EmpresaId("123");
		assertEquals(new EmpresaId("123"), id1);
	}

	@Test
	public void desigualdadeEmpresaID() {
		EmpresaId id1 = new EmpresaId("123");
		assertNotEquals(new EmpresaId("122"), id1);
	}
	
	@Test
	public void igualdadeEmpresas() {
		Empresa usina = new Empresa(new EmpresaId("123"), new CNPJ("11222333000122"),new IE("1234567890"), "EMPRESA FANTASIA", "NOME EMPRESA", TipoEmpresa.FORNECEDOR, new MunicipioId("999"));
		Empresa usina2 = new Empresa(new EmpresaId("123"), new CNPJ("11222333000122"),new IE("1234567890"), "EMPRESA FANTASIA", "NOME EMPRESA", TipoEmpresa.FORNECEDOR, new MunicipioId("999"));
		assertEquals(usina, usina2);
	}

}
