package aula14.sobrecarga.animal;

public class TestaCachorro {

	public static void main(String[] args) {

		Cachorro doguinho = new Cachorro();
		doguinho.late();
		Pincher demonio = new Pincher();
		demonio.late();
		LuluDaPomeranea lessi = new LuluDaPomeranea();
		lessi.late();

	}

}
