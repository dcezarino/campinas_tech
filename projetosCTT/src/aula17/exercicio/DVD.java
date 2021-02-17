package aula17.exercicio;

public class DVD extends Produto implements CalculaPreco{

	public DVD(String nome, String codigoBarras, double valorUnitario) {
		super(nome, codigoBarras, valorUnitario);
	}

	@Override
	public void calculaTotalVendas() {
		double calculoDVD = ((this.getValorUnitario() * this.getQuantidadeDeVendas()) + 100);
		System.out.println(calculoDVD);
	}

}
