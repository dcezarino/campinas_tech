package aula17.polimorfismo.classico;

public class Pato extends Animal {

	public Pato(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia) {
		super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
	}

	@Override
	public void emiteSom() {
		System.out.println("Quack Quack!!");
	}

}
