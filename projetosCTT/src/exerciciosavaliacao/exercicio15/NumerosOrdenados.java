package exerciciosavaliacao.exercicio15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumerosOrdenados {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.printf("Digite os números separados por vírgula: ");
		String numeros = entrada.next();

		String[] numerosArray = numeros.split(";");

		List<String> numerosLista = Arrays.asList(numerosArray);
		
		List<Integer> numerosListaInteger = new ArrayList<Integer>();

		for (String numeroStr : numerosLista) {
			numerosListaInteger.add(Integer.valueOf(numeroStr));
		}

		Collections.sort(numerosListaInteger);
		
		System.out.println(numerosListaInteger);		

		entrada.close();
	}

}
