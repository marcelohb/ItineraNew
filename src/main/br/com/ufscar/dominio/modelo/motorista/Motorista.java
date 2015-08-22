package br.com.ufscar.dominio.modelo.motorista;

import java.sql.Date;

import javax.persistence.Embedded;

import br.com.ufscar.dominio.modelo.endereco.Endereco;

public class Motorista {

	@Embedded
	private MotoristaId id;
	
	private String nome;
	private CPF cpf;
	private RG rg;

	private String nomeMae;
	private String nomePai;
	private Date dataNascimento;
	private EstadoCivil estadoCivil;
	private Endereco endereco;

	private int dependentes;

	private ContaCorrente contaCorrente;

	public Motorista(MotoristaId motoristaId, String nome, CPF cpf) {
		this.id = motoristaId;
		this.nome = nome;
		this.setCpf(cpf);
	}

	public void alterarRG(RG rg) {
		this.rg = rg;
	}

	public void alterarNome(String novoNome) {
		this.nome = novoNome;
	}

	public void filiacao(String nomeDoPai, String nomeDaMae) {
		this.nomePai = nomeDoPai;
		this.nomeMae = nomeDaMae;
	}

	public void alterarDataDeNascimento(Date dataDeNascimento) {
		this.dataNascimento = dataDeNascimento;
	}
	
	public void alterarEstadoCivil(EstadoCivil ec) {
		this.estadoCivil = ec;
	}

	public void alterarDependentes(int quantidadeDependentes) {
		this.dependentes = quantidadeDependentes;
	}

	public void alterarEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void alterarContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
	
	public MotoristaId getId() {
		return id;
	}

	public void setId(MotoristaId id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Motorista other = (Motorista) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public CPF getCpf() {
		return cpf;
	}

	public void setCpf(CPF cpf) {
		this.cpf = cpf;
	}

	public RG getRg() {
		return rg;
	}

	public void setRg(RG rg) {
		this.rg = rg;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public int getDependentes() {
		return dependentes;
	}
	
	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public ContaCorrente getContaCorrente() {
		return contaCorrente;
	}
	
	public void setContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

}
