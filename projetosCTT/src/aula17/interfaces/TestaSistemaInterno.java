package aula17.interfaces;

public class TestaSistemaInterno {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Diretor diretor = new Diretor();
		Gerente gerente = new Gerente();
		Engenheiro eng = new Engenheiro();
		Secretaria sec = new Secretaria();
		SistemaInterno si = new SistemaInterno();
		
		diretor.setSenha(123);
		diretor.setUsuario("senhorbigodes");
		
		gerente.setSenha(152);
		gerente.setUsuario("senhorxico");
		
		cliente.setSenha(188);
		cliente.setUsuario("senhorcliente");
		
		si.login(cliente);
		
		
	}
}
