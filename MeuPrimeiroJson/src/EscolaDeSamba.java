import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EscolaDeSamba {
		
	private String nome;
	private String nomeMestreSala;
	private String portaBandeira;
	private Date dataFundacao;
	private List<Titulo> titulos = new ArrayList<Titulo>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeMestreSala() {
		return nomeMestreSala;
	}

	public void setNomeMestreSala(String nomeMestreSala) {
		this.nomeMestreSala = nomeMestreSala;
	}

	public String getPortaBandeira() {
		return portaBandeira;
	}

	public void setPortaBandeira(String portaBandeira) {
		this.portaBandeira = portaBandeira;
	}

	public Date getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public List<Titulo> getTitulos() {
		return titulos;
	}

	public void setTitulos(List<Titulo> titulos) {
		this.titulos = titulos;
	}

	@Override
	public String toString() {
		return "EscolaDeSamba [nome=" + nome + ", nomeMestreSala=" + nomeMestreSala + ", portaBandeira=" + portaBandeira
				+ ", dataFundacao=" + dataFundacao + ", titulos=" + titulos + "]";
	}

	

//	@Override
//	public String toString() {
//		return "{\"[nome\":" + nome + "}";
//	}

}
