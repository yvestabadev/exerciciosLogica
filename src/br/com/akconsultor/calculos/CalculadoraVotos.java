package br.com.akconsultor.calculos;

public class CalculadoraVotos {
	
	private Double totalEleitores = 1000.00;
	private Double votosValidos = 800.00;
	private Double brancos = 150.00;
	private Double nulos = 50.00;
	
	public String percentualDeValidos() {
		Double percentual = (this.votosValidos / this.totalEleitores) * 100;
		return percentual.longValue() + "%";
	}
	
	public String percentualDeBrancos() {
		Double percentual = (this.brancos / this.totalEleitores) * 100;
		return percentual.longValue() + "%";
	}
	
	public String percentualDeNulos() {
		Double percentual = (this.nulos / this.totalEleitores) * 100;
		return percentual.longValue() + "%";
	}

}
