package aula11.composicao.exercicio2;

public class TestaTelevisao {
	
	public static void main(String[] args) {
		
		Televisao samsung = new Televisao();
		Televisao lg = new Televisao();
		Controle controle = new Controle();
		
		controle.setTelevisao(samsung);
		
		controle.getTelevisao().aumentarVolume();
		controle.getTelevisao().aumentarVolume();
		
		controle.getTelevisao().aumentarCanal();
		controle.getTelevisao().aumentarCanal();
		
		System.out.println("Volume da TV Samsung: " + controle.getTelevisao().getVolume());
		System.out.println("Volume da TV Samsung: " + controle.getTelevisao().getCanal());
		
		

		
		
	}

}
