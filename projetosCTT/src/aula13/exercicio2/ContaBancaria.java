package aula13.exercicio2;

public class ContaBancaria {

	protected String cliente;
	protected int numConta;
	protected float saldo;

	public ContaBancaria(String cliente, int numConta, float saldo) {
		this.cliente = cliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public void sacar(float valor) {
		if (valor > this.saldo) {
			System.out.println("Saldo insuficiente para realizar o saque");
		} else {
			this.saldo = this.saldo - valor;
		}
	}

	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}

	public String getCliente() {
		return cliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public float getSaldo() {
		return saldo;
	}

}
