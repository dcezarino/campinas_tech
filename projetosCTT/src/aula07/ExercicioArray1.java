package aula07;

import java.util.Scanner;

public class ExercicioArray1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[5];

		for (int indiceNumeros = 0; indiceNumeros < numeros.length; indiceNumeros++) {
			System.out.print("Digite o número " + (indiceNumeros + 1) + " :");
			numeros[indiceNumeros] = sc.nextInt();
		}

		for (int indiceNumeros = 0; indiceNumeros < numeros.length; indiceNumeros++) {
			System.out.println("Número escolhido " + numeros[indiceNumeros]);
		}		
		
		sc.close();
	}

}
