package aula17.polimorfismo.classico;

public class TestaAnimalClassico {
	public static void main(String[] args) {
		Animal pato = new Pato("Xubirub", 1.5f, 4, "marrom", "casinha", 1f);
		Animal gary = new PatoBorracha("jeiza", .6f, 4, "branca", "apartamento", .5f);
		
		pato.emiteSom();
		gary.emiteSom();
	}
}
