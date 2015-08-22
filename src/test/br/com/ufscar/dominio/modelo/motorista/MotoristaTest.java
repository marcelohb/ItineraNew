package br.com.ufscar.dominio.modelo.motorista;

import static org.junit.Assert.assertEquals;

import java.sql.Date;

import org.junit.Before;
import org.junit.Test;

import br.com.ufscar.dominio.modelo.endereco.CEP;
import br.com.ufscar.dominio.modelo.endereco.Endereco;
import br.com.ufscar.dominio.modelo.endereco.TipoLogradouro;

public class MotoristaTest {

	Motorista motorista;
	
	@Before
	public void setUp() {
		motorista = new Motorista(new MotoristaId("123"),"MARCELO", new CPF("12345678901"));
	}
	
	@Test
	public void igualdade() {
		Motorista marcelo = new Motorista(new MotoristaId("123"),"MARCELO", new CPF("12345678901"));
		assertEquals(new Motorista(new MotoristaId("123"), "MARCELO", new CPF("12345678901")), marcelo);
	}
	
	@Test
	public void incluirRG() {
		motorista.alterarRG(new RG("1122233345"));
		assertEquals(new RG("1122233345"), motorista.getRg());
	}
	
	@Test
	public void alterarNome() {
		motorista.alterarNome("MARCOS");
		assertEquals("MARCOS", motorista.getNome());
	}
	
	@Test
	public void incluirFiliacao() {
		motorista.filiacao("NOME DO PAI","NOME DA MAE");
		assertEquals("NOME DO PAI", motorista.getNomePai());
		assertEquals("NOME DA MAE", motorista.getNomeMae());
	}
	
	@Test
	public void incluirDataDeNascimento() {
		motorista.alterarDataDeNascimento(new Date(1987, 2, 12));
		assertEquals(new Date(1987, 2, 12), motorista.getDataNascimento());
	}
	
	@Test
	public void incluirEstadoCivil() {
		motorista.alterarEstadoCivil(EstadoCivil.CASADO);
		assertEquals(EstadoCivil.CASADO, motorista.getEstadoCivil());
	}
	
	@Test
	public void incluirDependentes() {
		motorista.alterarDependentes(2);
		assertEquals(2, motorista.getDependentes());
	}
	
	@Test
	public void incluirEndereco() {
		motorista.alterarEndereco(new Endereco(new CEP("12345678"), TipoLogradouro.AVENIDA, "FRANCISCO JUNQUEIRA", new Integer(1999), "JARDIM BAIRRO"));
		motorista.getEndereco().preencherComplemento("AP 123");
		assertEquals("AP 123", motorista.getEndereco().getComplemento());
		assertEquals(new CEP("12345678"), motorista.getEndereco().getCep());
		assertEquals(TipoLogradouro.AVENIDA, motorista.getEndereco().getTipoLogradouro());
		assertEquals("FRANCISCO JUNQUEIRA", motorista.getEndereco().getLogradouro());
		assertEquals(new Integer(1999), motorista.getEndereco().getNumero());
		assertEquals("JARDIM BAIRRO", motorista.getEndereco().getBairro());
	}
	
	@Test
	public void incluirContaCorrente() {
		motorista.alterarContaCorrente(new ContaCorrente(1, "12345-2", "12345-3"));
		assertEquals(new ContaCorrente(1, "12345-2", "12345-3"), motorista.getContaCorrente());
	}

}