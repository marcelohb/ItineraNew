package br.com.ufscar.dominio.modelo.veiculo;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.ufscar.Application;
import br.com.ufscar.dominio.modelo.categoriaVeiculo.CategoriaVeiculo;
import br.com.ufscar.dominio.modelo.categoriaVeiculo.CategoriaVeiculoId;
import br.com.ufscar.dominio.modelo.categoriaVeiculo.CategoriaVeiculoRepositorio;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class VeiculoRepositorioTest {

	@Autowired
	VeiculoRepositorio repositorio;
	
	@Autowired
	CategoriaVeiculoRepositorio repositorioCategoriaVeiculo;
	
	@Autowired
	private EntityManager em;
	
	CategoriaVeiculo categoriaCaminhao;
	
	@Before
	public void setUp() {
		repositorio.save(new Veiculo(new VeiculoId("111"), new Placa("AAA1122")));
		repositorio.save(new Veiculo(new VeiculoId("222"), new Placa("BBB1122")));
		repositorio.save(new Veiculo(new VeiculoId("333"), new Placa("CCC1122")));
		categoriaCaminhao = repositorioCategoriaVeiculo.save(new CategoriaVeiculo(new CategoriaVeiculoId("1"), "CAMINHAO", 'T'));
	}
	
	@Test
	public void salvar() {
		Veiculo caminhao01 = repositorio.save(new Veiculo(new VeiculoId("11"), new Placa("AAA1122")));
		assertEquals("AAA-1122",caminhao01.getPlaca().placaFormatada());
	}
	
	@Test
	public void quantidadeRegistros() {
		
		List<Veiculo> lista = (List<Veiculo>) repositorio.findAll();
		assertEquals(3, lista.size());
	}
	
	@Test
	public void buscarPelaPlaca() {
		
		List<Veiculo> listaVeiculos = repositorio.findByPlaca(new Placa("AAA1122"));
		assertEquals(new Placa("AAA1122").placaFormatada(), listaVeiculos.get(0).getPlaca().placaFormatada());
//		for (Veiculo veiculo : listaVeiculos) {
//			System.out.println(veiculo.getPlaca().placaFormatada());
//		}
	}
	
	@Test
	public void igualdeDeVeiculos() {
		Veiculo caminhao = repositorio.save(new Veiculo(new Placa("BBB9999"), "1", new CategoriaVeiculoId("1"), "VW", "VW999", TipoCombustivel.BIO_DIESEL, new Double(2.5), new Double(4.97), new Double(29.9), new Double(15000), 7));
		assertEquals(new Placa("BBB9999"), caminhao.getPlaca());
//		assertEquals(categoriaCaminhao, caminhao.get);
	}

}
