package aula24.nakedbank.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static final String url = "jdbc:postgresql://database-1.cvitjixrebr2.us-east-1.rds.amazonaws.com/db_diego";
	private static final String user = "diego";
	private static final String password = "diego2021!";

	/**
	 * Connect to the PostgreSQL database
	 *
	 * @return a Connection object
	 */
	public static Connection connect() throws Exception {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);

			if (conn == null) {
				throw new Exception();
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return conn;
	}

}