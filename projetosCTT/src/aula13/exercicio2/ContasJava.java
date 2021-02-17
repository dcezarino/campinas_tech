package aula13.exercicio2;

public class ContasJava {

	public static void main(String[] args) {
		
		
		System.out.println("Conta Poupança");
		ContaPoupanca cp = new ContaPoupanca("Romário Goleada", 227080, 500, 0);
				
		System.out.println("Cliente: " + cp.getCliente());
		System.out.println("Número Conta: " + cp.getNumConta());
		System.out.println("Saldo: " + cp.getSaldo());
		
		cp.sacar(100);
		System.out.println("Saldo: " + cp.getSaldo());
		
		cp.depositar(1000);
		System.out.println("Saldo: " + cp.getSaldo());
		
		cp.setDiaRendimento(30);
		cp.calcularNovoSaldo();
		System.out.println("Novo Saldo Calculado: " + cp.getSaldo());
		
		System.out.println();
		
		System.out.println("Conta Especial");
		ContaEspecial ce = new ContaEspecial("Fernando Tecnol", 227089, 1000, 1000);
				
		System.out.println("Cliente: " + ce.getCliente());
		System.out.println("Número Conta: " + ce.getNumConta());
		System.out.println("Saldo: " + ce.getSaldo());
		
		ce.sacar(1000);
		System.out.println("Saldo: " + ce.getSaldo());
		
		ce.depositar(1000);
		System.out.println("Saldo: " + ce.getSaldo());		
		
		
	}

}
