package exerciciosavaliacao.alternativebank;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Banco {

	public void adicionarConta(ContaBancaria conta) {

		Scanner sc = new Scanner(System.in);

		Random random = new Random();
		
		conta.setAgencia(35521);
		
		int numeroConta = random.ints(1000, 9999).findFirst().getAsInt();
		conta.setNumero(numeroConta);

		conta.setData(
				LocalDate.now().getDayOfMonth() + "/" + LocalDate.now().getMonth() + "/" + LocalDate.now().getYear());

		System.out.println("Digite o seu nome: ");
		String nomeCliente = sc.next();
		conta.setCliente(nomeCliente);

		System.out.println("Digite saldo inicial: ");
		double saldoInicial = sc.nextDouble();
		conta.setSaldo(saldoInicial);

		System.out.println("Informe o tipo de conta [1-Conta Corrente] [2-Conta Poupança] : ");
		int tipoConta = sc.nextInt();

		switch (tipoConta) {
		case 1:
			conta.setTipoConta("Conta Corrente");
			System.out.println("Digite o limite: ");
			ContaCorrente contaCorrente = new ContaCorrente();
			contaCorrente.setCliente(conta.getCliente());			
			contaCorrente.setAgencia(conta.getAgencia());
			contaCorrente.setNumero(conta.getNumero());
			contaCorrente.setData(conta.getData());
			contaCorrente.setSaldo(conta.getSaldo());
			contaCorrente.setLimite(sc.nextDouble());
			break;

		case 2:
			conta.setTipoConta("Conta Poupança");
			System.out.println("Informe o total de dias de Rendimento: ");
			ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
			contaPoupanca.setDiaRendimento(sc.nextInt());
			break;

		default:
			System.out.println("Tipo de Conta Inexistente.");

		}
		

		sc.close();
	}

}
