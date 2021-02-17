package aula15.abstrata.alternativa;

public abstract class Funcionario extends Pessoa  {
	
	
	public double salario;
	
	public abstract void reajustar();
	
	public void pagarSalario() {
		System.out.println("Salario de "+ this.salario + " pago � " + this.nome);
	}
	
	
}
