package br.com.ufscar.dominio.modelo.categoriaVeiculo;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="CATEGORIA_VEICULO")
@Embeddable
public class CategoriaVeiculo {

	@Id
	@GeneratedValue
	private Long idCategoria;
	
	@Embedded
	private CategoriaVeiculoId categoriaVeiculoId;
	
	private String descricao;
	private char ehReboque;
	
	public CategoriaVeiculo(CategoriaVeiculoId categoriaVeiculoId, String descricao, char ehReboque) {
		this.categoriaVeiculoId = categoriaVeiculoId;
		this.descricao = descricao;
		this.ehReboque = ehReboque;
	}

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public CategoriaVeiculoId categoriaVeiculoId() {
		return this.categoriaVeiculoId;
	}

	public CategoriaVeiculoId getCategoriaVeiculoId() {
		return categoriaVeiculoId;
	}

	public void setCategoriaVeiculoId(CategoriaVeiculoId categoriaVeiculoId) {
		this.categoriaVeiculoId = categoriaVeiculoId;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public char getEhReboque() {
		return ehReboque;
	}

	public void setEhReboque(char ehReboque) {
		this.ehReboque = ehReboque;
	}

	@SuppressWarnings("unused")
	private CategoriaVeiculo(){}

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