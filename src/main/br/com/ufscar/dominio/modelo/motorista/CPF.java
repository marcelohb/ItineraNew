package br.com.ufscar.dominio.modelo.motorista;

public class CPF {
	
	private String cpf;
	
	public CPF(String cpf) {
		this.cpf = cpf;
		this.validar();
	}
	
	public CPF() {}
	
	private boolean validar() {
		if (this.cpf.length() == 11) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
		CPF other = (CPF) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

}
