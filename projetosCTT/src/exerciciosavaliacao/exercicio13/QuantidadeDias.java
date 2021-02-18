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
		int retornaMes = 0;
		int retornaAno = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o mês de [1-12] e o ano [XX/XXXX]: ");
		String string = sc.nextLine();

		try {
			// Separa o ano e o mês de um String usando o método substring
			retornaMes = Integer.parseInt(string.substring(0, 2));
			retornaAno = Integer.parseInt(string.substring(3, 7));
		} catch (Exception e) {
			System.out.println("Mês e ano digitado inválido ou fora do padrão [XX/XXXX]");
			System.exit(1);
		}

		if (retornaMes < 1 || retornaMes > 12) {
			System.out.println("Mês digitado inválido");
			System.exit(0);
		}

		switch (retornaMes) {
		case 2:
			if ((retornaAno % 400 == 0) || ((retornaAno % 4 == 0) && (retornaAno % 100 != 0))) {
				dias -= 2;
				break;
			} else {
				dias -= 3;
				break;
			}
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
