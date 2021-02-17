package aula17.exercicio;

import java.util.Scanner;

public class Loja {
	
	public void calculaVendasTotaisProduto(Produto produto) {
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Digite a quantidade de vendas: ");
		int quantidadeDeVendas = sc.nextInt();
		
		produto.setQuantidadeDeVendas(quantidadeDeVendas);
		produto.calculaTotalVendas();
		
		sc.close();
		

	}

}
