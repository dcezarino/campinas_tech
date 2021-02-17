package aula17.interfaces.autenticavel;

public class TestaSistemaInterno {

	public static void main(String[] args) {
		AutenticavelEmail cliente = new Cliente();
		AutenticavelUSuarioSenha diretor = new Diretor();
		AutenticavelUSuarioSenha gerente = new Gerente();
		Engenheiro eng = new Engenheiro();
		Secretaria sec = new Secretaria();
		SistemaInterno si = new SistemaInterno();
		
		diretor.setSenha(123);
		diretor.setUsuario("bigodes");
		
		gerente.setSenha(152);
		gerente.setUsuario("xico");
		
		cliente.setSenha(188);
		cliente.setEmail("cliente@estimado.com");
		
		si.login(cliente);
		
		
	}
}
