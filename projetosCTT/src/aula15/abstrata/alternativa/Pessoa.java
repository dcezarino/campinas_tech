package aula15.abstrata.alternativa;

public abstract class Pessoa {
	public String nome;
	public int idade;
	public String email;
	
	public abstract void gravar(String nome, int idade, String email);

	public void imprimePessoa() {
		System.out.println("Dados de: "+ this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Email: " + this.email);
	}
}
