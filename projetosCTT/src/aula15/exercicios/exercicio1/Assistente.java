package aula15.exercicios.exercicio1;

public class Assistente extends Funcionario {

	public Assistente(String nome, String matricula, double salarioBase) {
		super(nome, matricula, salarioBase);

	}

	@Override
	public void calcularSalario() {
		this.salarioBase = this.salarioBase;	
	}
}
