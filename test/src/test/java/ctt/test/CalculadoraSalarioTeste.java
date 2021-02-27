package ctt.test;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.core.Is.is;

public class CalculadoraSalarioTeste {

	private double calculaSalarioLiquido(String cargo, double salarioBase) {
		Funcionario funcionario = new Funcionario();
		funcionario.setCargo(cargo);
		funcionario.setSalarioBase(salarioBase);
		CalculadoraSalario calculadora = new CalculadoraSalario();
		return calculadora.calculaSalario(funcionario);
	}

	@Test
	public void deveDescontarVintePorcentoDoSalarioDesenvolvedorMaiorIgualTresMil() {
		double salarioLiquido = this.calculaSalarioLiquido("DESENVOLVEDOR", 3000.0);
		assertThat(salarioLiquido, is(2400.0));
	}

	@Test
	public void deveDescontarDezPorcentoDoSalarioDesenvolvedorMenorTresMil() {
		double salarioLiquido = this.calculaSalarioLiquido("DESENVOLVEDOR", 2000.0);
		assertThat(salarioLiquido, is(1800.0));
	}

	@Test
	public void deveDescontarVinteCincoPorcentoDoSalarioDBAMaiorIgualDoisMil() {
		double salarioLiquido = this.calculaSalarioLiquido("DBA", 3000.0);
		assertThat(salarioLiquido, is(2250.0));
	}

	@Test
	public void deveDescontarQuinzePorcentoDoSalarioDBAMenorDoisMil() {
		double salarioLiquido = this.calculaSalarioLiquido("DBA", 1500.0);
		assertThat(salarioLiquido, is(1275.0));
	}

	@Test
	public void deveDescontarVinteCincoPorcentoDoSalarioTestadorMaiorIgualDoisMil() {
		double salarioLiquido = this.calculaSalarioLiquido("TESTADOR", 3000.0);
		assertThat(salarioLiquido, is(2250.0));
	}

	@Test
	public void deveDescontarQuinzePorcentoDoSalarioTestadorMenorDoisMil() {
		double salarioLiquido = this.calculaSalarioLiquido("TESTADOR", 1500.0);
		assertThat(salarioLiquido, is(1275.0));
	}

	@Test
	public void deveDescontarTrintaPorcentoDoSalarioGerenteMaiorIgualCincoMil() {
		double salarioLiquido = this.calculaSalarioLiquido("GERENTE", 6500.0);
		assertThat(salarioLiquido, is(4550.0));
	}

	@Test
	public void deveDescontarVintePorcentoDoSalarioGerenteMenorCincoMil() {
		double salarioLiquido = this.calculaSalarioLiquido("GERENTE", 4500.0);
		assertThat(salarioLiquido, is(3600.0));
	}

}

