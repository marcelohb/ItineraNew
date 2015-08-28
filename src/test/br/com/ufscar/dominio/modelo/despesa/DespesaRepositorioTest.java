package br.com.ufscar.dominio.modelo.despesa;

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
import br.com.ufscar.dominio.modelo.motorista.MotoristaId;
import br.com.ufscar.dominio.modelo.planodecontas.PlanoDeContasId;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class DespesaRepositorioTest {

	@Autowired
	DespesaRepositorio repositorio;
	
	Despesa cafe;
	Despesa almoco;
	Despesa jantar;
	
	@Before
	public void setUp() {
		repositorio.deleteAll();
		cafe = new Despesa(new DespesaId("111"), new BigDecimal(1), new Date(2015,5,10), new MotoristaId("999"), new PlanoDeContasId("888"), "POSTO DO JOAO", 5.50, 1.0, 'A');
		almoco = new Despesa(new DespesaId("222"), new BigDecimal(2), new Date(2015,5,30), new MotoristaId("999"), new PlanoDeContasId("888"), "CHURRASCARIA", 70.00, 1.0, 'A');
		jantar = new Despesa(new DespesaId("333"), new BigDecimal(3), new Date(2015,6,1), new MotoristaId("987"), new PlanoDeContasId("888"), "PIZZARIA", 29.50, 5.0, 'A');
		repositorio.save(cafe);
		repositorio.save(almoco);
		repositorio.save(jantar);
	}
	
	@Test
	public void salvar() {
		Despesa jantar2 = new Despesa(new DespesaId("333"), new BigDecimal(500000.00), new Date(), new MotoristaId("999"), new PlanoDeContasId("888"), "JAPA", 75.50, 1.0, 'A');
		Despesa mesmoJantar = repositorio.save(jantar2);
		assertEquals(mesmoJantar, jantar2);
	}
	
	@Test
	public void contaLista() {
		List<Despesa> despesas = (List<Despesa>) repositorio.findAll();
		assertEquals(3, despesas.size());
		for (Despesa despesa : despesas) {
			System.out.println(despesa.getLocal());
		}
	}

	@Test
	public void buscarPeloId() {
		List<Despesa> despesas = repositorio.findByDespesaId(new DespesaId("111"));
		Despesa cafeNoPosto = despesas.get(0);
		assertEquals(cafeNoPosto.getDespesaId(), cafe.getDespesaId());
	}
	
	@Test
	public void buscarDespesasDoMotorista() {
		List<Despesa> despesasDoMarcelo = repositorio.findByMotorista(new MotoristaId("999"));
		assertEquals(2, despesasDoMarcelo.size());
	}
	
	@Test
	public void totalDeDespesasDoMotorista() {
		Double total = 0.0;
		List<Despesa> despesasDoMarcelo = repositorio.findByMotorista(new MotoristaId("999"));
		for (Despesa despesa : despesasDoMarcelo) {
			total += despesa.getValor();
		}
		assertEquals(new Double(75.5), total);
	}
	
	@Test
	public void quantidadeDeDespesasDoMotorista() {
		Double quantidade = 0.0;
		List<Despesa> despesasDoJoao = repositorio.findByMotorista(new MotoristaId("987"));
		for (Despesa despesa : despesasDoJoao) {
			quantidade += despesa.getQuantidade();
		}
		assertEquals(new Double(5.0), quantidade);
	}
	
	@Test
	public void filtrarDespesasPorData() {
		int quantidade = 0;
		List<Despesa> despesaMes6 = repositorio.findByDataBetween(new Date(2015,6,1), new Date(2015,12,31));
		for (Despesa despesa : despesaMes6) {
			quantidade += 1;
		}
		assertEquals(1, quantidade);
	}
	
	@Test
	public void calcularDespesasPorMotoristaEData() {
		Double total = 0.0;
		List<Despesa> despesasDoMarcelo = repositorio.findByMotoristaAndDataBetween(new MotoristaId("987"), new Date(2015,5,1), new Date(2015,6,30));
		for (Despesa despesa : despesasDoMarcelo) {
			total += despesa.getValor();
		}
		assertEquals(new Double(29.5), total);
	}
}
