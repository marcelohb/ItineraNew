package br.com.ufscar.dominio.modelo.ordemColeta;

import static org.junit.Assert.*;

import java.util.Date;

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
//		assertEquals(oc.getDestino(), ordemColeta.getDestino());
		
	}

}
