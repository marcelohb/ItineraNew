package br.com.ufscar.dominio.modelo.empresa;

import javax.persistence.Embeddable;

@Embeddable
public class IE {
	
	private String ie;

	public IE(String ie) {
		this.ie = ie;
	}
	
	@SuppressWarnings("unused")
	private IE() {}

	public String getIE() {
		return ie;
	}

	public void setIE(String ie) {
		this.ie = ie;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ie == null) ? 0 : ie.hashCode());
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
		IE other = (IE) obj;
		if (ie == null) {
			if (other.ie != null)
				return false;
		} else if (!ie.equals(other.ie))
			return false;
		return true;
	}

}
