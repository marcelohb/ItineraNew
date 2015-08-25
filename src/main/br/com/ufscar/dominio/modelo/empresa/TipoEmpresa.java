package br.com.ufscar.dominio.modelo.empresa;

public enum TipoEmpresa {
	FILIAL('F'),
	FORNECEDOR('N'),
	CLIENTE('C'),
	SOCIO('S');
	
	private char tipo;
	
	TipoEmpresa(char tipo) {
		this.tipo = tipo;
	}
	
	public char tipo() {
		return this.tipo;
	}
	
	public static TipoEmpresa obterPeloTipo(char tipo) {
		switch (tipo) {
		case 'F':
			return FILIAL;
		case 'N':
			return FORNECEDOR;
		case 'C':
			return CLIENTE;
		case 'S':
			return SOCIO;
		default:
			return null;
		}
	}
}
