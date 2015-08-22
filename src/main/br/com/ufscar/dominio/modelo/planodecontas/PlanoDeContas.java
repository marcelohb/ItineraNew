package br.com.ufscar.dominio.modelo.planodecontas;

public class PlanoDeContas {

	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public PlanoDeContas(String descricao) {
		this.descricao = descricao;
	}

}
