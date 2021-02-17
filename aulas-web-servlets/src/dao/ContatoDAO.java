package dao;

import java.util.ArrayList;
import java.util.List;

import model.Contato;
import model.Endereco;
import model.Telefone;

public class ContatoDAO {

	private static ContatoDAO instancia;
	private List<Contato> contatos;

	private ContatoDAO() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		this.contatos = new ArrayList<>();
	}

	public static ContatoDAO getConexao() {
		if (instancia == null) {
			instancia = new ContatoDAO();
		}
		return instancia;
	}

	public void addContato(String nome, Endereco end, Telefone tel) {
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setEndereco(end);
		contato.setTelefone(tel);
		this.contatos.add(contato);
	}

	public void removeContato(String nome) {
		this.getContatoByName(nome);
		contatos.removeIf(c -> c.getNome() == nome);
	}

	public void alterarContato(String nome) {
		Contato contato = this.getContatoByName(nome);
		int indexContato = this.contatos.indexOf(contato);
		contato.setNome(nome);
		this.contatos.set(indexContato, contato);
	}

	public void alterarContato(Endereco end) {
		Contato contato = this.getContatoByEndereco(end);
		int indexContato = this.contatos.indexOf(contato);
		contato.setEndereco(end);
		this.contatos.set(indexContato, contato);
	}

	public void alterarContato(Telefone tel) {
		Contato contato = this.getContatoByTelefone(tel);
		int indexContato = this.contatos.indexOf(contato);
		contato.setTelefone(tel);
		this.contatos.set(indexContato, contato);
	}

	public Contato getContatoByName(String nome) {
		int indexContato = 0;
		for (Contato contato : contatos) {
			if (nome.equals(contato.getNome())) {
				indexContato = contatos.indexOf(contato);
			}
		}
		return contatos.get(indexContato);
	}

	public Contato getContatoByTelefone(Telefone telefone) {
		int indexContato = 0;
		for (Contato contato : contatos) {
			if (telefone.equals(contato.getTelefone())) {
				indexContato = contatos.indexOf(contato);
			}
		}
		return contatos.get(indexContato);
	}

	public Contato getContatoByEndereco(Endereco endereco) {
		int indexContato = 0;
		for (Contato contato : contatos) {
			if (endereco.equals(contato.getEndereco())) {
				indexContato = contatos.indexOf(contato);
			}
		}
		return contatos.get(indexContato);
	}

}
