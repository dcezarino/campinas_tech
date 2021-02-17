package aula02;

// 1. Escreva um algoritmo que leia um número inteiro e diga se ele é par ou ímpar.
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número inteiro: ");
		int n1 = sc.nextInt();

		if (n1 % 2 == 0) {
			System.out.println("O número informado é par");
		} else {
			System.out.println("O número informado é ímpar");
		}

		sc.close();

	}

}
