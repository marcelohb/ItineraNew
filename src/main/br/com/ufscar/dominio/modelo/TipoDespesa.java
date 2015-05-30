package br.com.ufscar.dominio.modelo;

public class TipoDespesa {
	
	private TipoDespesaId tipoDespesaId;
	private String descricao;
	private char tipoCombustivel;
	
	public TipoDespesa(TipoDespesaId tipoDespesaId, String descricao, char tipoCombustivel) {
		this.tipoDespesaId = tipoDespesaId;
		this.descricao = descricao;
		this.tipoCombustivel = tipoCombustivel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + tipoCombustivel;
		result = prime * result
				+ ((tipoDespesaId == null) ? 0 : tipoDespesaId.hashCode());
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
		TipoDespesa other = (TipoDespesa) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (tipoCombustivel != other.tipoCombustivel)
			return false;
		if (tipoDespesaId == null) {
			if (other.tipoDespesaId != null)
				return false;
		} else if (!tipoDespesaId.equals(other.tipoDespesaId))
			return false;
		return true;
	}

}
