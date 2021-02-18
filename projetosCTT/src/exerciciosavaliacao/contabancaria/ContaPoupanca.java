package exerciciosavaliacao.contabancaria;

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;
	private double taxaRendimento = 0.03;	

	public void calcularNovoSaldo() {
		super.saldo = (saldo + (taxaRendimento * diaRendimento));
		System.out.println("Seu saldo acrescido a taxa de rendimento é: " + saldo);
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
}
