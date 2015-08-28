package br.com.ufscar.dominio.modelo.despesa;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;

import br.com.ufscar.dominio.modelo.motorista.MotoristaId;
import br.com.ufscar.dominio.modelo.planodecontas.PlanoDeContasId;


public class DespesaTest {

	@Test
	public void igualdadeId() {
		DespesaId id1 = new DespesaId("123");
		DespesaId id2 = new DespesaId("123");
		assertEquals(id1, id2);
	}

	@Test
	public void igualdadeDespesa() {
		Despesa jantar = new Despesa(new DespesaId("123"), new BigDecimal(500000.00), new Date(), new MotoristaId("999"), new PlanoDeContasId("888"), "POSTO DO JÃO", 75.50, 1.0, 'A');
		Despesa almoco = new Despesa(new DespesaId("123"), new BigDecimal(500000.00), new Date(), new MotoristaId("999"), new PlanoDeContasId("888"), "POSTO DO JÃO", 75.50, 1.0, 'A');
		assertEquals(almoco.getDespesaId(), jantar.getDespesaId());
		assertEquals(almoco.getNumeroDoDocumento(), jantar.getNumeroDoDocumento());
		assertEquals(almoco.getData().getDate(),jantar.getData().getDate());
		assertEquals(almoco.getMotorista(), jantar.getMotorista());
		assertEquals(almoco.getPlanoDeContasId(), jantar.getPlanoDeContasId());
		assertEquals(almoco.getLocal(), jantar.getLocal());
		assertEquals(almoco.getValor(), jantar.getValor());
		assertEquals(almoco.getQuantidade(), jantar.getQuantidade());
		assertEquals(almoco.getStatus(), jantar.getStatus());
	}
}
