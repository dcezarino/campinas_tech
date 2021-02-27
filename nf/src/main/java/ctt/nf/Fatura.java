package ctt.nf;

public class Fatura {

	private String nomeCliente;
	private String enderecoCliente;
	private double valor;
	private String tipoServico;
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getTipoServico() {
		return tipoServico;
	}
	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}
	
	
}
