package exerciciosavaliacao.exercicio3;

/**
 * 3. Fazer um programa com as seguintes características:
 * 
 * Uma classe chamada Universidade que terá como atributo um nome e terá um
 * método para informar o seu nome. Uma classe Pessoa, que terá como atributo
 * seu nome, em que universidade * trabalha e em quando entrou na universidade
 * um método que dirá seu nome e * em que universidade trabalha. Relacionar a
 * classe Pessoa para com a classe Universidade. Cada pessoa poderá ser
 * associada a uma Universidade.
 * 
 * @author Diego
 *
 */

public class Main {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();
		Universidade universidade1 = new Universidade();

		universidade1.setPessoa(pessoa1);
		universidade1.getPessoa().setNomePessoa("Carlos Alberto");
		universidade1.setNomeUniversidade("Universidade Metodista de São Paulo");

		Pessoa pessoa2 = new Pessoa();
		Universidade universidade2 = new Universidade();

		universidade2.setPessoa(pessoa2);
		universidade2.getPessoa().setNomePessoa("Maurício Associado");
		universidade2.setNomeUniversidade("Universidade Federal de Tocantins");

		System.out.println("A pessoa " + universidade1.getPessoa().getNomePessoa() + " trabalha na universidade "
				+ universidade1.getNomeUniversidade());
		System.out.println("A pessoa " + universidade2.getPessoa().getNomePessoa() + " trabalha na universidade "
				+ universidade2.getNomeUniversidade());
	}

}
