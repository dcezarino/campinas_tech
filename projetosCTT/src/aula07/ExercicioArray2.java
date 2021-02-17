package aula07;

/*
 * Escreva um algoritmo que leia numeros, insira em um array e após mostre a quantidade de numeros negativos.
 */

import java.util.Scanner;

public class ExercicioArray2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer[] numeros = new Integer[5];
		int qtdNumerosNegativos = 0;

		for (int indiceNumeros = 0; indiceNumeros < numeros.length; indiceNumeros++) {
			System.out.print("Digite o número " + (indiceNumeros + 1) + " :");
			numeros[indiceNumeros] = sc.nextInt();
		}

		for (int indiceNumeros = 0; indiceNumeros < numeros.length; indiceNumeros++) {
			if (numeros[indiceNumeros] < 0) {
				qtdNumerosNegativos += 1;
			}
		}
		
		System.out.println("Temos " + qtdNumerosNegativos + " números negativos");

		sc.close();
	}
}
