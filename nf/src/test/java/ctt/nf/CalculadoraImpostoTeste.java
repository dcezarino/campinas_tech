package ctt.nf;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

public class CalculadoraImpostoTeste {

	public double calculaImposto(String servico, double valorFatura) {

		Fatura fatura = new Fatura();
		fatura.setTipoServico(servico);
		fatura.setValor(valorFatura);

		CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
		return calculadoraImposto.calculaImposto(fatura);
	}

	@Test
	public void deveCalcularImpostoConsultoriaVinteCincoPorcento() {
		double valorImpostoCalculado = this.calculaImposto("CONSULTORIA", 3000.0);
		assertThat(valorImpostoCalculado, is(750.0));
	}

	@Test
	public void deveCalcularImpostoTreinamentoQuizePorcento() {
		double valorImpostoCalculado = this.calculaImposto("TREINAMENTO", 3000.0);
		assertThat(valorImpostoCalculado, is(450.0));

	}

	@Test
	public void deveCalcularImpostoOutrosSeisPorcento() {
		double valorImpostoCalculado = this.calculaImposto("OUTROS", 3000.0);
		assertThat(valorImpostoCalculado, is(180.0));

	}
}
