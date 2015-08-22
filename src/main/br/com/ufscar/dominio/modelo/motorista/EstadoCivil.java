package br.com.ufscar.dominio.modelo.motorista;

public enum EstadoCivil {

	SOLTEIRO("SOLTEIRO", "S"),
	CASADO("CASADO","C"),
	DIVORCIADO("DIVORCIADO","D"),
	VIUVO("VIUVO","V");
	
	private String nome;
	private String valor;
	
	EstadoCivil(String nome, String valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public String nome() {
		return nome;
	}
	
}
