package aula17.interfaces.autenticavel;

public class Cliente implements AutenticavelEmail  {
	
	private String email;
	private int senha;
	
	@Override
	public boolean autentica(String usuario, int senha) {
		return this.email.equals(usuario) && this.senha == senha;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	

}
