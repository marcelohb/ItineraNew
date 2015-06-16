package br.com.ufscar.dominio.modelo.veiculo;

public enum TipoCombustivel {
	DIESEL('D'),
	ALCOOL('A'),
	GASOLINA('G'),
	GAS_NATURAL('N'),
	BIO_DIESEL('B');
	
	private char tipo;
	
	private TipoCombustivel(char tipo) {
		this.tipo = tipo;
	}
	
	public TipoCombustivel obterTipo(char tipo) {
		switch (tipo) {
		case 'D':
			return DIESEL;
		case 'A':
			return ALCOOL;
		case 'G':
			return GASOLINA;
		case 'N':
			return GAS_NATURAL;
		case 'B':
			return BIO_DIESEL;
		default:
			return null;
		}
	}

}
