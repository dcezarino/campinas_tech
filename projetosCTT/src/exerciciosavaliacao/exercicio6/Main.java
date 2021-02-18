package exerciciosavaliacao.exercicio6;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso("Análise de Sistemas", "15:00:00.000", 4);
		Professor professor1 = new Professor("José Carlos", "Aulas", "professor1@professor.com.br");
		Aluno aluno1 = new Aluno("Carlos Baltieri", 00001, 10, 10, 10, 5);
		Aluno aluno2 = new Aluno("Alisson Baltieri", 00002, 10, 8.5, 9, 5.5);
		Aluno aluno3 = new Aluno("Alessandro Baltieri", 00003, 5, 5, 5, 4.5);

		curso1.setProfessor(professor1);
		curso1.inserirAluno(aluno1);
		curso1.calcularMediaAluno(aluno1);
		curso1.calcularAprovacao(aluno1);

		curso1.inserirAluno(aluno2);
		curso1.calcularMediaAluno(aluno2);
		curso1.calcularAprovacao(aluno2);

		curso1.inserirAluno(aluno3);
		curso1.calcularMediaAluno(aluno3);
		curso1.calcularAprovacao(aluno3);

		curso1.calcularMediaTurma();

	}

}
