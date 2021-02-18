package exerciciosavaliacao.exercicio8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int x = 0, y = 0, r = 0;

		System.out.println("Eu sei dividir!");
		System.out.println("Informe o primeiro valor: ");

		try {
			x = teclado.nextInt();
		} catch (InputMismatchException inputMismatchException) {
			System.out.println(inputMismatchException.getMessage());
		}

		System.out.println("Informe o segundo valor: ");

		try {
			y = teclado.nextInt();

		} catch (InputMismatchException inputMismatchException) {
			System.out.println(inputMismatchException.getMessage());
		}

		try {
			r = (x / y);
		} catch (InputMismatchException inputMismatchException) {
			System.out.println(
					"Operação inválida!" + "\nDivisão por caractere inválido." + inputMismatchException.getMessage());
		} catch (ArithmeticException arithmeticException) {
			System.out.println(arithmeticException.getMessage());

		} finally {
			System.out.println("O resultado da soma é: " + r);			
		}
		
		teclado.close();
	}

}
