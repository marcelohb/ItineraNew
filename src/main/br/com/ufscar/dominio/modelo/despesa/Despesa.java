package br.com.ufscar.dominio.modelo.despesa;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.ufscar.dominio.modelo.motorista.MotoristaId;
import br.com.ufscar.dominio.modelo.planodecontas.PlanoDeContasId;

@Entity
public class Despesa {

	@Id
	@GeneratedValue
	private Long idDespesa;
	@Embedded
	private DespesaId despesaId;
	private BigDecimal numeroDoDocumento;
	private Date data;
	@Embedded
	private MotoristaId motorista;
	@Embedded
	private PlanoDeContasId planoDeContasId;
	private String local;
	private Double valor;
	private Double quantidade;
	private char status;
	
	public Despesa(DespesaId despesaId, BigDecimal numero, Date data, MotoristaId motorista,
			PlanoDeContasId planoContasId, String local, Double valor, Double quantidade, char status) {
		this.despesaId = despesaId;
		this.numeroDoDocumento = numero;
		this.data = data;
		this.motorista = motorista;
		this.planoDeContasId = planoContasId;
		this.local = local;
		this.valor = valor;
		this.quantidade = quantidade;
		this.status = status;
	}
	
	public Despesa(){}

	public Long getId() {
		return idDespesa;
	}

	public void setId(Long id) {
		this.idDespesa = id;
	}

	public DespesaId getDespesaId() {
		return despesaId;
	}

	public void setDespesaId(DespesaId despesaId) {
		this.despesaId = despesaId;
	}

	public BigDecimal getNumeroDoDocumento() {
		return numeroDoDocumento;
	}

	public void setNumeroDoDocumento(BigDecimal numeroDoDocumento) {
		this.numeroDoDocumento = numeroDoDocumento;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public MotoristaId getMotorista() {
		return motorista;
	}

	public void setMotorista(MotoristaId motoristaId) {
		this.motorista = motoristaId;
	}

	public PlanoDeContasId getPlanoDeContasId() {
		return planoDeContasId;
	}

	public void setPlanoDeContasId(PlanoDeContasId planoDeContasId) {
		this.planoDeContasId = planoDeContasId;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

}
