package aula03;

import java.util.Scanner;

public class InverteString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a String a ser invertida: ");

		String paraInverter = sc.nextLine();

		String invertida = "";

		// Exemplo --> Diego
		// i = tamanho da String - 1? --> 4
		// s.charAt(4) --> pega a posição 4 da String Diego (0,1,2,3,4) e assim
		// sucessivamente
		for (int i = paraInverter.length() - 1; i >= 0; i--) {
			// Função (charAt) que pega a posição de acordo com o valor do i.
			invertida += paraInverter.charAt(i);
		}

		// Exibe a String invertida
		System.out.println(invertida);

		sc.close();	

	}

}
