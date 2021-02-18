package aula16.interfaces.exemplo;

public class Morador extends Pessoa implements Autorizavel {

	private int senha;
	private boolean presente;
	
	
	public Morador(String nome, String email, String telefone, int senha, boolean presente) {
		super(nome, email, telefone);
		this.senha = senha;
		this.presente = presente;
	}
	
	@Override
	public boolean autoriza(int senha) {
		return this.senha == senha;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean isPresente() {
		return presente;
	}

	public void setPresente(boolean presente) {
		this.presente = presente;
	}

	

}
