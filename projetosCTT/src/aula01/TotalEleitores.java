package aula01;

import java.util.Scanner;

public class TotalEleitores {

	public static void main(String[] args) {
		// Escreva um algoritmo para ler o número total de eleitores de um município, o
		// número de votos brancos, nulos e válidos. Calcular e escrever o percentual
		// que cada um representa em relação ao total de eleitores.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o total de votos");
		int totalVotos = scanner.nextInt();
		System.out.println("Digite o total de votos em branco");
		int totalVotosBrancos = scanner.nextInt();
		System.out.println("Digite o total de votos nulos");
		int totalVotosNulos = scanner.nextInt();
		System.out.println("Digite o total de votos validos");
		int totalVotosValidos = scanner.nextInt();

		System.out.println("A quantidade total de votos é: " + totalVotos);

		System.out.println("A quantidade total de votos em branco é: " + totalVotosBrancos);

		System.out.println("A quantidade total de votos nulos é: " + totalVotosNulos);

		System.out.println("A quantidade total de votos validos é: " + totalVotosValidos);

		double percentualVotosBrancos = CalculaPercentual.calcularPercentualX(totalVotos, totalVotosBrancos);

		double percentualVotosNulos = CalculaPercentual.calcularPercentualX(totalVotos, totalVotosNulos);

		double percentualVotosValidos = CalculaPercentual.calcularPercentualX(totalVotos, totalVotosValidos);

		System.out.println("-----------");

		System.out.println("O percentual total de votos em branco é: " + String.format("%.2f", percentualVotosBrancos));

		System.out.println("O percentual total de votos nulos é: " + String.format("%.2f", percentualVotosNulos));

		System.out.println("O percentual total de votos validos é: " + String.format("%.2f", percentualVotosValidos));

		scanner.close();

	}
}