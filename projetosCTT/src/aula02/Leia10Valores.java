package aula02;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Construa um algoritmo que leia 10 valores inteiros e positivos e:
	- Encontre o maior valor
	- Encontre o menor valor
	- Calcule a média dos números lidos
 */

public class Leia10Valores {

	public static void main(String[] args) {

		int somaDosValores = 0;

		Scanner sc = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("#.##");

		// Primeiro valor
		System.out.println("Informe o primeiro número:");
		int valor = sc.nextInt();

		int maiorValor = valor;
		int menorValor = valor;

		somaDosValores += valor;

		// Segundo valor
		System.out.println("Informe o segundo número: ");
		valor = sc.nextInt();

		if (valor > maiorValor) {
			maiorValor = valor;
		}

		if (valor < menorValor) {
			menorValor = valor;
		}

		somaDosValores += valor;

		// Terceiro valor
		System.out.println("Informe o terceiro número: ");
		valor = sc.nextInt();

		if (valor > maiorValor) {
			maiorValor = valor;
		}

		if (valor < menorValor) {
			menorValor = valor;
		}

		somaDosValores += valor;

		// Quarto valor
		System.out.println("Informe o quarto número: ");
		valor = sc.nextInt();

		if (valor > maiorValor) {
			maiorValor = valor;
		}

		if (valor < menorValor) {
			menorValor = valor;
		}

		somaDosValores += valor;

		// Quinto valor
		System.out.println("Informe o quinto número: ");
		valor = sc.nextInt();

		if (valor > maiorValor) {
			maiorValor = valor;
		}

		if (valor < menorValor) {
			menorValor = valor;
		}

		somaDosValores += valor;

		// Sexto valor
		System.out.println("Informe o sexto número: ");
		valor = sc.nextInt();

		if (valor > maiorValor) {
			maiorValor = valor;
		}

		if (valor < menorValor) {
			menorValor = valor;
		}

		somaDosValores += valor;

		// Sétimo valor
		System.out.println("Informe o sétimo número: ");
		valor = sc.nextInt();

		if (valor > maiorValor) {
			maiorValor = valor;
		}

		if (valor < menorValor) {
			menorValor = valor;
		}

		somaDosValores += valor;

		// Oitavo valor
		System.out.println("Informe o oitavo número: ");
		valor = sc.nextInt();

		if (valor > maiorValor) {
			maiorValor = valor;
		}

		if (valor < menorValor) {
			menorValor = valor;
		}

		somaDosValores += valor;

		// Nono valor
		System.out.println("Informe o nono número: ");
		valor = sc.nextInt();

		if (valor > maiorValor) {
			maiorValor = valor;
		}

		if (valor < menorValor) {
			menorValor = valor;
		}

		somaDosValores += valor;

		// Décimo valor
		System.out.println("Informe o décimo número: ");
		valor = sc.nextInt();

		if (valor > maiorValor) {
			maiorValor = valor;
		}

		if (valor < menorValor) {
			menorValor = valor;
		}

		somaDosValores += valor;

		// Exibe o resultado na tela
		System.out.println("O maior número digitado é: " + maiorValor);
		System.out.println("O menor número digitado é: " + menorValor);
		System.out.println("A média dos números digitados é: " + f.format(somaDosValores / 10.0));

		sc.close();

	}

}
