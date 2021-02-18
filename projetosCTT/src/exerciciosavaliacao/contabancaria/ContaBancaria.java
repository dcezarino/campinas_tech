package exerciciosavaliacao.contabancaria;

import java.util.ArrayList;

public class ContaBancaria {

	protected String data;
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected String cliente;
	protected String tipoConta;
	protected ArrayList<String> listaDeTransacoes = new ArrayList<String>();

	public void sacar(double valor) {
		if (valor > this.saldo) {
			System.out.println("Saldo insuficiente para realizar o saque");
		} else {
			this.saldo = this.saldo - valor;
			System.out.println("O saldo disponível é: " + this.saldo);
			listaDeTransacoes.add("Saque no valor de " + valor);
		}
	}

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("O saldo disponível é: " + this.saldo);
		listaDeTransacoes.add("Depósito no valor de " + valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public void setLimite(double limite) {
		// Este método está sendo sobreescrito pela ContaCorrente
	}

}
