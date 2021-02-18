package aula16.interfaces.exemplo;

public class TestaPortaria {

	public static void main(String[] args) {
		Portaria portaria = new Portaria();
		Morador morador = new Morador("Xico bento", "xico@email.com", "555-222-77", 1254, true);
		Visitante visitante = new Visitante("Xico xaviar", "xavier@email.com", "555-222-88", morador);
		Morador moradorNaoPresente = new Morador("Xico bento", "xico@email.com", "555-222-77", 1254, false);
		Visitante visitanteNaoPresente = new Visitante("Xico xaviar", "xavier@email.com", "555-222-88", moradorNaoPresente);
		
//		portaria.autorizaEntrada(morador);
		
		portaria.autorizaEntrada(visitanteNaoPresente);
		
		
	}
	
}
