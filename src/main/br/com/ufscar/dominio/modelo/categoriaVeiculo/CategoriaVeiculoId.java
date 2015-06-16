package br.com.ufscar.dominio.modelo.categoriaVeiculo;

import javax.persistence.Embeddable;

@Embeddable
public class CategoriaVeiculoId {
	
	private String categoriaVeiculoId;
	
	public CategoriaVeiculoId(String categoriaVeiculoId) {
		this.categoriaVeiculoId = categoriaVeiculoId;
	}
	
	public String categoriaVeiculoId() {
		return this.categoriaVeiculoId;
	}
	
	public CategoriaVeiculoId() {}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoriaVeiculoId == null) ? 0 : categoriaVeiculoId.hashCode());
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
		CategoriaVeiculoId other = (CategoriaVeiculoId) obj;
		if (categoriaVeiculoId == null) {
			if (other.categoriaVeiculoId != null)
				return false;
		} else if (!categoriaVeiculoId.equals(other.categoriaVeiculoId))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "CategoriaVeiculoId[ categoriaVeiculoId="+categoriaVeiculoId+"]";
	}

}