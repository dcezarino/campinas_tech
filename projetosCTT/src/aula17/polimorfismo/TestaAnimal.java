package aula17.polimorfismo;

public class TestaAnimal {

	public static void main(String[] args) {
		AnimalNaoSelvagem cachorro = new Cachorro("Xubirub", 1.5f, 4, "marrom", "casinha", 1f);
		AnimalNaoSelvagem gato = new Gato("jeiza", .6f, 4, "branca", "apartamento", .5f);
		AnimalNaoSelvagem cavalo = new Cavalo("jeiza", .6f, 4, "branca", "apartamento", .5f);
		
		cachorro.emiteSom();
		System.out.println("-----------------------------------------");
		gato.emiteSom();
		System.out.println("-----------------------------------------");
		cavalo.emiteSom();
		
	}
	
}
