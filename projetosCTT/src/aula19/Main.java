package aula19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		// Lista
		System.out.println("Lista");

		List<Integer> lista = new ArrayList<>();

		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);

		for (Integer integer : lista) {
			System.out.println(integer);
		}

		System.out.println("Set - Não deixa inserir elementos repetidos e exibe a lista não ordenada");

		Set<Integer> listaSemRepeticoes = new HashSet<Integer>();

		listaSemRepeticoes.add(1);
		listaSemRepeticoes.add(2);
		listaSemRepeticoes.add(3);
		listaSemRepeticoes.add(4);
		listaSemRepeticoes.add(5);
		listaSemRepeticoes.add(1);

		// Set com objeto próprio
		System.out.println("Set Objeto Próprio");

		for (Integer integer : listaSemRepeticoes) {
			System.out.println(integer);

		}

		// Hash e equals para comparar os itens adicionados na lista.
		Set<Pessoa> listaPessoaSemRepeticao = new HashSet<Pessoa>();
		Pessoa pessoa1 = new Pessoa("Pessoa 01", "000.000.000.00");
		Pessoa pessoa2 = new Pessoa("Pessoa 01", "000.000.000.00");
		Pessoa pessoa3 = new Pessoa("Pessoa 03", "000.000.000.00");

		listaPessoaSemRepeticao.add(pessoa1);
		listaPessoaSemRepeticao.add(pessoa2);
		listaPessoaSemRepeticao.add(pessoa3);

		for (Pessoa pessoa : listaPessoaSemRepeticao) {
			System.out.println(pessoa);

		}

		// MAP / HASHMAP
		// CHAVE / ID
		// VALOR, 1000

		// CHAVE DATA DA TRANSACAO DO EXTRATO
		// VALOR, VALOR DA TRANSACAO

		System.out.println("Mapa");

		Map<Integer, String> meuMapa = new HashMap<Integer, String>();
		meuMapa.put(1, "Put 01");
		meuMapa.put(2, "Put 02");
		meuMapa.put(3, "Put 03");
		meuMapa.put(4, "Put 04");
		meuMapa.put(5, "Put 01");
		meuMapa.put(5, "Teste");

		for (String valor : meuMapa.values()) {
			System.out.println(valor);
		}

		for (Integer chave : meuMapa.keySet()) {
			System.out.println(chave);
		}
        
		System.out.println("Printando chave e valor modo 1");
		for (Entry<Integer, String> chaveValor : meuMapa.entrySet()) {
			System.out.println("Chave: " + chaveValor.getKey() + " Valor: " + chaveValor.getValue());
		}
		
		System.out.println("Printando chave e valor modo 2");
		for (Integer chave : meuMapa.keySet()) {
			String valor = meuMapa.get(chave);
			System.out.println("Chave: " + chave + " Valor: " + valor);
		}

		System.out.println("Printando chave e valor com lambda");
		meuMapa.forEach((k, v) -> {
			System.out.println("Chave: " + k + " Valor: " + v);
		});
		
		
		// Wrappers
		int i = 0;		

		Integer in = 0;
		
		System.out.println(Integer.MAX_VALUE);
		
		int a = 1;
		long b = 2;
		double c = 3.0;
		float d = 3.0f;
		
		Integer aa = 1;
		Long bb = 2L;
		Double cc = 3.0;
		Float dd = 3.0f;	
		

	}

}
