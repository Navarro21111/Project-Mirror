package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoDB {
	private String driver;
	private String url;
	
	public AccesoDB(String driver, String url) {
		this.driver = driver;
		this.url = url;
	}
	
	public Connection getConexion() 
			throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url);
		System.out.println("Conexión establecida");
		return con;
	}
}
