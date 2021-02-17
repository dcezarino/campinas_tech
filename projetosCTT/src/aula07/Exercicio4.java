package aula07;

/*
 * Escreva um algoritmo que leia numeros, insira em um array e após mostre o maior valor.
 */
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {

		System.out.println("Digite o total de número que deseja inserir na lista: ");
		Scanner sc = new Scanner(System.in);
		int qtd = sc.nextInt();
		int maiorValor = Integer.MIN_VALUE;

		int[] numeros = new int[qtd];

		for (int indiceNumeros = 0; indiceNumeros < numeros.length; indiceNumeros++) {
			System.out.print("Digite o valor " + (indiceNumeros + 1) + ": ");
			numeros[indiceNumeros] = sc.nextInt();			
			
			if (numeros[indiceNumeros] > maiorValor) {
				maiorValor = numeros[indiceNumeros];
			}
			
			

		}		
		
		System.out.println("O maior número digitado é: " + maiorValor);

		sc.close();
	}

}
