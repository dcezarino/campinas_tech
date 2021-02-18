package aula16.interfaces.exemplo;

public class Visitante extends Pessoa implements Autorizavel  {

	private Morador morador;
	
	public Visitante(String nome, String email, String telefone, Morador morador) {
		super(nome, email, telefone);
		this.morador = morador;
	}

	@Override
	public boolean autoriza(int senha) {
		System.err.println("Debug: " + (senha == this.morador.getSenha()));
		System.err.println("Debug: " + this.morador.isPresente());
		return senha == this.morador.getSenha() && this.morador.isPresente();
	}

}
