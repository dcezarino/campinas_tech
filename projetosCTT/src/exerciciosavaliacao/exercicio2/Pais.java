package exerciciosavaliacao.exercicio2;

public class Pais {

	private String nome;
	public double dimensao;
	private Integer populacao;
	private double densidade;
	private double maiorPopulacao;
	private double menorPopulacao;
	private double maiorDimensao;
	private double menorDimensao;
	private String razaoMaiorPais;

	public Pais(String nome, double dimensao, Integer populacao, double densidade, double maiorPopulacao,
			double menorrPopulacao, double maiorDimensao, double menorDimensao, String razaoMaiorPais) {
		this.nome = nome;
		this.dimensao = dimensao;
		this.populacao = populacao;
		this.densidade = densidade;
		this.maiorPopulacao = maiorPopulacao;
		this.menorPopulacao = menorPopulacao;
		this.maiorDimensao = maiorDimensao;
		this.menorDimensao = menorDimensao;
		this.razaoMaiorPais = razaoMaiorPais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPopulacao() {
		return populacao;
	}

	public void setPopulacao(Integer populacao) {
		this.populacao = populacao;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

	public double getDensidade() {
		return densidade;
	}

	public void setDensidade(double densidade) {
		this.densidade = densidade;
	}

	public double getMaiorPopulacao() {
		return maiorPopulacao;
	}

	public void setMaiorPopulacao(double maiorPopulacao) {
		this.maiorPopulacao = maiorPopulacao;
	}

	public double getMenorPopulacao() {
		return menorPopulacao;
	}

	public void setMenorPopulacao(double menorPopulacao) {
		this.menorPopulacao = menorPopulacao;
	}

	public double getMaiorDimensao() {
		return maiorDimensao;
	}

	public void setMaiorDimensao(double maiorDimensao) {
		this.maiorDimensao = maiorDimensao;
	}

	public double getMenorDimensao() {
		return menorDimensao;
	}

	public void setMenorDimensao(double menorDimensao) {
		this.menorDimensao = menorDimensao;
	}

	public String getRazaoMaiorPais() {
		return razaoMaiorPais;
	}

	public void setRazaoMaiorPais(String razaoMaiorPais) {
		this.razaoMaiorPais = razaoMaiorPais;
	}

}
