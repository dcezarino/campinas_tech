package exerciciosavaliacao.exercicio14;

import java.util.Scanner;

/**
 * Escreva um programa que receba um número como entrada e diga se ele é primo
 * ou não.
 * 
 * @author Diego
 *
 */

public class ValidaNumeroPrimo {

	public static void main(String[] args) {

		int nPrimo;
		int nDivisores = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número a ser verificado: ");
		nPrimo = sc.nextInt();

		// Verifica o total de números divisiveis
		for (int i = 1; i <= nPrimo; i++) {
			if (nPrimo % i == 0)
				nDivisores++;
		}

		// Se o número é divisível por 1 e por ele mesmo a variável nDivisores = 2,
		// então o número é primo.
		if (nDivisores == 2) {
			System.out.println("O número " + nPrimo + " é primo");
		} else {
			System.out.println("O número " + nPrimo + " não é primo");
		}

		sc.close();

	}

}
