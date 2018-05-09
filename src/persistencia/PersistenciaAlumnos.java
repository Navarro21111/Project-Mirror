package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import model.PojoAlumno;
import view.VModificarAlumnos;

public class PersistenciaAlumnos {
	private AccesoDB acces;
	
	public PersistenciaAlumnos() {
		this.acces = new AccesoDB();
	}

	public void insertarAlumnos(PojoAlumno alumno) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String query = "INSERT INTO Alumnos(NumExpediente, Nombre, Apellido1, Apellido2) VALUES (?,?,?,?)";
		
		try {
		
			con = acces.getConexion();
			ps = con.prepareStatement(query);
			ps.setInt(1, alumno.getnExp());
			ps.setString(2, alumno.getNombre());
			ps.setString(3, alumno.getApellido1());
			ps.setString(4, alumno.getApellido2());
			
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Alumno guardado");
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
	}
	
	public DefaultListModel<PojoAlumno> mostrarAlumnos() {
		PojoAlumno aux;
		Connection con = null;
		DefaultListModel<PojoAlumno> listAlum = new DefaultListModel<>();
		
		String query = "SELECT * FROM Alumnos";
		
		try {
			
			con = acces.getConexion();
			PreparedStatement prst = con.prepareStatement(query);
			ResultSet rset = prst.executeQuery();
			
			while (rset.next()) {
				aux = new PojoAlumno(rset.getInt("NumExpediente"), rset.getString("Nombre"), rset.getString("Apellido1"), rset.getString("Apellido2"));
				listAlum.addElement(aux);

			}
			
			rset.close();
			prst.close();
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
		
		return listAlum;
	}
	
	public void eliminarAlumnos(PojoAlumno alumno) {
		
		Connection con = null;
		
		
		try {
			
			con = acces.getConexion();
			String query = "DELETE FROM Alumnos WHERE NumExpediente = ?";
			        
			PreparedStatement prest = con.prepareStatement(query);
			prest.setInt(1, alumno.getnExp());
			prest.execute();
			
			JOptionPane.showMessageDialog(null, "Alumno eliminado");
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
	}
	
	public void actualizarDatos(PojoAlumno alumno) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String query = "UPDATE ALUMNOS SET NumExpediente = ?, Nombre = ?, Apellido1 = ?, Apellido2 = ?";
		
		try {
			
			con = acces.getConexion();
			ps = con.prepareStatement(query);
			ps.setInt(1, alumno.getnExp());
			ps.setString(2, alumno.getNombre());
			ps.setString(3, alumno.getApellido1());
			ps.setString(4, alumno.getApellido2());
			ps.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Alumno actualizado");
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
	}
}
