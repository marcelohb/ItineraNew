package br.com.ufscar.dominio.modelo.telefone;

public enum TipoTelefone {
	CELULAR('C'),
	FAX('F'),
	RESIDENCIAL('R'),
	COMERCIAL('M');
	
	private char tipo; 
	
	TipoTelefone(char tipo) {
		this.tipo = tipo;
	}
	
	public static Object obterPeloCodigo(char tipo) {
		switch (tipo) {
		case 'C':
			return CELULAR;
		case 'F':
			return FAX;
		case 'R':
			return RESIDENCIAL;
		case 'M':
			return COMERCIAL;
		default:
			return null;
		}
	}
}
