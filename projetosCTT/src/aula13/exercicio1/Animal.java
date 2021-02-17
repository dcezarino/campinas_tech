package aula13.exercicio1;

public class Animal {

	protected String nome;
	protected float comprimento;
	protected int nPatas;
	protected String cor;
	protected String ambiente;
	protected float vMedia;

	public Animal(String nome, float comprimento, int nPatas, String cor, String ambiente, float vMedia) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.nPatas = nPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.vMedia = vMedia;
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Comprimento: " + this.comprimento);
		System.out.println("Número Patas: : " + this.nPatas);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ambiente: " + this.ambiente);
		System.out.println("Velocidade Média: " + this.vMedia);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public int getnPatas() {
		return nPatas;
	}

	public void setnPatas(int nPatas) {
		this.nPatas = nPatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public float getvMedia() {
		return vMedia;
	}

	public void setvMedia(float vMedia) {
		this.vMedia = vMedia;
	}

}

