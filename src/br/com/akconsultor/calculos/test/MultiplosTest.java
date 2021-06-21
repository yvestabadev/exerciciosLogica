package br.com.akconsultor.calculos.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.akconsultor.calculos.Multiplos;

class MultiplosTest {

	@Test
	void testa10() {
		Integer resultado = Multiplos.multiplosTresECinco(10);
		assertEquals(23, resultado);
	}
	
	@Test
	void testa11() {
		Integer resultado = Multiplos.multiplosTresECinco(11);
		assertEquals(33, resultado);
	}
	
	@Test
	void testa13() {
		Integer resultado = Multiplos.multiplosTresECinco(13);
		assertEquals(45, resultado);
	}
	
	@Test
	void testa16() {
		Integer resultado = Multiplos.multiplosTresECinco(16);
		assertEquals(60, resultado);
	}

}
