package exerciciosavaliacao.exercicio5;

import java.util.ArrayList;

public class Agenda {

	private String nome;
	private ArrayList<Contato> listaDeContatos;

	public Agenda(String nome) {
		this.nome = nome;
		this.listaDeContatos = new ArrayList<>();
	}

	public void inserirContato(Contato contato) {
		this.listaDeContatos.add(contato);
	}

	public void listarContatosAgenda() {
		System.out.println("Informções de: " + this.nome);
		for (Contato contato : listaDeContatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Telefone: " + contato.getTelefone());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
