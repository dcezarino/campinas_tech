package dao;

import java.util.ArrayList;
import java.util.List;

import model.Contato;

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
	
	public List<Contato> getContatos() {
		return this.contatos;
	}

	public void addContato(Contato contato) {
		this.contatos.add(contato);
	}

	public void removeContato(String nome) {
		Contato contato = this.getContatoByName(nome);
		contatos.remove(contato);
		
	}

	public void alterarContato(String nome,Contato contatoJson) {
		Contato contato = this.getContatoByName(nome);
		int indexContato = this.contatos.indexOf(contato);
		contato.setNome(contatoJson.getNome());
		contato.setEndereco(contatoJson.getEndereco());
		contato.setTelefone(contatoJson.getTelefone());
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


}
