package exerciciosavaliacao.alternativebank;

import java.util.Scanner;

public class TestaConta {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		BancoAlternativo banco1 = new BancoAlternativo();			
		ContaBancaria contaBancaria = banco1.adicionarConta();
		banco1.exibirMenu(contaBancaria);
		sc.close();
		
		

	}

}
