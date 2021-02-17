package aula01;

public class ExibeNumeros {

	public static void main(String[] args) {

		int y = 99;
		int z = 11;

		System.out.println("O valor inicial da minha variável Y é: " + y);
		System.out.println("O valor inicial da minha variável Z é: " + z);
		
		int aux = 0;
		aux = y;
		y = z;
		z = aux;
		
		System.out.println("O valor depois da troca da minha variável Y é: " + y);
		System.out.println("O valor depois da troca da minha variável Z é: " + z);

	}

}
