package br.com.akconsultor.calculos;

public class Fatorial {
	
	public static Integer calcular(Integer numeroSelecionado) {
		if(numeroSelecionado == 0) {
			return 1;
		} else if(numeroSelecionado < 0) {
			throw new IllegalArgumentException("Esse calculo se aplica apenas a numeros naturais");
		}
		
		Integer resultado = 1;
		for(int i = 2; i <= numeroSelecionado; i++) {
			resultado *= i;
		}
		
		return resultado;
	}

}
