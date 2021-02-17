package exerciciosavaliacao.alternativebank;

public class ContaCorrente extends ContaBancaria {

	private double limite;
	private double taxa = 0.03;

//	public ContaCorrente() {
//		this.limite = limite;
//		this.taxa = taxa;
//	}

	public double getLimite() {
		return limite;
	}

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
