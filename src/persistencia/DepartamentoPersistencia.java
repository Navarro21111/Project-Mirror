package persistencia;

public class DepartamentoPersistencia {
	
	private AccesoDB accesoDB;
	
	public DepartamentoPersistencia() {
		accesoDB = new AccesoDB("org.sqlite.JDBC", "jdbc:sqlite:src//persistencia//BDProjectMirror.db");
	}

}
