package br.com.ufscar.dominio.modelo.veiculo;

import java.util.regex.*;

public class Placa {
	
	private String placa;
	
	public Placa(String placa) {
		this.placa = placa.toUpperCase();
		validar();
	}

	private void validar() {
		Pattern padrao = Pattern.compile("[A-Z]{3,3}\\d{4,4}");
		Matcher placaValida = padrao.matcher(this.placa);
		if (!placaValida.find()) {
			throw new IllegalArgumentException("Placa fora do padrão");
		}
	}

	public String placaFormatada() {
		String placaFormatada = this.placa.substring(0, 3) + "-" + this.placa.substring(3, 7);
		return placaFormatada;
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
		Placa other = (Placa) obj;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}
}
