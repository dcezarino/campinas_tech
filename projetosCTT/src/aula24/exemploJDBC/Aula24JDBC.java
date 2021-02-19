package aula24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Aula24JDBC {

	private final String url = "jdbc:postgresql://database-1.cvitjixrebr2.us-east-1.rds.amazonaws.com/db_diego";
	private final String user = "diego";
	private final String password = "diego2021!";

	/**
	 * Connect to the PostgreSQL database
	 *
	 * @return a Connection object
	 */
	public Connection connect() throws Exception {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);

			if (conn == null) {
				throw new Exception();
			}

			ClienteDAO clienteDAO = new ClienteDAO();
			int codigoCliente = clienteDAO.criaNovoCliente("Armando da Silva", "12345612345", "8528529", 6000f,
					"1933205858", "armando-silva8596@hotmail.com", conn);

			ContaDAO contaDAO = new ContaDAO();
			String numeroConta = contaDAO.criaNovaConta(codigoCliente, "2000", conn);
			
			System.out.println(numeroConta);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return conn;
	}

	public static void main(String[] args) throws Exception {
		Aula24JDBC app = new Aula24JDBC();
		app.connect();
	}

}
