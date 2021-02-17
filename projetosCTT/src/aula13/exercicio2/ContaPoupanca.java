package aula13.exercicio2;

public class ContaPoupanca extends ContaBancaria {
	
	private int diaRendimento;
	private double taxaRendimento;
	
	public ContaPoupanca(String cliente, int numConta, float saldo, double taxaRendimento ) {
		super(cliente, numConta, saldo);
		if(taxaRendimento < 1 ) {
			this.taxaRendimento += 1;
		} else {
			this.taxaRendimento = taxaRendimento;
		}
	}
	
	public void calcularNovoSaldo() {		
		super.saldo = (float) (saldo + (taxaRendimento * diaRendimento));
		System.out.println("Seu saldo acrescido a taxa de rendimento é: " + saldo);
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

}
