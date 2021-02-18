package exerciciosavaliacao.alternativebank;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;


public class BancoAlternativo {

	public ContaBancaria adicionarConta() {

		Random random = new Random();

		ContaBancaria contaBancaria = null;

		//Scanner sc = new Scanner(System.in);
		Scanner sc = TestaConta.sc;

		int numeroAgencia = 3552;

		System.out.println("Informe o tipo de conta [1-Conta Corrente] [2-Conta Poupança] : ");
		int tipoConta = sc.nextInt();

		switch (tipoConta) {
		case 1:

			ContaCorrente contaCorrente = new ContaCorrente();

			contaCorrente.setTipoConta("Conta Corrente");
			contaCorrente.setAgencia(numeroAgencia);

			System.out.println("Digite o seu nome: ");
			contaCorrente.setCliente(sc.next());

			contaCorrente.setNumero(random.ints(1000, 9999).findFirst().getAsInt());

			contaCorrente.setData(LocalDate.now().getDayOfMonth() + "/" + LocalDate.now().getMonth() + "/"
					+ LocalDate.now().getYear());

			System.out.println("Digite saldo inicial: ");
			contaCorrente.setSaldo(sc.nextDouble());

			System.out.println("Digite o limite: ");
			contaCorrente.setLimite(sc.nextDouble());

			contaBancaria = contaCorrente;
			break;

		case 2:

			ContaPoupanca contaPoupanca = new ContaPoupanca();

			contaPoupanca.setTipoConta("Conta Corrente");
			contaPoupanca.setAgencia(numeroAgencia);

			System.out.println("Digite o seu nome: ");
			contaPoupanca.setCliente(sc.next());

			contaPoupanca.setNumero((random.ints(1000, 9999).findFirst().getAsInt()));

			contaPoupanca.setData(LocalDate.now().getDayOfMonth() + "/" + LocalDate.now().getMonth() + "/"
					+ LocalDate.now().getYear());

			System.out.println("Digite saldo inicial: ");
			contaPoupanca.setSaldo(sc.nextDouble());

			System.out.println("Informe o total de dias de Rendimento: ");
			contaPoupanca.setDiaRendimento(sc.nextInt());

			contaBancaria = contaPoupanca;
			break;

		default:
			System.out.println("Tipo de Conta Inexistente.");

		}

		//sc.close();
		return contaBancaria;
		

	}

	public void exibirMenu(ContaBancaria conta) {
		
		Scanner in = TestaConta.sc;
		int opcao;
			
		do {
			
			System.out.println("Menu Conta Bancária");
			System.out.println("[1]-Listar Extrato");
			System.out.println("[2]-Efetuar Saque");
			System.out.println("[3]-Efetuar Depósito");
			System.out.println("[4]-Adicionar Limite Cheque Especial");
			System.out.println("[5]-Encerrar Conta");
			System.out.println("[0]-Sair");
			System.out.println("");
			
			opcao = in.nextInt();
			
			switch (opcao) {
			case 1:
				break;
			case 2:			
				System.out.println("Digite o valor do saque: ");
				conta.sacar(in.nextDouble());
				break;
			case 3:				
				System.out.println("Digite o valor do depósito: ");
				conta.depositar(in.nextDouble());
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				System.out.println("Sistema sendo encerrado...");
				break;
			}

			
		} while (opcao != 0);	

		
	}

}
