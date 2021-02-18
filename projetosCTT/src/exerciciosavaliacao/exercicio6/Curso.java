package exerciciosavaliacao.exercicio6;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Curso {

	private String nome;
	private String horario;
	private double media;
	private int totalNotas;
	private Professor professor;
	private double mediaTotal;
	private ArrayList<Aluno> listaDeAlunos;

	String pattern = "###,###.##";
	DecimalFormat decimalFormat = new DecimalFormat(pattern);

	public Curso(String nome, String horario, int totalNotas) {
		this.nome = nome;
		this.horario = horario;
		this.totalNotas = totalNotas;
		this.listaDeAlunos = new ArrayList<>();
	}

	public void inserirAluno(Aluno aluno) {
		this.listaDeAlunos.add(aluno);
	}

	public void calcularMediaAluno(Aluno aluno) {
		media = (aluno.getNota1() + aluno.getNota2() + aluno.getNota3() + aluno.getNota4()) / totalNotas;
		System.out.println("A média do aluno " + aluno.getNome() + " é: " + decimalFormat.format(this.media));
	}

	public void calcularAprovacao(Aluno aluno) {
		if (media >= 7) {
			System.out.println("O aluno " + aluno.getNome() + " está aprovado\n");
		} else
			System.out.println("O aluno " + aluno.getNome() + " está reprovado\n");
	}

	public void calcularMediaTurma() {
		for (Aluno aluno : listaDeAlunos) {
			mediaTotal = this.mediaTotal + aluno.getNota1() + aluno.getNota2() + aluno.getNota3() + aluno.getNota4();
		}

		System.out.println("A média total da turam é: " + decimalFormat.format(this.mediaTotal / this.totalNotas));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
