package aula07;

import java.util.Scanner;

/*
 * Escreva um algoritmo que simula um jogo da forca simples. o usuario precisara adivinhar uma palavra chutando cada letra 
 * em no máximo 10 chutes, caso o usuario acerte a letra o jogo dira que ele acertou, caso tenha errado, o numero de 
 * tentativas vai dinimuindo. Caso o numero de tentativas chegue a 0 o usuário perde.
 */

public class JogoForca {

	public static void main(String[] args) {
		
		System.out.println("#############################");
		System.out.println("#############################");
		System.out.println("#############################");
		System.out.println("Bem Vindo(a) ao Jogo da Forca");
		System.out.println("#############################");
		System.out.println("#############################");
		System.out.println("#############################");
				
		System.out.println("Digite uma letra: ");
		Scanner sc = new Scanner(System.in);
		String letra = sc.nextLine();
		
		String palavra = "Piracicaba";
		
		
		
		
		sc.close();
	}

}
