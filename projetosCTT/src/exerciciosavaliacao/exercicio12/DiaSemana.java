package exerciciosavaliacao.exercicio12;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {

		System.out.println("Informe um número: ");
		System.out.println("[1]-Domingo");
		System.out.println("[2]-Segunda");
		System.out.println("[3]-Terça");
		System.out.println("[4]-Quarta");
		System.out.println("[5]-Quinta");
		System.out.println("[6]-Sexta");
		System.out.println("[7]-Sábado");
		System.out.println("[0]-Sair");

		Scanner sc = new Scanner(System.in);
		int opcao = sc.nextInt();

		switch (opcao) {
		case 0:
			System.out.println("Opção " + opcao + " escolhida. Sistema sendo finalizado...");
			break;
		case 1:
			System.out.println("Opção " + opcao + " - Domingo");
			break;
		case 2:
			System.out.println("Opção " + opcao + " - Segunda");
			break;
		case 3:
			System.out.println("Opção " + opcao + " - Terça");
			break;
		case 4:
			System.out.println("Opção " + opcao + " - Quarta");
			break;
		case 5:
			System.out.println("Opção " + opcao + " - Quinta");
			break;
		case 6:
			System.out.println("Opção " + opcao + " - Sexta");
			break;
		case 7:
			System.out.println("Opção " + opcao + " - Sábado");
			break;
		default:
			System.out.println("Opção " + opcao + " escolhida inválida, tente novamente.");
			break;
		}

		sc.close();

	}

}
