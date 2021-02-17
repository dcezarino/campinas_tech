package aula15.abstrata.alternativa;

public class Programador extends Funcionario{

	
	public void programa() {
		System.out.println("Estou programando xuxu beleza");
	}
	
	@Override
	public void reajustar() {
		this.salario += 1000;
	}
	
	@Override
	public void gravar(String nome, int idade, String email) {
		this.nome = nome;
		this.idade = idade;
		this.email = email+ "@minhaempresa.com";
		
	}
}
