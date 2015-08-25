package br.com.ufscar.dominio.modelo.empresa;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.ufscar.dominio.modelo.MunicipioId;

@Entity
public class Empresa {

	@Id
	@GeneratedValue
	private Long idEmpresa;
	@Embedded
	private EmpresaId empresaId;
	@Embedded
	private CNPJ cnpj;
	@Embedded
	private IE ie;
	private String nomeFantasia;
	private String razaoSocial;
	private TipoEmpresa tipoEmpresa;
	@Embedded
	private MunicipioId municipio;
	
	public Empresa(EmpresaId empresaId, CNPJ cnpj, IE ie, String nomeFantasia,
			String razaoSocial, TipoEmpresa tipoEmpresa, MunicipioId municipio) {
		this.empresaId = empresaId;
		this.cnpj = cnpj;
		this.ie = ie;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.tipoEmpresa = tipoEmpresa;
		this.municipio = municipio;
	}

	public void alterarTipo(TipoEmpresa tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	public Long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public EmpresaId getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(EmpresaId empresaId) {
		this.empresaId = empresaId;
	}

	public CNPJ getCnpj() {
		return cnpj;
	}

	public void setCnpj(CNPJ cnpj) {
		this.cnpj = cnpj;
	}

	public IE getIe() {
		return ie;
	}

	public void setIe(IE ie) {
		this.ie = ie;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public TipoEmpresa getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(TipoEmpresa tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	public MunicipioId getMunicipio() {
		return municipio;
	}

	public void setMunicipio(MunicipioId municipio) {
		this.municipio = municipio;
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
		Empresa other = (Empresa) obj;
		if (empresaId == null) {
			if (other.empresaId != null)
				return false;
		} else if (!empresaId.equals(other.empresaId))
			return false;
		return true;
	}

}
