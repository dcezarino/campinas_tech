package aula15.exercicios.exercicio1;

public class Gerente extends Funcionario {

	public Gerente(String nome, String matricula, double salarioBase) {
		super(nome, matricula, salarioBase);
	}

	@Override
	public void calcularSalario() {
		this.salarioBase = this.salarioBase * 2;
	}

}
