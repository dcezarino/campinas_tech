package aula14.sobrecarga.animal;

public class Cachorro {
	
	private String nome;
	private double comprimento;
	private String cor;

	// Somente métodos com tipo de visibilidade protected podem ser sobrepostos
	protected void late() {
		System.out.println("Au Au");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
