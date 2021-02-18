package exerciciosavaliacao.contabancaria;

public class ContaCorrente extends ContaBancaria {

	private double limite;
	private double taxa = 0.03;

	@Override
	public void sacar(double valor) {
		if (valor > this.saldo + limite) {
			System.out.println("Saldo insuficiente para realizar o saque");
		} else {
			this.saldo = this.saldo - valor;
			System.out.println("O saldo disponível é: " + this.saldo);
			if (this.saldo < 0) {
				System.err.println("Você está usando cheque especial!");
			}
			listaDeTransacoes.add("Saque no valor de " + valor);
		}
	}

	public double getLimite() {
		return limite;
	}

	@Override
	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

}