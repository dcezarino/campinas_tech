package exerciciosaulas.classes.exercicio2;

import exerciciosaulas.classes.exercicio1.Pessoa;

public class TestaAgenda {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Pessoa jurema = new Pessoa("Jurema", 1.75, 02, 05, 1994);
		Pessoa jose = new Pessoa("José", 1.75, 02, 02, 1984);
		Pessoa maria = new Pessoa("Maria", 1.75, 12, 01, 1989);
		Pessoa joca = new Pessoa("Joca", 1.75, 12, 12, 2000);
		Pessoa eder = new Pessoa("Eder", 1.75, 20, 01, 1990);

		agenda.armazenaPessoa(jurema);
		agenda.armazenaPessoa(jose);
		agenda.armazenaPessoa(maria);
		agenda.armazenaPessoa(joca);
		agenda.armazenaPessoa(eder);

		agenda.imprimeAgenda();

		agenda.imprimePessoa(0);
		agenda.imprimePessoa(1);
		agenda.imprimePessoa(3);
		agenda.imprimePessoa(2);
		agenda.imprimePessoa(4);

		agenda.removePessoa("Jurema");

		agenda.imprimeAgenda();

		System.out.println("A posição da Maria na agenda é :" + agenda.buscaPessoa("Maria"));
	}

}
