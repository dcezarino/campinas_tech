package aula17.exercicio;

public abstract class Produto implements CalculaPreco {

	private String nome;
	private String codigoBarras;
	private double valorUnitario;
	private int quantidadeDeVendas = 0;

	public Produto(String nome, String codigoBarras, double valorUnitario) {
		this.nome = nome;
		this.codigoBarras = codigoBarras;
		this.valorUnitario = valorUnitario;		
	}
		
	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQuantidadeDeVendas() {
		return quantidadeDeVendas;
	}

	public void setQuantidadeDeVendas(int quantidadeDeVendas) {
		this.quantidadeDeVendas = quantidadeDeVendas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}



}
