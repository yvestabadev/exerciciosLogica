package br.com.akconsultor.sort;

import java.util.Arrays;
import java.util.Vector;

public class BubbleSort {

	private Integer[] numerosArray = { 5, 3, 2, 4, 7, 1, 0, 6 };
	private Vector<Integer> numerosOrdenar = new Vector<Integer>(Arrays.asList(numerosArray));

	private void etapas(int i) {
		Integer primeiroNumero = numerosOrdenar.get(i);
		Integer segundoNumero = numerosOrdenar.get(i + 1);

		Integer comparacao = primeiroNumero.compareTo(segundoNumero);

		if (comparacao > 0) {
			numerosOrdenar.set(i, segundoNumero);
			numerosOrdenar.set(i + 1, primeiroNumero);
		}
	}

	public Vector<Integer> bubbleSort() {

		for (int j = 1; j < numerosOrdenar.size(); j++) {
			for (int i = 0; i < (numerosOrdenar.size() - j); i++) {
				etapas(i);
			}
		}

		return numerosOrdenar;
	}

}
