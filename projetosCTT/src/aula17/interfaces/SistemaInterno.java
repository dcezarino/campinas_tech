package aula17.interfaces;

import java.util.Scanner;

public class SistemaInterno {

	//qual parametro esse metodo deve ter?
	public void login(Diretor dir) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite seu usuario: " );
		String usuario = scanner.next();
		System.out.print("Digite sua senha: " );
		int senha = scanner.nextInt();
		
		// o que colocar aqui? 
		if (dir.autentica(usuario, senha)) {
			System.out.println("Voce esta autenticado!!! YUUUPI");
		} else {
			System.err.println("BUUUH,  voce n�o sabe de nada la la la!");
		}
		
		scanner.close();
	}
	public void login(Gerente ger) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite seu usuario: " );
		String usuario = scanner.next();
		System.out.print("Digite sua senha: " );
		int senha = scanner.nextInt();
		
		// o que colocar aqui? 
		if (ger.autentica(usuario, senha)) {
			System.out.println("Voce esta autenticado!!! YUUUPI");
		} else {
			System.err.println("BUUUH,  voce n�o sabe de nada la la la!");
		}
		
		scanner.close();
	}
	public void login(Cliente cli) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite seu usuario: " );
		String usuario = scanner.next();
		System.out.print("Digite sua senha: " );
		int senha = scanner.nextInt();
		
		// o que colocar aqui? 
		if (cli.autentica(usuario, senha)) {
			System.out.println("Voce esta autenticado!!! YUUUPI");
		} else {
			System.err.println("BUUUH,  voce n�o sabe de nada la la la!");
		}
		
		scanner.close();
	}
}
