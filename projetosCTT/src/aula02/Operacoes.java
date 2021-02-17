package aula02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Operacoes {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual operação matemática deseja executar?");
		System.out.println("Opção 1-Adição");
		System.out.println("Opção 2-Subtração");
		System.out.println("Opção 3-Multiplicação");
		System.out.println("Opção 4-Divisão");

		DecimalFormat df = new DecimalFormat("#.##");

		int opcao = sc.nextInt();

		System.out.println("Informe o primeiro valor: ");
		int n1 = sc.nextInt();

		System.out.println("Informe o segundo valor: ");
		int n2 = sc.nextInt();

		switch (opcao) {
		case 1:
			int adicao = n1 + n2;
			System.out.println("A adição dos números " + n1 + " e " + n2 + " é: " + adicao);
			break;
		case 2:
			int subtracao = n1 - n2;
			System.out.println("A subtração dos números " + n1 + " e " + n2 + " é: " + subtracao);
			break;
		case 3:
			int multiplicacao = n1 * n2;
			System.out.println("A multiplicação dos números " + n1 + " e " + n2 + " é: " + multiplicacao);
			break;
		case 4:
			if (n2 == 0) {
				System.out.println("Não se pode dividir por 0");
			} else {
				double divisao = n1 / (double) n2;
				System.out.println("A divisão dos números " + n1 + " e " + n2 + " é: " + df.format(divisao));
				break;
			}

		default:
			System.out.println("A opção " + opcao + " informada é inválida.");
			System.out.println("Operação matemática não será executada!");
			break;
		}

		sc.close();

	}

}
