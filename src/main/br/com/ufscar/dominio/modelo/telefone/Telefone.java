package br.com.ufscar.dominio.modelo.telefone;

public class Telefone {

	String numero;
	String ddd;
	Enum TipoTelefone;
	String ramal;
	String descricao;
	
	public Telefone(String ddd, String numero, String descricao, TipoTelefone tipo) {
		this.ddd = ddd;
		this.numero = numero;
		this.descricao = descricao;
		this.TipoTelefone = tipo;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((TipoTelefone == null) ? 0 : TipoTelefone.hashCode());
		result = prime * result + ((ddd == null) ? 0 : ddd.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((ramal == null) ? 0 : ramal.hashCode());
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
		Telefone other = (Telefone) obj;
		if (TipoTelefone == null) {
			if (other.TipoTelefone != null)
				return false;
		} else if (!TipoTelefone.equals(other.TipoTelefone))
			return false;
		if (ddd == null) {
			if (other.ddd != null)
				return false;
		} else if (!ddd.equals(other.ddd))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (ramal == null) {
			if (other.ramal != null)
				return false;
		} else if (!ramal.equals(other.ramal))
			return false;
		return true;
	}
	
}
