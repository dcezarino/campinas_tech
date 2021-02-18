package exerciciosavaliacao.exercicio5;

/**
 * Escreva uma classe Agenda
 * 
 * contém vários contatos do tipo Contato. Cada contato possui nome, telefone e
 * email. Agenda também possui um nome. Crie métodos que retornam uma String com
 * a informação de cada contato
 * 
 * @author Diego
 *
 */

public class Main {

	public static void main(String[] args) {

		Agenda agenda1 = new Agenda("Agenda Contatos 01");

		Contato c1 = new Contato("Contato Associado 01", "1999999-5555", "contato1@contato.com.br");
		Contato c2 = new Contato("Contato Associado 02", "1999999-0000", "contato2@contato.com.br");
		Contato c3 = new Contato("Contato Associado 03", "1999999-2222", "contato3@contato.com.br");
		Contato c4 = new Contato("Contato Associado 04", "1999999-3333", "contato4@contato.com.br");
		Contato c5 = new Contato("Contato Associado 05", "1999999-4444", "contato5@contato.com.br");
		Contato c6 = new Contato("Contato Associado 06", "1999999-5555", "contato6@contato.com.br");
		Contato c7 = new Contato("Contato Associado 07", "1999999-6666", "contato7@contato.com.br");
		Contato c8 = new Contato("Contato Associado 08", "1999999-7777", "contato8@contato.com.br");
		Contato c9 = new Contato("Contato Associado 09", "1999999-8888", "contato9@contato.com.br");
		Contato c10 = new Contato("Contato Associado 10", "1999999-9999", "contato10@contato.com.br");

		agenda1.inserirContato(c1);
		agenda1.inserirContato(c2);
		agenda1.inserirContato(c3);
		agenda1.inserirContato(c4);
		agenda1.inserirContato(c5);
		agenda1.inserirContato(c6);
		agenda1.inserirContato(c7);
		agenda1.inserirContato(c8);
		agenda1.inserirContato(c9);
		agenda1.inserirContato(c10);

		agenda1.listarContatosAgenda();

	}

}
