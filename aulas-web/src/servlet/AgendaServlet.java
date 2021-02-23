package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ContatoDAO;
import model.Contato;
import util.JsonMapper;

@WebServlet("/agenda")
public class AgendaServlet extends HttpServlet {

	private static final JsonMapper MAPPER = JsonMapper.getInstancia();
	private static final ContatoDAO DAO = ContatoDAO.getConexao();
	private static final long serialVersionUID = -1416497597020618324L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Contato contatoJson = MAPPER.getAsJson(req, Contato.class);
		DAO.addContato(contatoJson);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		if (nome != null) {
			Contato contato = DAO.getContatoByName(nome);
			MAPPER.sendAsJson(resp, contato);
			return;			
		}

		List<Contato> contatos = DAO.getContatos();
		MAPPER.sendAsJson(resp, contatos);
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Contato contatoJson = MAPPER.getAsJson(req, Contato.class);
		String nome = req.getParameter("nome");
		DAO.alterarContato(nome, contatoJson);
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		DAO.removeContato(nome);
	}

}
