package br.com.ufscar.dominio.modelo.empresa;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.ufscar.Application;
import br.com.ufscar.dominio.modelo.MunicipioId;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class EmpresaRepositorioTest {

	@Autowired
	EmpresaRepositorio repositorio;
	
	@Test
	public void salvar() {
		Empresa empresa = new Empresa(new EmpresaId("123"),	new CNPJ("1111"), new IE("999"), "FANTASIA", "RAZAO SOCIAL", TipoEmpresa.FILIAL, new MunicipioId("7"));
		Empresa emp1 = repositorio.save(empresa);
		assertEquals(emp1.getEmpresaId(), empresa.getEmpresaId());
		assertEquals(emp1.getCnpj(), empresa.getCnpj());
		assertEquals(emp1.getIe(), empresa.getIe());
		assertEquals(emp1.getNomeFantasia(), empresa.getNomeFantasia());
		assertEquals(emp1.getRazaoSocial(), empresa.getRazaoSocial());
		assertEquals(emp1.getTipoEmpresa(), empresa.getTipoEmpresa());
		assertEquals(emp1.getMunicipio(), empresa.getMunicipio());
	}
	
	@Test
	public void alterarTipoEmpresa() {
		Empresa empresa = new Empresa(new EmpresaId("123"),	new CNPJ("1111"), new IE("999"), "FANTASIA", "RAZAO SOCIAL", TipoEmpresa.FILIAL, new MunicipioId("7"));
		empresa.alterarTipo(TipoEmpresa.FORNECEDOR);
		assertEquals(TipoEmpresa.FORNECEDOR, empresa.getTipoEmpresa());
	}

}
