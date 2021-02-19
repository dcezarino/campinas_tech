package aula24.nakedbank;

import java.sql.Connection;

import aula24.nakedbank.config.DatabaseConnection;

public class Main {

	public static void main(String[] args) throws Exception {

		// Criando meu objeto de conexao com o banco de dados
		Connection connection = DatabaseConnection.connect();
		connection.setAutoCommit(false);

		Regras regras = new Regras(connection);

		try {
			regras.exibirMenu();
		} finally {
			connection.close();
		}

	}

}

