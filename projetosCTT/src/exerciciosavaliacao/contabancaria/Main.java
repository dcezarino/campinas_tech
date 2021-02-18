package exerciciosavaliacao.contabancaria;

import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Banco banco1 = new Banco();
		ContaBancaria contaBancaria = banco1.adicionarConta();
		banco1.exibirMenu(contaBancaria);
		sc.close();

	}

}
