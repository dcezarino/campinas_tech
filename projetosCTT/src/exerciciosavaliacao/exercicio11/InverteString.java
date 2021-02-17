package exerciciosavaliacao.exercicio11;

import java.util.Scanner;

/**
 * * Escreva um algoritmo que inverta o conteúdo de uma String utilizando uma
 * estrutura de repetição. O usuário irá entrar com o valor de uma string, por
 * exemplo "ASDFG", e o programa deverá devolver o seguinte resultado "GFDSA".
 * Dicas: Você irá usar os seguinte métodos ou atributos:
 * 
 * String.length; // Para saber o tamanho de uma string
 * 
 * String.charAt(index); // Onde index é o índice que você quer acessar a sting.
 * O indíce de uma string começa sempre em 0 e termina no tamanho da string -1
 * (n-1);
 * 
 * char c='S'; String s=String.valueOf(c); // Para converter um char em String
 * novamente
 * 
 * 
 * @author Diego
 *
 */

public class InverteString {

	public static void main(String[] args) {

		String paraInverter = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = sc.next().toUpperCase();
		
		System.out.println(palavra);

		for (int i = palavra.length() - 1; i >= 0; i--) {
			paraInverter += palavra.charAt(i);

		}

		System.out.println("String invertida: " + paraInverter.toUpperCase());

		sc.close();

	}

}
