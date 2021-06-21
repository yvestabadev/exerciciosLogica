package br.com.akconsultor.calculos;

import java.util.HashSet;
import java.util.Set;

public class Multiplos { 
	
	public static Integer multiplosTresECinco(Integer numeroMaximo) {
		
		if(numeroMaximo < 0) {
			throw new IllegalArgumentException("Esse calculo se aplica apenas a numeros naturais");
		}
		
		Set<Integer> todosOsNumeros = new HashSet<Integer>();
				
		int i = 3;
		while(i < numeroMaximo) {
			todosOsNumeros.add(i);
			i += 3;
		}
		
		i = 5;
		while(i < numeroMaximo) {
			todosOsNumeros.add(i);
			i += 5;
		}
		
		Integer resultado = 0;
		for(Integer numero : todosOsNumeros) {
			resultado += numero;
		}
		
		return resultado;
		
	}

}
