import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MeuPrimeiroJson {

	// Esta classe é responsável em transformar um modelo em JSOn
	// Classe Modelo que representa um modelo de dados (Mundo Real a nível de
	// modelagem, ex.: carro, casa, pessoa)

	public static void main(String[] args) {

		EscolaDeSamba escolaDeSamba = new EscolaDeSamba();
		escolaDeSamba.setNome("Vai vai");
		escolaDeSamba.setNomeMestreSala("Neno");
		escolaDeSamba.setPortaBandeira("Clélia");
		escolaDeSamba.setDataFundacao(new Date());

		Titulo titulo1 = new Titulo();
		titulo1.setDiscurso("Ganhamos primeira vez, nem da pra creditar");
		titulo1.setData(new Date());

		escolaDeSamba.getTitulos().add(titulo1);

		// System.out.println(escolaDeSamba);

		// Preciso fazer para conseguir utilizar a biblioteca GSON
		GsonBuilder builder = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
		Gson gson = builder.create();
		//

		String jsonOutput = gson.toJson(escolaDeSamba);

		System.out.println(jsonOutput);

		String jsonInput = "{\"nome\":\"Gaviões da Fiel\",\"nomeMestreSala\":\"Wagner Lima\",\"portaBandeira\":\"Gabriela Mondjian\",\"dataFundacao\":\"1969-07-01T00:00:00-03\",\"titulos\":[{\"data\":\"1970-04-01T00:00:00-03\",\"discurso\":\"Ganhamos primeira vez, nem da pra creditar\"},{\"data\":\"1980-04-01T00:00:00-03\",\"discurso\":\"Ganhamos segunda vez, melhor que futebol\"}]}";

		EscolaDeSamba escolaDeSambaFromJson = gson.fromJson(jsonInput, EscolaDeSamba.class);

		System.out.println(escolaDeSambaFromJson);

	}

}
