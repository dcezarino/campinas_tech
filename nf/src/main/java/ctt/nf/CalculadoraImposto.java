package ctt.nf;

public class CalculadoraImposto {

	private final double PORCENTAGEM_IMPOSTO_CONSULTORIA = 0.25;
	private final double PORCENTAGEM_IMPOSTO_TREINAMENTO = 0.15;	
	private final double PORCENTAGEM_IMPOSTO_OUTROS = 0.06;	
	
	
	public double calculaImposto (Fatura fatura) {
		
		switch (fatura.getTipoServico()) {
		case "CONSULTORIA":
			return fatura.getValor()*PORCENTAGEM_IMPOSTO_CONSULTORIA;
			
		case "TREINAMENTO":
			return fatura.getValor()*PORCENTAGEM_IMPOSTO_TREINAMENTO;
			
		default:
			return fatura.getValor()*PORCENTAGEM_IMPOSTO_OUTROS;
		}
	}
}
