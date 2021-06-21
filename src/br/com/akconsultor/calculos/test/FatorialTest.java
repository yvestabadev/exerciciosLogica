package br.com.akconsultor.calculos.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.akconsultor.calculos.Fatorial;

class FatorialTest {

	@Test
	void testa0() {
		Integer resultado = Fatorial.calcular(0);

		assertEquals(1, resultado);
	}

	@Test
	void testaException() {
		assertThrows(IllegalArgumentException.class, () -> Fatorial.calcular(-1));
	}

	@Test
	void testa1() {
		Integer resultado = Fatorial.calcular(1);

		assertEquals(1, resultado);
	}

	@Test
	void testa4() {
		Integer resultado = Fatorial.calcular(4);

		assertEquals(24, resultado);
	}

	@Test
	void testa5() {
		Integer resultado = Fatorial.calcular(5);

		assertEquals(120, resultado);
	}

	@Test
	void testa6() {
		Integer resultado = Fatorial.calcular(6);

		assertEquals(720, resultado);
	}

}
