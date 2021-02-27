package ctt.nf;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

public class CalculadoraImpostoTeste {

	@Test
	public void deveCalcularImpostoConsultoriaVinteCincoPorcento() {
		
		Fatura fatura = new Fatura();
		fatura.setTipoServico("CONSULTORIA");
		fatura.setValor(3000.0);
		
		CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
		double valorImpostoCalculado = calculadoraImposto.calculaImposto(fatura);
		
		assertThat(valorImpostoCalculado, is(750.0));		
	}
	
	@Test
	public void deveCalcularImpostoTreinamentoQuizePorcento() {
		
		Fatura fatura = new Fatura();
		fatura.setTipoServico("TREINAMENTO");
		fatura.setValor(3000.0);
		
		CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
		double valorImpostoCalculado = calculadoraImposto.calculaImposto(fatura);
		
		assertThat(valorImpostoCalculado, is(450.0));		
	
	}
	
	@Test
	public void deveCalcularImpostoOutrosSeisPorcento() {
		
		Fatura fatura = new Fatura();
		fatura.setTipoServico("OUTROS");
		fatura.setValor(3000.0);
		
		CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
		double valorImpostoCalculado = calculadoraImposto.calculaImposto(fatura);
		
		assertThat(valorImpostoCalculado, is(180.0));		
	
	}
}
