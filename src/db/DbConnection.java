package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private static Connection con = null;

	public static Connection getConnection() {
		try {
			if (con == null) {
				System.out.println("holaaaaaaaaaa");
				String driver = "com.mysql.jdbc.Driver"; 
				String url = "jdbc:mysql://localhost:3306/clinica";
				String pwd = "fer1597535";
				String usr = "root";
				Class.forName(driver);
				con = DriverManager.getConnection(url, usr, pwd);
				System.out.println("Conectado a la DB");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}
}
