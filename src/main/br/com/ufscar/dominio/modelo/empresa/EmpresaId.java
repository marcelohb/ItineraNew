package br.com.ufscar.dominio.modelo.empresa;

import javax.persistence.Embeddable;

@Embeddable
public class EmpresaId {

	String empresaId;
	
	public EmpresaId(String id) {
		this.empresaId = id;
	}
	
	private EmpresaId() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((empresaId == null) ? 0 : empresaId.hashCode());
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
		EmpresaId other = (EmpresaId) obj;
		if (empresaId == null) {
			if (other.empresaId != null)
				return false;
		} else if (!empresaId.equals(other.empresaId))
			return false;
		return true;
	}

}
