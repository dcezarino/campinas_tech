package aula17.exercicio;

public class CD extends Produto implements CalculaPreco{

		
	public CD(String nome, String codigoBarras, double valorUnitario) {
		super(nome, codigoBarras, valorUnitario);
	}

	@Override
	public void calculaTotalVendas() {
		double calculoCD = this.getValorUnitario() * this.getQuantidadeDeVendas();
		System.out.println(calculoCD);
	}
	
}
