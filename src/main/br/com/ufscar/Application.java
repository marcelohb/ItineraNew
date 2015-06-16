package br.com.ufscar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.ufscar.dominio.modelo.categoriaVeiculo.CategoriaVeiculo;
import br.com.ufscar.dominio.modelo.categoriaVeiculo.CategoriaVeiculoId;
import br.com.ufscar.dominio.modelo.categoriaVeiculo.CategoriaVeiculoRepositorio;

//@Configuration
//@EnableAutoConfiguration
//@EnableTransactionManagement
//@ComponentScan(basePackages = "br.com.ufscar")
//@EnableJpaRepositories(basePackages = "br.com.ufscar")
//@EntityScan(basePackages = "br.com.ufscar")
@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	CategoriaVeiculoRepositorio repositorio;

	public static void main(String[] args) {

		SpringApplication.run(Application.class);
		// CategoriaVeiculoRepositorio repositorio =
		// ctx.getBean(CategoriaVeiculoRepositorio.class);
		// repositorio.save(new CategoriaVeiculo(new CategoriaVeiculoId("123"),
		// "CARRETA", 'T'));
		// for (CategoriaVeiculo catV: repositorio.findAll()) {
		// System.out.println(catV.toString());
		// }
	}

	@Override
	public void run(String... strings) throws Exception {
		// CategoriaVeiculoId id = new CategoriaVeiculoId("123");
		// CategoriaVeiculo cat = new CategoriaVeiculo(id, "123", 'S');
		repositorio.save(new CategoriaVeiculo(new CategoriaVeiculoId("123"),
				"CARRETA", 'T'));
		for (CategoriaVeiculo catV : repositorio.findAll()) {
			System.out.println(catV.toString());
		}
	}

}
