package aula17.polimorfismo;

public class Gato extends Animal implements AnimalDomestico {

	public Gato(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia) {
		super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
	}

	@Override
	public void emiteSom() {
		System.out.println("MEEEEEEAUUU ME ME MEAUUUUUU");
	}

	@Override
	public void passear() {
		System.out.println("Passeando com o humano");
	}

	@Override
	public void veterinario() {
		System.out.println("N�o sei por que to aqui");		
	}

	@Override
	public void alimenta() {
		System.out.println("Quero whiskay");
	}

	@Override
	public void brinca() {
		System.out.println("brinca com o humano");		
	}

	@Override
	public void banho() {
		System.out.println("eu mesmo me dou banho");		
	}


}
