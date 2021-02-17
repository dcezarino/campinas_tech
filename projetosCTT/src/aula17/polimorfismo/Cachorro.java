package aula17.polimorfismo;

public class Cachorro extends Animal implements AnimalDomestico {

	public Cachorro(String nome, float comprimento, int numeroPatas, String cor, String ambiente,
			float velocidadeMedia) {
		super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
	}


	@Override
	public void emiteSom() {
		System.out.println("AUUUUUUUUUUUUUUUUUUUUUUUUU AUUUUU au au au au!!!!!");
	}
	@Override
	public void passear() {
		System.out.println("Passeando com o meu melhor amigo");
	}

	@Override
	public void veterinario() {
		System.out.println("N�o sei por que to aqui 2");		
	}

	@Override
	public void alimenta() {
		System.out.println("Quero comida do almo�o");
	}

	@Override
	public void brinca() {
		System.out.println("brinca com o meu melhor amigo");		
	}

	@Override
	public void banho() {
		System.out.println("eu detesto banho");		
	}

}
