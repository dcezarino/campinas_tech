package exerciciosavaliacao.contabancaria;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Banco {

	String senhaGerente = "G3r3nt3";
	String nomeDoBanco = "Alternative Bank";

	public ContaBancaria adicionarConta() {

		Random random = new Random();

		ContaBancaria contaBancaria = null;

		// Scanner sc = new Scanner(System.in);
		Scanner sc = Main.sc;

		int numeroAgencia = 3552;

		System.out.println("Informe o tipo de conta [1-Conta Corrente] [2-Conta Poupança]: ");
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
			
			System.out.println("Saldo atual: " + contaCorrente.getSaldo());

			contaBancaria = contaCorrente;
			break;

		case 2:

			ContaPoupanca contaPoupanca = new ContaPoupanca();

			contaPoupanca.setTipoConta("Conta Poupança");
			contaPoupanca.setAgencia(numeroAgencia);

			System.out.println("Digite o seu nome: ");
			contaPoupanca.setCliente(sc.next());

			contaPoupanca.setNumero((random.ints(1000, 9999).findFirst().getAsInt()));

			contaPoupanca.setData(LocalDate.now().getDayOfMonth() + "/" + LocalDate.now().getMonthValue() + "/"
					+ LocalDate.now().getYear());

			System.out.println("Digite o saldo inicial: ");
			contaPoupanca.setSaldo(sc.nextDouble());

			System.out.println("Informe o total de dias de Rendimento: ");
			contaPoupanca.setDiaRendimento(sc.nextInt());

			contaPoupanca.calcularNovoSaldo();

			contaBancaria = contaPoupanca;
			break;

		default:
			System.out.println("Tipo de Conta Inexistente.");

		}

		// sc.close();
		return contaBancaria;

	}

	public void exibirMenu(ContaBancaria conta) {

		Scanner in = Main.sc;
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
				System.out.println("Saldo atual: " + conta.getSaldo());
				if (!conta.listaDeTransacoes.isEmpty()) {
					System.out.println("Transações efetuadas nesta conta: ");
					for (String transacao : conta.listaDeTransacoes) {
						System.out.println(transacao);
					}
				} else {
					System.out.println("Ainda não consta nenhuma transaçãoo nesta conta.");
				}

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
				Scanner sc = Main.sc;
				if (conta.tipoConta == "Conta Corrente") {
					System.out.println("Digite a senha para efetuar esta operação: ");
					String senha = sc.next();
					if (senha.equals(senhaGerente)) {
						System.out.println("Digite o novo limite da conta: ");
						double novoLimite = sc.nextDouble();
						conta.setLimite(novoLimite);
					} else {
						System.out.println("Senha incorreta!");
					}

				} else {
					System.out.println("Menu inválido para Conta Poupança");
				}
				break;
			case 5:
				Scanner sc5 = Main.sc;
				if (conta.getSaldo() == 0) {
					System.out.println("Digite a senha para efetuar esta operação: ");
					String senha = sc5.next();
					if (senha.equals(senhaGerente)) {
						System.out.println("Conta encerrada!");
						opcao = 0;
					} else {
						System.out.println("Senha incorreta!");
					}

				} else {
					System.out.println("O saldo desta conta é " + conta.getSaldo()
							+ " e, portanto, não pode ser encerrada. O saldo deve ser 0.00 para prosseguir com o encerramento.");
				}

				break;
			case 0:
				System.out.println("Sistema sendo encerrado...");
				break;

			}

		} while (opcao != 0);

	}

}
