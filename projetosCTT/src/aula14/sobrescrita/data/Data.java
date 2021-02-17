package aula14.sobrescrita.data;

import java.time.LocalDate;

public class Data {

	private String data;

	public Data() {
		this(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());
	}

	public Data(int dia) {
		this(dia, LocalDate.now().getMonthValue(), LocalDate.now().getYear());
	}

	public Data(int dia, int mes) {
		this(dia, mes, LocalDate.now().getYear());
	}

	public Data(int dia, int mes, int ano) {
		this.data = dia + "/" + mes + "/" + ano;
	}

	public String getData() {
		return data;
	}

}
