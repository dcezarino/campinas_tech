package aula15.exercicios.exercicio1;

public class Main {

	public static void main(String[] args) {

		Gerente gerente = new Gerente("Funcionário Gerente", "00001", 2000);
		gerente.calcularSalario();
		gerente.imprimirFuncionario();

		System.out.println();

		Assistente assistente = new Assistente("Funcionário Assistente", "00002", 1500);
		assistente.calcularSalario();
		assistente.imprimirFuncionario();

		System.out.println();

		Vendedor vendedor = new Vendedor("Funcionáro Vendedor", "00003", 1500, 0.02);
		vendedor.calcularSalario();
		vendedor.imprimirFuncionario();

	}

}
