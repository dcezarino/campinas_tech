package aula16.interfaces.exemplo;

import java.util.Scanner;

public class Portaria {
	
	public void autorizaEntrada(Autorizavel autorizavel) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ol�, bem vindo ao nosso predio!");
		System.out.print("Digite sua senha: ");
		int senha = scanner.nextInt();
		boolean autorizado = autorizavel.autoriza(senha);

		if (autorizado) {
			System.out.println("Pode entrar!");
		} else {
			System.err.println("N�o pode entrar");
		}
	}
}
