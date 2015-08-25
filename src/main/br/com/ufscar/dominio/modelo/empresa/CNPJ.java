package br.com.ufscar.dominio.modelo.empresa;

import javax.persistence.Embeddable;

@Embeddable
public class CNPJ {
	
	private String cnpj;
	
	public CNPJ(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@SuppressWarnings("unused")
	private CNPJ(){}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
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
		CNPJ other = (CNPJ) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		return true;
	}

}
