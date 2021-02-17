package aula07;

import java.util.Scanner;

public class ExercicioArray1Alternativo {
	public static void main(String[] args) {

		System.out.println("Digite a quantidade de números que deseja inserir na lista: ");
		Scanner sc = new Scanner(System.in);
		int qtd = sc.nextInt();
		
		int[] numeros = new int[qtd];

		for (int indiceNumeros = 0; indiceNumeros < numeros.length; indiceNumeros++) {
			System.out.print("Digite o número " + (indiceNumeros + 1) + " :");
			numeros[indiceNumeros] = sc.nextInt();
		}

		for (int indiceNumeros = 0; indiceNumeros < numeros.length; indiceNumeros++) {
			System.out.println("Número escolhido " + numeros[indiceNumeros]);
		}

		sc.close();

	}

}
