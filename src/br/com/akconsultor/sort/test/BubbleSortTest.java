package br.com.akconsultor.sort.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Vector;

import org.junit.jupiter.api.Test;

import br.com.akconsultor.sort.BubbleSort;

class BubbleSortTest {

	BubbleSort bs = new BubbleSort();

	@Test
	void sort() {
		Vector<Integer> resultadoSort = bs.bubbleSort();

		Integer numerosArray[] = {0, 1, 2, 3, 4, 5, 6, 7};
		Vector<Integer> resultadoEsperado = new Vector<Integer>(Arrays.asList(numerosArray));
		
		assertEquals(resultadoEsperado, resultadoSort);
	}

}
