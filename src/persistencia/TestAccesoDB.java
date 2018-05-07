package persistencia;

import java.sql.SQLException;

public class TestAccesoDB {

	public static void main(String[] args) {
		String driver = "org.sqlite.JDBC";
		String url = "jdbc:sqlite:src//persistencia//BDProjectMirror.db";
		AccesoDB adb = new AccesoDB();
		try {
			adb.getConexion();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("No se ha podido establecer la conexión con la DB");
		}

	}

}
