package aula17.polimorfismo;

public class Cavalo extends Animal implements AnimalDomesticado {

	public Cavalo(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia) {
		super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
	}


	@Override
	public void emiteSom() {
		System.out.println("HUUUUU BRUUUUU BRU BRU BUR !!");
	}

	@Override
	public void veterinario() {
		System.out.println("� melhor eu ver o doutor (pica-pau)");
	}

	@Override
	public void alimenta() {
		System.out.println("Quero cenoura");
	}

	@Override
	public void banho() {
		System.out.println("Ainda bem, as moscas estavam me comendo");
	}

}
