package br.com.ufscar.dominio.modelo.ordemColeta;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.ufscar.Application;
import br.com.ufscar.dominio.modelo.empresa.EmpresaId;
import br.com.ufscar.dominio.modelo.motorista.MotoristaId;
import br.com.ufscar.dominio.modelo.veiculo.Placa;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class OrdemColetaRepositorioTest {

	@Autowired
	OrdemColetaRepositorio repositorio;
	
	OrdemColeta ordemColeta1;
	OrdemColeta ordemColeta2;
	OrdemColeta ordemColeta3;
	
	@Before
	public void setUp() {
		repositorio.deleteAll();
		ordemColeta1 = new OrdemColeta(new OrdemColetaId("1"),
				new Date(2015, 8, 22), 1.0, 1.0,
				"1238128", new Placa("AAA3322"), new MotoristaId(
						"999"), new EmpresaId("444"), new EmpresaId("555"));
		ordemColeta2 = new OrdemColeta(new OrdemColetaId("2"),
				new Date(2015, 8, 1), 14.5, 2.0,
				"1238128", new Placa("AAA3322"), new MotoristaId(
						"999"), new EmpresaId("444"), new EmpresaId("555"));
		ordemColeta3 = new OrdemColeta(new OrdemColetaId("3"),
				new Date(2015, 9, 22), 5.0, 3.0,
				"1238128", new Placa("AAA3322"), new MotoristaId(
						"997"), new EmpresaId("444"), new EmpresaId("555"));
		repositorio.save(ordemColeta1);
		repositorio.save(ordemColeta2);
		repositorio.save(ordemColeta3);
	}
	
	@Test
	public void salvar() {
		OrdemColeta ordemColeta = new OrdemColeta(new OrdemColetaId("123"),
				new Date(2015, 8, 22), new Double(15.0), new Double(1.0),
				"1238128", new Placa("AAA3322"), new MotoristaId(
						"999"), new EmpresaId("444"), new EmpresaId("555"));
		OrdemColeta oc = repositorio.save(ordemColeta);
		assertEquals(oc.getId(), ordemColeta.getId());
		assertEquals(oc.getData(), ordemColeta.getData());
		assertEquals(oc.getValorUnitario(), ordemColeta.getValorUnitario());
		assertEquals(oc.getQuantidade(), ordemColeta.getQuantidade());
		assertEquals(oc.getNumeroNotaFiscal(), ordemColeta.getNumeroNotaFiscal());
		assertEquals(oc.getVeiculo().getPlaca(), ordemColeta.getVeiculo().getPlaca());
		assertEquals(oc.getMotorista(), ordemColeta.getMotorista());
		assertEquals(oc.getOrigem(), ordemColeta.getOrigem());
		assertEquals(oc.getDestino(), ordemColeta.getDestino());
	}
	
	@Test
	public void buscarPelaData() {
		int quantidadeEmSetembro = 0;
		List<OrdemColeta> ocs = repositorio.findByDataBetween(new Date(2015, 9, 1), new Date(2015, 9, 30));
		for (OrdemColeta ordemColeta : ocs) {
			quantidadeEmSetembro += 1;
		}
		assertEquals(1, quantidadeEmSetembro);
	}
	
	@Test
	public void buscarPorMotorista() {
		int quantidadeDoMotorista1 = 0;
		List<OrdemColeta> ocs = repositorio.findByMotorista(new MotoristaId("999"));
		for (OrdemColeta ordemColeta : ocs) {
			quantidadeDoMotorista1 += 1;
		}
		assertEquals(2, quantidadeDoMotorista1);
	}
	
	@Test
	public void calcularTotalPorPeriodo() {

		Double total = 0.0;
		Double quantidadeDeItens = 0.0;
		List<OrdemColeta> ocs = repositorio.findByDataBetween(new Date(2015, 9, 1), new Date(2015, 9, 30));
		for (OrdemColeta ordemColeta : ocs) {
			total += ordemColeta.getValorUnitario() * ordemColeta.getQuantidade();
			quantidadeDeItens += ordemColeta.getQuantidade();
		}
		assertEquals(0,total.compareTo(new Double(15)));
		assertEquals(0,quantidadeDeItens.compareTo(new Double(3)));
	}
	
	@Test
	public void calcularTotalPorMotorista() {

		Double total = 0.0;
		Double quantidadeDeItens = 0.0;
		List<OrdemColeta> ocs = repositorio.findByMotorista(new MotoristaId("997"));
		for (OrdemColeta ordemColeta : ocs) {
			total += ordemColeta.getValorUnitario() * ordemColeta.getQuantidade();
			quantidadeDeItens += ordemColeta.getQuantidade();
		}
		assertEquals(0,total.compareTo(new Double(15)));
		assertEquals(0,quantidadeDeItens.compareTo(new Double(3)));
	}
	
	@Test
	public void calcularTotalPorMotoristaEPeriodo() {

		Double total = 0.0;
		Double quantidadeDeItens = 0.0;
		List<OrdemColeta> ocs = repositorio.findByMotoristaAndDataBetween(new MotoristaId("997"), new Date(2015, 9, 1), new Date(2015, 9, 22));
		for (OrdemColeta ordemColeta : ocs) {
			total += ordemColeta.getValorUnitario() * ordemColeta.getQuantidade();
			quantidadeDeItens += ordemColeta.getQuantidade();
		}
		assertEquals(0,total.compareTo(15.0));
		assertEquals(0,quantidadeDeItens.compareTo(1.0));
	}

	@Test
	public void buscarPeloId() {
		OrdemColeta oc = repositorio.findByOrdemColetaId(new OrdemColetaId("1"));
		assertEquals(new OrdemColetaId("1"), oc.getOrdemColetaId());
		assertEquals(new EmpresaId("444"), oc.getOrigem());
	}
}
