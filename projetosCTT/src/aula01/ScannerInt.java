package aula01;
import java.util.Scanner;

public class ScannerInt {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Informe um número do tipo inteiro: ");
		int a = in.nextInt();
		System.out.println("Você inseriu um integer de valor  " + a);

	}

}
