package aula15.abstrata.alternativa;

public class Gerente extends Funcionario {

	public String usuario;
	public String senha;
	
	@Override
	public void reajustar() {
		this.salario += 1500;
	}
	
	@Override
	public void gravar(String nome, int idade, String email) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
	}
}
