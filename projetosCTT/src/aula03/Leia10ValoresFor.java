package aula03;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Construa um algoritmo que leia 10 valores inteiros e positivos e:
	- Encontre o maior valor
	- Encontre o menor valor
	- Calcule a média dos números lidos
 */

public class Leia10ValoresFor {

	public static void main(String[] args) {

		int somaDosValores = 0;

		Scanner sc = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("#.##");

		int maiorValor = Integer.MIN_VALUE;
		int menorValor = Integer.MAX_VALUE;

		for (int i = 1; i <= 10; i++) {
			
			System.out.printf("Informe o %d número: ", i);
			int valor = sc.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;
			}

			if (valor < menorValor) {
				menorValor = valor;
			}
			
			// Incrementa o valor digitado
			somaDosValores += valor;

		}

		// Exibe o resultado na tela
		System.out.println("O maior número digitado é: " + maiorValor);
		System.out.println("O menor número digitado é: " + menorValor);
		System.out.println("A média dos números digitados é: " + df.format(somaDosValores / 10.0));
		
		sc.close();

	}
	

}
