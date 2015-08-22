package br.com.ufscar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.ufscar.dominio.modelo.despesa.DespesaRepositorio;

//@Configuration
//@EnableAutoConfiguration
//@EnableTransactionManagement
//@ComponentScan(basePackages = "br.com.ufscar")
//@EnableJpaRepositories(basePackages = "br.com.ufscar")
//@EntityScan(basePackages = "br.com.ufscar")
@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	DespesaRepositorio repositorio;

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
		// CategoriaVeiculoRepositorio repositorio =
		// ctx.getBean(CategoriaVeiculoRepositorio.class);
		// repositorio.save(new CategoriaVeiculo(new CategoriaVeiculoId("123"),
		// "CARRETA", 'T'));
		// for (CategoriaVeiculo catV: repositorio.findAll()) {
		// System.out.println(catV.toString());
		// }
		System.out.println("INICIADO....");
	}

	@Override
	public void run(String... strings) throws Exception {
		// CategoriaVeiculoId id = new CategoriaVeiculoId("123");
		// CategoriaVeiculo cat = new CategoriaVeiculo(id, "123", 'S');
//		repositorio.save(new CategoriaVeiculo(new CategoriaVeiculoId("123"),
//				"CARRETA", 'T'));
//		for (CategoriaVeiculo catV : repositorio.findAll()) {
//			System.out.println(catV.toString());
//		}
		
//		Despesa cafe = new Despesa(new DespesaId("111"), new BigDecimal(1), new Date(), new MotoristaId("999"), new PlanoDeContasId("888"), "POSTO DO JÃO", 5.50, 1.0, 'A');
//		Despesa almoco = new Despesa(new DespesaId("222"), new BigDecimal(2), new Date(), new MotoristaId("999"), new PlanoDeContasId("888"), "CHURRASCARIA", 70.00, 1.0, 'A');
//		Despesa jantar = new Despesa(new DespesaId("333"), new BigDecimal(3), new Date(), new MotoristaId("999"), new PlanoDeContasId("888"), "PIZZARIA", 29.50, 1.0, 'A');
//		repositorio.save(cafe);
//		repositorio.save(almoco);
//		repositorio.save(jantar);
//		
//		for (Despesa d : repositorio.findAll()) {
//			System.out.println(d.getLocal());
//		}
	}

}
