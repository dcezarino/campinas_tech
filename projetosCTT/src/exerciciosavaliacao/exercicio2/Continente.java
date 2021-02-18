package exerciciosavaliacao.exercicio2;

import java.util.List;

public class Continente {

	private String continente;
	private int qtdepaises;
	private double totaldimensao;
	private int totalpessoas;
	private double densidade;
	private int maiorpopulacao;
	private int menorpopulacao;
	private List<Pais> paises;

	public Continente(String continente, List<Pais> paises) {
		this.continente = continente;
		this.paises = paises;
	}

	public void adicionarPaises(Pais pais) {
		paises.add(pais);
	}

	public double getDimensaoTotal() {
		double total = 0;
		for (Pais p : paises) {
			total += p.getDimensao();
		}
		return total;
	}

	public int getPopulacaoTotal() {
		int total = 0;
		for (Pais p : paises) {
			total += p.getPopulacao();
		}
		return total;
	}

	public double getDensidadeTotal() {
		int total = 0;
		for (Pais p : paises) {
			total += p.getPopulacao() / p.getDimensao();
		}
		return total;
	}

	public int getMaiorPopulacao() {
		return 0;
	}


	public int getMenorPopulacao() {
		return 0;
	}
	
	public int getMaiorDimensaoTerritorial() {
		return 0;
	}
	
	public int getMenorDimensaoTerritorial() {
		return 0;
	}
	
	public int getRazaoMaiorPais() {
		return 0;
	}

}
