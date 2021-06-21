package br.com.akconsultor.calculos.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.akconsultor.calculos.CalculadoraVotos;

class VotosTest {

		CalculadoraVotos calculadora = new CalculadoraVotos();

	@Test
	void testaValidos() {
		String validos = calculadora.percentualDeValidos();
		assertEquals("80%", validos);
	}
	
	@Test
	void testaBrancos() {
		String brancos = calculadora.percentualDeBrancos();
		assertEquals("15%", brancos);
	}
	
	@Test
	void testeNulos() {
		String nulos = calculadora.percentualDeNulos();
		assertEquals("5%", nulos);
	}

}
