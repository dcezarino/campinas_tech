package aula02;

import java.util.Scanner;

// Escreva um algoritmo em Java que leia dois números inteiros e determine qual é o menor. 
// Escreva um algoritmo que determina o maior também.

public class LeiaNumeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1;
		int n2;
		int nMenor;

		System.out.println("Digite o primeiro número: ");
		n1 = sc.nextInt();

		System.out.println("Digite o segundo número: ");
		n2 = sc.nextInt();

		if (n1 == n2) {
			System.out.println("O valores digitados são iguais");
		} else {
			if (n1 < n2) {
				nMenor = n1;
			} else {
				nMenor = n2;
			}

			System.out.println("O menor valor informado é " + nMenor);

		}
		
		sc.close();

	}
	
	
}
