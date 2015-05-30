package br.com.ufscar.dominio.modelo.categoriaVeiculo;

public class CategoriaVeiculo {

	private CategoriaVeiculoId categoriaVeiculoId;
	private String descricao;
	private char ehReboque;
	
	public CategoriaVeiculo(CategoriaVeiculoId id, String descricao, char ehReboque) {
		this.categoriaVeiculoId = id;
		this.descricao = descricao;
		this.ehReboque = ehReboque;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((categoriaVeiculoId == null) ? 0 : categoriaVeiculoId
						.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ehReboque;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoriaVeiculo other = (CategoriaVeiculo) obj;
		if (categoriaVeiculoId == null) {
			if (other.categoriaVeiculoId != null)
				return false;
		} else if (!categoriaVeiculoId.equals(other.categoriaVeiculoId))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (ehReboque != other.ehReboque)
			return false;
		return true;
	}

	public char ehReboque() {
		return this.ehReboque;
	}
}
