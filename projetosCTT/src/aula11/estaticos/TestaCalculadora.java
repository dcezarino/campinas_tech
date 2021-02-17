package aula11.estaticos;

public class TestaCalculadora {

	public static void main(String[] args) {

		System.out.println("A soma de 2 + 2 é: " + Calculadora.somar(2, 2));
		System.out.println("A subtração de 2 - 2 é: " + Calculadora.subtrair(2, 2));
		System.out.println("A multiplicação de 2 * 2 é: " + Calculadora.multiplicar(2, 2));
		System.out.println("A divisão de 2 / 2 é: " + Calculadora.dividir(2, 2));
		System.out.println("O valor de pi é: " + Math.PI);

	}

}
