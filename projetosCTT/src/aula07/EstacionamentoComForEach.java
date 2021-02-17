package aula07;

public class EstacionamentoComForEach {
	public static void main(String[] args) {
		
		String[] vagas = new String[15];
		String[] clientes = new String[15];

		for (int indiceVagas = 0; indiceVagas < vagas.length; indiceVagas++) {
			vagas[indiceVagas] = "Vaga Setor Laranja " + (indiceVagas + 1);		
		}
		
		
		for (int indiceClientes = 0; indiceClientes < clientes.length; indiceClientes++) {
			clientes[indiceClientes] = "Cliente " + (indiceClientes + 1);	
			
		}

		for (int indice = 0; indice < clientes.length; indice++) {
			System.out.println("O cliente " + clientes[indice] + " esta em " + vagas[indice]);
		}
		
		
		for (String cliente : clientes) {			
			System.out.println(cliente);
		}
		
		for (String vaga : vagas) {			
			System.out.println(vaga);
		}
		

		
		
	}

}
