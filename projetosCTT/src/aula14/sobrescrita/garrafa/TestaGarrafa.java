package aula14.sobrescrita.garrafa;

public class TestaGarrafa {

	public static void main(String[] args) {

		Garrafa sprite = new Garrafa();		
		System.out.println("A capacidade da garrafa é: " + sprite.getCapacidadeLitros());
		sprite.encher(5000);
		System.out.println("A capacidade da garrafa é: " + sprite.getCapacidadeLitros());
		sprite.encher(2.0);
		System.out.println("A capacidade da garrafa é: " + sprite.getCapacidadeLitros());
		sprite.encher("5.0");
		System.out.println("A capacidade da garrafa é: " + sprite.getCapacidadeLitros());

	}

}
