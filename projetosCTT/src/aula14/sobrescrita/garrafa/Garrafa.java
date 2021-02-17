package aula14.sobrescrita.garrafa;

public class Garrafa {
	
	private double capacidadeLitros;
	
	public void encher(int milimetros) {		
		this.capacidadeLitros =   (milimetros / 1000);
	}
	public void encher(double litros) {
		this.capacidadeLitros = litros;
	}
	public void encher(String milimetros) {
		float milimetrosFloat = Float.parseFloat(milimetros);
		this.capacidadeLitros = milimetrosFloat / 1000;
	}
	public double getCapacidadeLitros() {
		return capacidadeLitros;
	}

}
