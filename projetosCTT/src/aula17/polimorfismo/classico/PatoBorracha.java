package aula17.polimorfismo.classico;

public class PatoBorracha extends Animal {

	public PatoBorracha(String nome, float comprimento, int numeroPatas, String cor, String ambiente,
			float velocidadeMedia) {
		super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
	}

	@Override
	public void emiteSom() {
		System.out.println("Queck Queck!!");
	}

}
