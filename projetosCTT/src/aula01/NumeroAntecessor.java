package aula01;
import java.util.Scanner;

public class NumeroAntecessor {
	public static void main(String[] args) {

		System.out.println("Por favor digite um valor inteiro para que digamos qual é o seu antecessor");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int antecessor = a - 1;
		System.out.println("O antecessor de " + a + " é: " + antecessor);

	}

}
