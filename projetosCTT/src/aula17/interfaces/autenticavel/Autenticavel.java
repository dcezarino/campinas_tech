package aula17.interfaces.autenticavel;

public interface Autenticavel {

	boolean autentica(String usuario, int senha);
	void setSenha(int senha);

}
