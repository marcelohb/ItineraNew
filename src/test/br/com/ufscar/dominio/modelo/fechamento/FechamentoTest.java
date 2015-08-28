package br.com.ufscar.dominio.modelo.fechamento;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.ufscar.Application;
import br.com.ufscar.dominio.modelo.despesa.Despesa;
import br.com.ufscar.dominio.modelo.despesa.DespesaId;
import br.com.ufscar.dominio.modelo.despesa.DespesaRepositorio;
import br.com.ufscar.dominio.modelo.empresa.EmpresaId;
import br.com.ufscar.dominio.modelo.motorista.MotoristaId;
import br.com.ufscar.dominio.modelo.ordemColeta.OrdemColeta;
import br.com.ufscar.dominio.modelo.ordemColeta.OrdemColetaId;
import br.com.ufscar.dominio.modelo.ordemColeta.OrdemColetaRepositorio;
import br.com.ufscar.dominio.modelo.planodecontas.PlanoDeContasId;
import br.com.ufscar.dominio.modelo.veiculo.Placa;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class FechamentoTest {

	@Autowired
	OrdemColetaRepositorio repositorio;
	
	@Autowired
	DespesaRepositorio repoDespesa;
	
	OrdemColeta ordemColeta1;
	OrdemColeta ordemColeta2;
	OrdemColeta ordemColeta3;
	
	Despesa cafe;
	Despesa almoco;
	Despesa jantar;
	
	@Before
	public void setUp() {
		repositorio.deleteAll();
		ordemColeta1 = new OrdemColeta(new OrdemColetaId("1"),
				new Date(2015, 8, 22), 1.0, 1.0,
				"1238128", new Placa("AAA3322"), new MotoristaId(
						"999"), new EmpresaId("444"), new EmpresaId("555"));
		ordemColeta2 = new OrdemColeta(new OrdemColetaId("2"),
				new Date(2015, 8, 1), 10.5, 2.0,
				"1238128", new Placa("AAA3322"), new MotoristaId(
						"999"), new EmpresaId("444"), new EmpresaId("555"));
		ordemColeta3 = new OrdemColeta(new OrdemColetaId("3"),
				new Date(2015, 9, 22), 5.0, 3.0,
				"1238128", new Placa("AAA3322"), new MotoristaId(
						"997"), new EmpresaId("444"), new EmpresaId("555"));
		repositorio.save(ordemColeta1);
		repositorio.save(ordemColeta2);
		repositorio.save(ordemColeta3);
		
		repoDespesa.deleteAll();
		cafe = new Despesa(new DespesaId("111"), new BigDecimal(1), new Date(2015,8,10), new MotoristaId("999"), new PlanoDeContasId("888"), "POSTO DO JOAO", 1.0, 2.0, 'A');
		almoco = new Despesa(new DespesaId("222"), new BigDecimal(2), new Date(2015,8,30), new MotoristaId("999"), new PlanoDeContasId("888"), "CHURRASCARIA", 1.00, 1.0, 'A');
		jantar = new Despesa(new DespesaId("333"), new BigDecimal(3), new Date(2015,8,1), new MotoristaId("987"), new PlanoDeContasId("888"), "PIZZARIA", 1.50, 1.0, 'A');
		repoDespesa.save(cafe);
		repoDespesa.save(almoco);
		repoDespesa.save(jantar);
	}
	
	@Test
	public void quantidadeDeDespesa() {
		int quantidade = 0;
		List<Despesa> despesas = repoDespesa.findByDataBetween(new Date(2015,8,1), new Date(2015,8,31));
		assertEquals(3,despesas.size());
	}
	
	@Test
	public void quantidadeDeOrdemColeta() {
		int quantidade = 0;
		List<OrdemColeta> ordensDeColetas = repositorio.findByDataBetween(new Date(2015,8,1), new Date(2015,8,31));
		assertEquals(2,ordensDeColetas.size());
	}
	
	@Test
	public void totalDespesasMensal() {
		Double totalDespesa = 0.0;
		List<Despesa> despesas = repoDespesa.findByDataBetween(new Date(2015,8,1), new Date(2015,8,31));
		for (Despesa despesa : despesas) {
			totalDespesa += despesa.getQuantidade() * despesa.getValor();
		}
		assertEquals(0,  totalDespesa.compareTo(4.50));
	}
	
	@Test
	public void totalOrdemColetaMensal() {
		Double totalOrdens = 0.0;
		List<OrdemColeta> ordensDeColetas = repositorio.findByDataBetween(new Date(2015,8,1), new Date(2015,8,31));
		for (OrdemColeta ordemColeta : ordensDeColetas) {
			totalOrdens += ordemColeta.getQuantidade() * ordemColeta.getValorUnitario();
		}
		assertEquals(0, totalOrdens.compareTo(22.0));
	}
	
	@Test
	public void realizarFechamentoMensal() {
		Double totalOrdens = 0.0;
		Double totalDespesa = 0.0;
		Double total = 0.0;
		
		List<OrdemColeta> ordensDeColetas = repositorio.findByDataBetween(new Date(2015,8,1), new Date(2015,8,31));
		for (OrdemColeta ordemColeta : ordensDeColetas) {
			totalOrdens += ordemColeta.getQuantidade() * ordemColeta.getValorUnitario();
		}
		
		List<Despesa> despesas = repoDespesa.findByDataBetween(new Date(2015,8,1), new Date(2015,8,31));
		for (Despesa despesa : despesas) {
			totalDespesa += despesa.getQuantidade() * despesa.getValor();
		}
		total = totalOrdens - totalDespesa;
		//22 - 4.5
		assertEquals(0, total.compareTo(17.5));
		
	}
	
	@Test
	public void realizarFechamentoDoMotoristaPorData() {
		Double totalOrdens = 0.0;
		Double totalDespesa = 0.0;
		Double total = 0.0;
		
		List<OrdemColeta> ordensDeColetas = repositorio.findByMotoristaAndDataBetween(new MotoristaId("999"), new Date(2015,8,1), new Date(2015,8,31));
		for (OrdemColeta ordemColeta : ordensDeColetas) {
			totalOrdens += ordemColeta.getQuantidade() * ordemColeta.getValorUnitario();
		}
		
		List<Despesa> despesas = repoDespesa.findByMotoristaAndDataBetween(new MotoristaId("999"), new Date(2015,8,1), new Date(2015,8,31));
		for (Despesa despesa : despesas) {
			totalDespesa += despesa.getQuantidade() * despesa.getValor();
		}
		total = totalOrdens - totalDespesa;
		//22 - 3
		assertEquals(0, total.compareTo(19.0));
	}

}
