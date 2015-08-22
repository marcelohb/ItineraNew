package br.com.ufscar.dominio.modelo.ordemColeta;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import br.com.ufscar.dominio.modelo.empresa.EmpresaId;
import br.com.ufscar.dominio.modelo.motorista.MotoristaId;
import br.com.ufscar.dominio.modelo.veiculo.Placa;

public class OrdemColetaTest {

	@Test
	public void igualdade() {
		OrdemColeta ordemColeta = new OrdemColeta(new OrdemColetaId("123"),
				new Date(2015, 8, 22), new Double(15.0), new Double(1.0),
				"1238128", new Placa("AAA3322"), new MotoristaId(
						"999"), new EmpresaId("444"), new EmpresaId("555"));
		assertEquals(new OrdemColeta(new OrdemColetaId("123"),
				new Date(2015, 8, 22), new Double(15.0), new Double(1.0),
				"1238128", new Placa("AAA3322"), new MotoristaId(
						"999"), new EmpresaId("444"), new EmpresaId("555")), ordemColeta);
	}
}
