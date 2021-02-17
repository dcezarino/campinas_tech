package aula17.interfaces.autenticavel;

public abstract class Funcionario {

	protected String nome;
	protected String email;
	
	protected String usuario;
	protected int senha;
	

	public String getUsuario() {
		return usuario;
	}

	public int getSenha() {
		return senha;
	}

	
	
}
