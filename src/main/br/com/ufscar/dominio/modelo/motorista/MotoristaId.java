package br.com.ufscar.dominio.modelo.motorista;

import javax.persistence.Embeddable;

@Embeddable
public class MotoristaId {
	
	private String motoristaId;

	public MotoristaId(String id) {
		this.motoristaId = id;
	}
	
	private MotoristaId() {}
	
	public String getId() {
		return motoristaId;
	}

	public void setId(String id) {
		this.motoristaId = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((motoristaId == null) ? 0 : motoristaId.hashCode());
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
		MotoristaId other = (MotoristaId) obj;
		if (motoristaId == null) {
			if (other.motoristaId != null)
				return false;
		} else if (!motoristaId.equals(other.motoristaId))
			return false;
		return true;
	}
}
