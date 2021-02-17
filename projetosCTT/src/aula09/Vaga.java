package aula09;

class Vaga {
	
	/*
	 * Classe é uma representação de um objeto Vagas de supermercado, somenete 1
	 * subsolo dentro do estacionamento do supermercado , 100 vagas elas estão
	 * divididas em 4 setores
	 */
	
	// CTRL + 1 (Quickfix)

	// Atributos
	int identificador;
	String setor;
	boolean ocupada;
	double area;
	String tipo;
	Placa placa;
	
	// Método Construtor
	Vaga(String setor, int identificador){
		this.setor = setor;
		this.identificador = identificador;
		System.out.println("Oi estou criando uma vaga no setor " + setor + " com ID " + identificador);
	}
	
	// Métodos
	// void
	// String, int, float, boolean
	boolean estaOcupada() {
		return ocupada;
	}	
	
	void ocupar(Placa placa) {
		this.placa = placa;
		this.ocupada = true;
	}
	
	void darBiscoito() {
		System.out.println("Toma um biscoito");
	}


}
