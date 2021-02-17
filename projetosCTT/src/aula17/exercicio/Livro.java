package aula17.exercicio;

public class Livro extends Produto implements CalculaPreco {

	public Livro(String nome, String codigoBarras, double valorUnitario) {
		super(nome, codigoBarras, valorUnitario);
	}

	@Override
	public void calculaTotalVendas() {
		double calculoLivro = ((this.getValorUnitario() * this.getQuantidadeDeVendas())-50);
		System.out.println(calculoLivro);

	}

}
