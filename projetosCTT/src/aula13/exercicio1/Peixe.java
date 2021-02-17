package aula13.exercicio1;

public class Peixe extends Animal {

	private String caracteristica;

	public Peixe(String nome, float comprimento, int nPatas, String cor, String ambiente, float vMedia,
			String caracteristica) {
		super(nome, comprimento, nPatas, cor, ambiente, vMedia);
		this.caracteristica = caracteristica;
	}

	public void imprimirDadosPeixe() {

		System.out.println("Nome: " + this.nome);
		System.out.println("Comprimento: " + this.comprimento);
		System.out.println("Número Patas: : " + this.nPatas);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ambiente: " + this.ambiente);
		System.out.println("Velocidade Média: " + this.vMedia);
		System.out.println("Característica: " + this.caracteristica);
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

}
