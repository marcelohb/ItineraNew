package br.com.ufscar.dominio.modelo.categoriaVeiculo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/categoriaVeiculo")
public class CategoriaVeiculoController {
	
	@RequestMapping("categoriaVeiculo")
	public CategoriaVeiculo categoriaVeiculo() {
		return new CategoriaVeiculo(new CategoriaVeiculoId("987"), "CATEGORIA 1", 'T');
	}

}
