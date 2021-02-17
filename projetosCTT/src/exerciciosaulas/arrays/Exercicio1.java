package exerciciosaulas.arrays;

import java.util.Scanner;

/**
 * Escreva um algoritmo que leia numeros insira em um array 
 * após mostre os numeros informados na tela.
 *
 */
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escolha a quantidade de numeros a armezenar: ");
		int quantidadeDeNumeros = scanner.nextInt(); 
		int[] numeros = new int[quantidadeDeNumeros];
		
		for (int indiceNumeros = 0; indiceNumeros < numeros.length; indiceNumeros++) {
			System.out.print("Digite o numero "+ (indiceNumeros + 1) + ": ");
			numeros[indiceNumeros] = scanner.nextInt();
		}
		
		for (int indiceNumeros = 0; indiceNumeros < numeros.length; indiceNumeros++) {
			System.out.println("Numero "+ numeros[indiceNumeros] + " armazenado");
		}
		
		scanner.close();
	}
}