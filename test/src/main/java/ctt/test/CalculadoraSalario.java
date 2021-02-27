package ctt.test;

public class CalculadoraSalario {

	private final double BASE_CALCULO_SALARIO_GERENTE = 5000.0;
	private final double BASE_CALCULO_SALARIO_DESENVOLVEDOR = 3000.0;
	private final double BASE_CALCULO_SALARIO_TESTADOR_DBA = 2000.0;
	private final double BASE_MAIOR_SALARIO_PORCENTAGEM_DESCONTO_GERENTE = 0.3;
	private final double BASE_MENOR_SALARIO_PORCENTAGEM_DESCONTO_GERENTE = 0.2;
	private final double BASE_MAIOR_SALARIO_PORCENTAGEM_DESCONTO_DESENVOLVEDOR = 0.2;
	private final double BASE_MENOR_SALARIO_PORCENTAGEM_DESCONTO_DESENVOLVEDOR = 0.1;
	private final double BASE_MAIOR_SALARIO_PORCENTAGEM_DESCONTO_TESTADOR_DBA = 0.25;
	private final double BASE_MENOR_SALARIO_PORCENTAGEM_DESCONTO_TESTADOR_DBA = 0.15;
	private final double CEM_PORCENTO = 1.0;

	public double calculaSalario(Funcionario funcionario) {
		switch (funcionario.getCargo()) {
		case "DESENVOLVEDOR":
			return this.calculaSalarioLiquido(funcionario.getSalarioBase(), BASE_CALCULO_SALARIO_DESENVOLVEDOR,
					BASE_MAIOR_SALARIO_PORCENTAGEM_DESCONTO_DESENVOLVEDOR,
					BASE_MENOR_SALARIO_PORCENTAGEM_DESCONTO_DESENVOLVEDOR);
		case "DBA":
			return this.calculaSalarioLiquido(funcionario.getSalarioBase(), BASE_CALCULO_SALARIO_TESTADOR_DBA,
					BASE_MAIOR_SALARIO_PORCENTAGEM_DESCONTO_TESTADOR_DBA,
					BASE_MENOR_SALARIO_PORCENTAGEM_DESCONTO_TESTADOR_DBA);
		case "TESTADOR":
			return this.calculaSalarioLiquido(funcionario.getSalarioBase(), BASE_CALCULO_SALARIO_TESTADOR_DBA,
					BASE_MAIOR_SALARIO_PORCENTAGEM_DESCONTO_TESTADOR_DBA,
					BASE_MENOR_SALARIO_PORCENTAGEM_DESCONTO_TESTADOR_DBA);
		case "GERENTE":
			return this.calculaSalarioLiquido(funcionario.getSalarioBase(), BASE_CALCULO_SALARIO_GERENTE,
					BASE_MAIOR_SALARIO_PORCENTAGEM_DESCONTO_GERENTE, BASE_MENOR_SALARIO_PORCENTAGEM_DESCONTO_GERENTE);
		default:
			break;
		}

		return 0;
	}

	private double calculaSalarioLiquido(double salarioBase, double baseCalculo, double porcentagemDescontoMaior,
			double porcentagemDescontoMenor) {
		if (salarioBase >= baseCalculo) {
			return salarioBase * (CEM_PORCENTO - porcentagemDescontoMaior);
		}
		return salarioBase * (CEM_PORCENTO - porcentagemDescontoMenor);
	}

}