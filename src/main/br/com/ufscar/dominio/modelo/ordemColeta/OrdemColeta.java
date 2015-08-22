package br.com.ufscar.dominio.modelo.ordemColeta;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.ufscar.dominio.modelo.empresa.EmpresaId;
import br.com.ufscar.dominio.modelo.motorista.MotoristaId;
import br.com.ufscar.dominio.modelo.veiculo.Placa;

@Entity
public class OrdemColeta {
	
	@Id
	@GeneratedValue
	private Long idOrdemColeta;
//	@Embedded
	private OrdemColetaId ordemColetaId;
	private Date data;
	private Double valorUnitario;
	private Double quantidade;
	private Double distancia;
	private String numeroNotaFiscal;
//	@Embedded
	private Placa veiculo;
//	@Embedded
	private MotoristaId motorista;
//	@Embedded
	private EmpresaId origem;
	private EmpresaId destino;
	
	public OrdemColeta(OrdemColetaId ordemColetaId, Date data,
			Double valorUnitario, Double quantidade, String numeroNF, Placa placaVeiculo,
			MotoristaId motorista, EmpresaId origem, EmpresaId destino) {
		this.ordemColetaId = ordemColetaId;
		this.data = data;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
		this.numeroNotaFiscal = numeroNF;
		this.veiculo = placaVeiculo;
		this.motorista = motorista;
		this.origem = origem;
		this.destino = destino;
	}

	public OrdemColetaId getOrdemColetaId() {
		return ordemColetaId;
	}

	public void setOrdemColetaId(OrdemColetaId ordemColetaId) {
		this.ordemColetaId = ordemColetaId;
	}
	
	public Long getId() {
		return idOrdemColeta;
	}

	public void setId(Long id) {
		this.idOrdemColeta = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double getDistancia() {
		return distancia;
	}

	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}

	public String getNumeroNotaFiscal() {
		return numeroNotaFiscal;
	}

	public void setNumeroNotaFiscal(String numeroNotaFiscal) {
		this.numeroNotaFiscal = numeroNotaFiscal;
	}

	public Placa getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Placa veiculo) {
		this.veiculo = veiculo;
	}

	public MotoristaId getMotorista() {
		return motorista;
	}

	public void setMotorista(MotoristaId motorista) {
		this.motorista = motorista;
	}

	public EmpresaId getOrigem() {
		return origem;
	}

	public void setOrigem(EmpresaId origem) {
		this.origem = origem;
	}

	public EmpresaId getDestino() {
		return destino;
	}

	public void setDestino(EmpresaId destino) {
		this.destino = destino;
	}

}
