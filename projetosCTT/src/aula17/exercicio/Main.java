package aula17.exercicio;

public class Main {
	
	public static void main(String[] args) {
		
		CD cd1 = new CD("CD modelo 01 ", "00000001", 10.0);
		DVD dvd1 = new DVD("DVD modelo 01 ", "00000002", 80.0);
		Livro livro1 = new Livro("Livro modelo 01 ", "00000003", 200.0);
		Loja loja1 = new Loja();
		
		
        loja1.calculaVendasTotaisProduto(cd1);
        //loja2.calculaVendasTotaisProduto(dvd1);			
        //loja1.calculaVendasTotaisProduto(livro1);
		
	}

}
