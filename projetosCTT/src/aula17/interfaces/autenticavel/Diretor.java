package aula17.interfaces.autenticavel;

public class Diretor extends Funcionario implements AutenticavelUSuarioSenha {

	@Override
	public boolean autentica(String usuario, int senha) {
		return this.getUsuario().equals(usuario) && this.getSenha() == senha;
	}
	
	@Override
	public void setUsuario(String usuario) {
		this.usuario = "senhor"+usuario;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
