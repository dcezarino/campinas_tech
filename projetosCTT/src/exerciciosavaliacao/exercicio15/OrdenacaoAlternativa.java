package exerciciosavaliacao.exercicio15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OrdenacaoAlternativa {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Digite os números separados por ;");

		String numeros = in.next();

		String[] numerosArray = numeros.split(";");

		List<String> numerosLista = Arrays.asList(numerosArray);

		List<Integer> numerosListaInteger = new ArrayList<Integer>();

		for (String numeroStr : numerosLista) {
			numerosListaInteger.add(Integer.valueOf(numeroStr));
		}

		in.close();		
		

		int resultado[] = new int[numerosListaInteger.size()];
		
		for (int i = 0; i < numerosListaInteger.size(); i++) {
			resultado[i] = numerosListaInteger.get(i);
		}

		int posicaoMenorNumero = 0;
		int tamanho = resultado.length;

		int i = 0;
		while (i < tamanho) {
			for (int j = i + 1; j < resultado.length; j++) {
				if (resultado[j] < resultado[posicaoMenorNumero]) {
					posicaoMenorNumero = j;
				}

			}
			int aux = resultado[i];
			resultado[i] = resultado[posicaoMenorNumero];
			resultado[posicaoMenorNumero] = aux;

			i++;
			posicaoMenorNumero = i;

		}

		System.out.println(Arrays.toString(resultado));

	}

}
