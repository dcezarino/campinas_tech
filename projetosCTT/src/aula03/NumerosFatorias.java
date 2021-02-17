package aula03;

import java.util.Scanner;

public class NumerosFatorias {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número que deseja saber o fatorial: ");		
		int valor = sc.nextInt();
		
		// Variável inicializando com 1, por causa da multiplicação e 0! = 1
		int resultado = 1;

		// Se valor for maior que 1
		while (valor > 1) {
			resultado *= (valor--);
			//valor--; // Decremento
		}

		System.out.println("O fatorial do número 5 é: " + resultado);
		
		sc.close();

	}

}
