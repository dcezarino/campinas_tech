package exerciciosavaliacao.exercicio10;

/**
 * 
 * Escreva uma classe Calculadora que tenha os métodos cada método recebe dois
 * parâmetros: somar subtrair multiplicar dividir elevar a potência n.
 * 
 * @author Diego
 *
 */


public class Main {
	public static void main(String[] args) {
		
		Calculadora c = new Calculadora(10,4);
		
		c.somar();
		System.out.println("Soma: " + c.getResultado());
		
		c.subtrair();
		System.out.println("Subtração: " +  c.getResultado());
		
		c.multiplicar();
		System.out.println("Multiplicação: " + c.getResultado());

		c.dividir();
		System.out.println("Divisão: " + c.getResultado());

		c.elevarPotencia();
		System.out.println("Potenciação: " + c.getResultado());
		

	}
}
