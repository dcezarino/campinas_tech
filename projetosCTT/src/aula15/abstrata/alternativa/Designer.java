package aula15.abstrata.alternativa;

public class Designer extends Funcionario {

	@Override
	public void reajustar() {
		this.salario += 1050;
	}
	
	@Override
	public void gravar(String nome, int idade, String email) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
	}

}
