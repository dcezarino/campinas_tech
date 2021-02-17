package aula15.abstrata.alternativa;

public class TestaEmpresa {

	public static void main(String[] args) {
		Funcionario desinger = new Designer();
		Funcionario programador = new Programador();
		Funcionario gerente = new Gerente();
		
		desinger.gravar("Xico bento", 25, "xico@bento.com");
		programador.gravar("Senhor biscoito", 18, "senhor");
		gerente.gravar("Xico da balada", 50, "xico@balada.com");
		
		desinger.salario = 2500;
		programador.salario = 5000;
		gerente.salario = 10000;
		
		desinger.imprimePessoa();
		programador.imprimePessoa();
		gerente.imprimePessoa();
		
		desinger.pagarSalario();
		programador.pagarSalario();
		gerente.pagarSalario();
		
		desinger.reajustar();
		programador.reajustar();
		gerente.reajustar();
		
		desinger.pagarSalario();
		programador.pagarSalario();
		gerente.pagarSalario();
		
		programador = new Gerente();
		
		programador.salario = 75000;
		programador.nome = "Xico da balada";
		
		desinger.pagarSalario();
		programador.pagarSalario();
		gerente.pagarSalario();
		
	}
}
