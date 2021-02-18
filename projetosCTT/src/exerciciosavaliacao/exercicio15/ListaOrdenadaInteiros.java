package exerciciosavaliacao.exercicio15;

import java.util.Arrays;

public class ListaOrdenadaInteiros {

	public static void main(String[] args) {

		int[] arrayInteiros = { 10, 5, 8, 11, 22, 6, -1, -2 };	

		int posicaoMenorNumero = 0;

		int i = 0;
		while (i < arrayInteiros.length) {
			for (int j = i + 1; j < arrayInteiros.length; j++) {
				if (arrayInteiros[j] < arrayInteiros[posicaoMenorNumero]) {
					posicaoMenorNumero = j;
				}

			}
			int aux = arrayInteiros[i];
			arrayInteiros[i] = arrayInteiros[posicaoMenorNumero];
			arrayInteiros[posicaoMenorNumero] = aux;
			i++;
			posicaoMenorNumero = i;

		}
		
		System.out.println("Lista Ordenada");
		System.out.println(Arrays.toString(arrayInteiros));
	}

}
