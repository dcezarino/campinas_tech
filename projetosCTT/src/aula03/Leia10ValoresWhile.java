package aula03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Leia10ValoresWhile {
	
	public static void main(String[] args) {

		int somaDosValores = 0;

		Scanner sc = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("#.##");

		int cont = 1;
		int maiorValor = Integer.MIN_VALUE;
		int menorValor = Integer.MAX_VALUE;

		while (cont <= 10) {			
			
			System.out.printf("Informe o %d número: ", cont);
			int valor = sc.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;
			}

			if (valor < menorValor) {
				menorValor = valor;
			}
			
			// Incrementa o valor digitado
			somaDosValores += valor;
			
			cont++;

		}

		// Exibe o resultado na tela
		System.out.println("O maior número digitado é: " + maiorValor);
		System.out.println("O menor número digitado é: " + menorValor);
		System.out.println("A média dos números digitados é: " + df.format(somaDosValores / 10.0));
		
		sc.close();

	}

}
