package aula07;

import java.util.Scanner;

/*
 * Escreva um algoritmo que leia numeros, insira em um array e após mostre a quantidade de numeros pares.
 */

public class ExercicioArray3 {
	public static void main(String[] args) {

		int qtdNumerosPares = 0;
		int qtd = 0;

		System.out.println("Informe a quantidade de números que deseja inserir na lista: ");
		Scanner sc = new Scanner(System.in);
		qtd = sc.nextInt();

		int[] numeros = new int[qtd];

		for (int indiceNumeros = 0; indiceNumeros < numeros.length; indiceNumeros++) {
			System.out.printf("Digite o número " + (indiceNumeros + 1) + ": ");
			numeros[indiceNumeros] = sc.nextInt();
		}

		for (int indice = 0; indice < numeros.length; indice++) {

			if (numeros[indice] % 2 == 0) {
				qtdNumerosPares += 1;
			}
		}

		System.out.println("Temos " + qtdNumerosPares + " números pares");

		sc.close();

	}

}
