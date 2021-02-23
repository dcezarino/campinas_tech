package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


public class JsonMapper {

	private static JsonMapper instancia;

	private Gson gson;

	private JsonMapper() {
		this.gson = new Gson();
	}

	public static JsonMapper getInstancia() {
		if (instancia == null) {
			instancia = new JsonMapper();
		}

		return instancia;
	}

	public void sendAsJson(HttpServletResponse response, Object obj) throws IOException {

		response.setContentType("application/json");

		String res = this.gson.toJson(obj);

		PrintWriter out = response.getWriter();

		out.print(res);
		out.flush();
	}
	
	public <T> T getAsJson(HttpServletRequest request, Class<T> clazz) throws IOException {
		StringBuilder buffer = new StringBuilder();
	    BufferedReader reader = request.getReader();
	    String line;
	    while ((line = reader.readLine()) != null) {
	        buffer.append(line);
	    }
	    
	    String payload = buffer.toString();
	    return (T) this.gson.fromJson(payload, clazz);
	}
	
	
	
}
