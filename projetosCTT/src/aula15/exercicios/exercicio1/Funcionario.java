package aula15.exercicios.exercicio1;

public abstract class Funcionario {

	public String nome;
	public String matricula;
	public double salarioBase;

	public Funcionario(String nome, String matricula, double salarioBase) {
		this.nome = nome;
		this.matricula = matricula;
		this.salarioBase = salarioBase;
	}

	public abstract void calcularSalario();

	public void imprimirFuncionario() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Salário Base: " + this.salarioBase);
	}

}
