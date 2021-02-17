package aula13.exercicio2;

public class ContaEspecial extends ContaBancaria {

	private float limite;
	
	public ContaEspecial(String cliente, int numConta, float saldo, float limite) {
		super(cliente, numConta, saldo);
		this.limite = limite;
	}

	
	// Verificar como fazer
	//@Override
//	public void sacar(float valor) {
//		if (( ))
//			System.out.println("Saque não será efetuado, saldo está no limite estipulado a R$ " + "-" + limite);
//		else {
//			this.saldo = this.saldo - valor;
//		}
//
//	}
	


}
