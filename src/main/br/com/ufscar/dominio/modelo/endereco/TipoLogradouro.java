package br.com.ufscar.dominio.modelo.endereco;

public enum TipoLogradouro {
	RUA('R'),
	TRAVESSA('T'),
	AVENIDA('A'),
	RODOVIA('O');
	
	private char tipo;
	
	TipoLogradouro(char tipo) {
		this.tipo = tipo;
	}
	
	public static Object obterTipoLogradouro(char tipo) {
		switch (tipo) {
		case 'R':
			return RUA;
		case 'T':
			return TRAVESSA;
		case 'A':
			return AVENIDA;
		case 'O':
			return RODOVIA;
		default:
			return null;
		}
	}

}
