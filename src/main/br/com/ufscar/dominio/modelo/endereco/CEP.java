package br.com.ufscar.dominio.modelo.endereco;

public class CEP {
	
	String cep;
	
	public CEP(String cep) {
		this.cep = cep;
	}
	
	public String retornaCEP() {
		return this.cep;
	}
	
	public String retornaCEPFormatado() {
		String cepFormatado;
		cepFormatado = this.cep.substring(0,5) + "-" + this.cep.substring(5,8);
		return cepFormatado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
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
		CEP other = (CEP) obj;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		return true;
	}

}
