package br.com.ufscar.dominio.modelo.motorista;

import javax.persistence.Embeddable;

@Embeddable
public class MotoristaId {
	
	private String idMotoristaId;

	public MotoristaId(String id) {
		this.idMotoristaId = id;
	}
	
	public MotoristaId() {}
	
	public String getId() {
		return idMotoristaId;
	}

	public void setId(String id) {
		this.idMotoristaId = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idMotoristaId == null) ? 0 : idMotoristaId.hashCode());
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
		if (idMotoristaId == null) {
			if (other.idMotoristaId != null)
				return false;
		} else if (!idMotoristaId.equals(other.idMotoristaId))
			return false;
		return true;
	}
}
