package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.sqlite.SQLiteConfig;

public class AccesoDB {
	private String driver;
	private String url;
	
	public AccesoDB() {
		this.driver = "org.sqlite.JDBC";
		this.url = "jdbc:sqlite:src//persistencia//BDProjectMirror.db";
	}
	
	public Connection getConexion() 
			throws ClassNotFoundException, SQLException {
		SQLiteConfig config = new SQLiteConfig();
		config.enforceForeignKeys(true);
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, config.toProperties());
		System.out.println("Conexión establecida");
		return con;
	}
}
