package aula17.interfaces;

public class Cliente  {

	private String usuario;
	private int senha;
	
	public boolean autentica(String usuario, int senha) {
		return this.usuario.equals(usuario) && this.senha == senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}
