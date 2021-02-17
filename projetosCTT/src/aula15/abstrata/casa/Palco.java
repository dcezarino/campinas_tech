package aula15.abstrata.casa;

public class Palco {

	private Ator ator;
	

	public Palco() {
		this.ator = new AtorFeliz();
	}

	public void altera() {
		this.ator = new AtorTriste();
	}

	public void atuar() {
		this.ator.ato();
	}

}