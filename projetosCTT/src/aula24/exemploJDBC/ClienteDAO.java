package aula24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClienteDAO {

	public int criaNovoCliente(String nome, String cpf, String rg, Float renda, String telefone, String email,
			Connection conn) throws Exception {
		String query = "insert into contas.tb_cliente (nome, cpf, rg, renda, telefone, email) values (?, ?, ?, ?, ?, ?);";

		PreparedStatement insertCliente = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
		insertCliente.setString(1, nome);
		insertCliente.setString(2, cpf);
		insertCliente.setString(3, rg);
		insertCliente.setFloat(4, renda);
		insertCliente.setString(5, telefone);
		insertCliente.setString(6, email);

		insertCliente.executeUpdate();

		ResultSet rsCodigo = insertCliente.getGeneratedKeys();

		if (rsCodigo.next()) {
			int id = rsCodigo.getInt("codigo");
			return id;
		}

		throw new Exception("Erro ao criar um novo cliente");

	}

}
