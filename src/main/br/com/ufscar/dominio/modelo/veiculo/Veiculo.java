package br.com.ufscar.dominio.modelo.veiculo;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.ufscar.dominio.modelo.categoriaVeiculo.CategoriaVeiculo;
import br.com.ufscar.dominio.modelo.categoriaVeiculo.CategoriaVeiculoId;

@Entity
@Table(name = "VEICULO")
public class Veiculo {

	@Id
	@GeneratedValue
	private Long id;

	@Embedded
	protected Placa placa;
	
	private String numero;

	private String marca;

	private String modelo;

	private char ativo;

	@Enumerated(EnumType.STRING)
	private TipoCombustivel tipoCombustivel;

	private Double mediaKm;

	private Double altura;

	private Double largura;

	private Double comprimento;

	private Double pesoBruto;

	private Integer eixos;

	@Embedded
	private CategoriaVeiculoId categoriaVeiculoId;

	private VeiculoId veiculoId;

	public Veiculo() {
	}

	public Veiculo(Placa placa, String numero, CategoriaVeiculoId categoriaVeiculoId,
			String marca, String modelo, TipoCombustivel tipoCombustivel,
			Double altura, Double largura, Double comprimento,
			Double pesoBruto, Integer eixos) {
		this.placa = placa;
		this.numero = numero;
		this.categoriaVeiculoId = categoriaVeiculoId;
		this.marca = marca;
		this.modelo = modelo;
		this.tipoCombustivel = tipoCombustivel;
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
		this.pesoBruto = pesoBruto;
		this.eixos = eixos;
	}

	public Long getVeiculoId() {
		return id;
	}

	public void setVeiculoId(Long id) {
		this.id = id;
	}

	public Veiculo(VeiculoId veiculoId, Placa placa) {
		this.veiculoId = veiculoId;
		this.placa = placa;
	}

	public Placa getPlaca() {
		return placa;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setPlaca(Placa placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public char getAtivo() {
		return ativo;
	}

	public void setAtivo(char ativo) {
		this.ativo = ativo;
	}

	public TipoCombustivel getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public Double getMediaKm() {
		return mediaKm;
	}

	public void setMediaKm(Double mediaKm) {
		this.mediaKm = mediaKm;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getComprimento() {
		return comprimento;
	}

	public void setComprimento(Double comprimento) {
		this.comprimento = comprimento;
	}

	public Double getPesoBruto() {
		return pesoBruto;
	}

	public void setPesoBruto(Double pesoBruto) {
		this.pesoBruto = pesoBruto;
	}

	public Integer getEixos() {
		return eixos;
	}

	public void setEixos(Integer eixos) {
		this.eixos = eixos;
	}

	public CategoriaVeiculoId getCategoriaVeiculo() {
		return categoriaVeiculoId;
	}

	public void setCategoriaVeiculo(CategoriaVeiculoId categoriaVeiculoId) {
		this.categoriaVeiculoId = categoriaVeiculoId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
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
		Veiculo other = (Veiculo) obj;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}
}