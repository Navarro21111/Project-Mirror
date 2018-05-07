package persistencia;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.CommunicationException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import model.PojoAlumno;
import view.VConsultarAlumnos;

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
	
	public DefaultListModel<String> mostrarAlumnos() {
		
		Connection con = null;
		DefaultListModel<String> listAlum = new DefaultListModel<>();
		
		String query = "SELECT * FROM Alumnos";
		
		try {
			
			con = acces.getConexion();
			PreparedStatement prst = con.prepareStatement(query);
			ResultSet rset = prst.executeQuery();
			
			while (rset.next()) {
				
				listAlum.addElement("Expediente: " + rset.getInt("NumExpediente") + " Nombre: " + rset.getString("Nombre") 
				+ " " + rset.getString("Apellido1") + " " + rset.getString("Apellido2"));

			}
			
			rset.close();
			prst.close();
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
		
		return listAlum;
	}
	
	public void eliminarAlumnos() {
		
		Connection con = null;
		VConsultarAlumnos consAlum = new VConsultarAlumnos();
		
		
		String query = "SELECT * FROM Alumnos";
		
		
		try {
			
			con = acces.getConexion();
			PreparedStatement prst = con.prepareStatement(query);
			ResultSet rset = prst.executeQuery();
			
			while (rset.next()) {
				
				if (consAlum.getJListAlum().getSelectedValue().equals(obj)) {
					
				}
				
			}
			
			
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
	}
}
