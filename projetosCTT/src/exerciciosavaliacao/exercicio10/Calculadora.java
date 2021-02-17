package exerciciosavaliacao.exercicio10;

public class Calculadora {

	private double valor1;
	private double valor2;
	private double resultado;

	public Calculadora(double valor1, double valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public void somar() {
		resultado = valor1 + valor2;
	}

	public void subtrair() {
		resultado = valor1 - valor2;
	}

	public void multiplicar() {
		resultado = valor1 * valor2;
	}

	public void dividir() {
		resultado = valor1 / valor2;
	}

	public void elevarPotencia() {
		resultado =  Math.pow(valor1, valor2);
	}

	public double getResultado() {
		return resultado;
	}

}
