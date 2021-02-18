import java.util.Date;

public class Titulo {

	private Date data;
	private String discurso;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDiscurso() {
		return discurso;
	}

	public void setDiscurso(String discurso) {
		this.discurso = discurso;
	}

	@Override
	public String toString() {
		return "Titulo [data=" + data + ", discurso=" + discurso + "]";
	}
}
