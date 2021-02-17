package aula15.exercicios.exercicio1;

public class Vendedor extends Funcionario{
	
	private double comissao;

	public Vendedor(String nome, String matricula, double salarioBase, double comissao) {
		super(nome, matricula, salarioBase);
		this.comissao = comissao;
	}

	@Override
	public void calcularSalario() {
		this.salarioBase = this.salarioBase + comissao;
	}

}
