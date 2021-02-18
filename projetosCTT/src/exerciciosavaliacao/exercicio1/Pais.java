package exerciciosavaliacao.exercicio1;

import java.util.HashSet;
import java.util.Set;

public class Pais {

	private String codigoISO;
	private String nome;
	private double populacao;
	private double dimensao;
	//private ArrayList<Pais> fronteiras;
	private Set<Pais> paisesLimitrofes = new HashSet<Pais>();


	public Pais(String codigoISO, String nome, double dimensao, double populacao) {
		this.codigoISO = codigoISO;
		this.nome = nome;
		this.dimensao = dimensao;
		this.populacao = populacao;
		
	}
	
	public Set<Pais> getPaisesLimitrofesEmComum(Pais pais){
		Set<Pais> intersection = new HashSet<Pais>(this.getPaisesLimitrofes());
		paisesLimitrofes.retainAll(pais.getPaisesLimitrofes());
		return intersection;
	}
	
	public void adicionarPaisLimitrofe(Pais pais){
		this.paisesLimitrofes.add(pais);
	}

	public boolean verificaIgualdade(Pais pais) {
		if (this.codigoISO == pais.getCodigoISO()) {
			return true;
		} else {
			return false;
		}
	}

	public double calculaDensidadePopulacional() {
		double resultado = this.populacao / this.dimensao;
		return resultado;
	}

	public void setCodigoISO(String codigoISO) {
		this.codigoISO = codigoISO;
	}

	public String getCodigoISO() {
		return this.codigoISO;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setPopulacao(double populacao) {
		this.populacao = populacao;
	}

	public double getPopulacao() {
		return this.populacao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

	public double getDimensao() {
		return this.dimensao;
	}

	public Set<Pais> getPaisesLimitrofes() {
		return paisesLimitrofes;
	}

	public void setPaisesLimitrofes(Set<Pais> paisesLimitrofes) {
		this.paisesLimitrofes = paisesLimitrofes;
	}
	


}
