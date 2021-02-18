package exerciciosavaliacao.exercicio13;

import java.util.Scanner;

/**
 * 
 * Escreva um programa que receba como entrada o número do mês (1, 2, ..., 12) e
 * o ano (0, ..., 2xxx), e devolva para o usuário a quantidade de dias que tem
 * aquele mês. Dica: preste atenção com anos bissextos.
 * 
 * @author Diego
 *
 */

public class QuantidadeDias {

	public static void main(String[] args) throws Exception {

		int dias = 31;
		int retornaMes;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o mês de [1-12] e o ano [XX/XXXX]: ");
		String mes = sc.next();

		// Verificar como pegar somente o dia do mês.
		retornaMes = Integer.parseInt(mes.substring(0, 2));

		if (retornaMes < 1 || retornaMes > 12) {
			System.out.println("Mês digitado inválido");
			System.exit(1);
		}

		switch (retornaMes) {
		case 2:
			dias -= 2;
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			dias--;
			break;
		}

		System.out.printf("O mês %d possui %d dias", retornaMes, dias);

		sc.close();
	}

}
