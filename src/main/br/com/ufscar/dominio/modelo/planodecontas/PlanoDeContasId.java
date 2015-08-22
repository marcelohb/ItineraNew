package br.com.ufscar.dominio.modelo.planodecontas;

import javax.persistence.Embeddable;

@Embeddable
public class PlanoDeContasId {
	
	private String idPlanoDeContasId;

	public PlanoDeContasId(String id) {
		this.idPlanoDeContasId = id;
	}

	public PlanoDeContasId() {}
	
	public String getId() {
		return idPlanoDeContasId;
	}

	public void setId(String id) {
		this.idPlanoDeContasId = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((idPlanoDeContasId == null) ? 0 : idPlanoDeContasId
						.hashCode());
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
		PlanoDeContasId other = (PlanoDeContasId) obj;
		if (idPlanoDeContasId == null) {
			if (other.idPlanoDeContasId != null)
				return false;
		} else if (!idPlanoDeContasId.equals(other.idPlanoDeContasId))
			return false;
		return true;
	}
}
