package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import model.PojoAlumno;
import model.PojoProyecto;
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
			
			/*if (alumno.getnExp()) {
				JOptionPane.showMessageDialog(null, "El campo Nº Exepediente debe ser un número");
			} else {*/
				con = acces.getConexion();
				ps = con.prepareStatement(query);
				ps.setInt(1, alumno.getnExp());
				ps.setString(2, alumno.getNombre());
				ps.setString(3, alumno.getApellido1());
				ps.setString(4, alumno.getApellido2());
				
				ps.executeUpdate();
				JOptionPane.showMessageDialog(null, "Alumno guardado");
			//b}
			
			
			
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
				aux = new PojoAlumno(rset.getInt("ID"), rset.getInt("NumExpediente"), rset.getString("Nombre"), rset.getString("Apellido1"), rset.getString("Apellido2"));
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
		PreparedStatement prest = null;
		Connection con = null;
		ResultSet rset = null;
		int aux = 0;
		
		String query = "SELECT ID FROM Alumnos WHERE numExpediente = ?";
		try {
			
			con = acces.getConexion();
			prest = con.prepareStatement(query);
			prest.setInt(1, alumno.getnExp());
			rset = prest.executeQuery();
			
			while (rset.next()) {
				aux = rset.getInt(1);
			}
			
			if (prest != null) {
				prest.close();
			}
			
			
			query = "DELETE FROM Alumnos WHERE numExpediente = ?";
			con = acces.getConexion();        
			prest = con.prepareStatement(query);
			prest.setInt(1, alumno.getnExp());
			prest.execute();
			
			if (prest != null) {
				prest.close();
			}
			
			query = "DELETE FROM Pertenecen Where Alumno = ?";
			prest = con.prepareStatement(query);
			prest.setInt(1, aux);
			prest.execute();
			
			JOptionPane.showMessageDialog(null, "Alumno eliminado");
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
	}
	
	public void actualizarDatos(PojoAlumno alumno, PojoAlumno alumno2) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String query = "UPDATE Alumnos SET NumExpediente = ?, Nombre = ?, Apellido1 = ?, Apellido2 = ? WHERE numExpediente = ?";
		
		try {
			con = acces.getConexion();
			ps = con.prepareStatement(query);
			ps.setInt(1, alumno.getnExp());
			ps.setString(2, alumno.getNombre());
			ps.setString(3, alumno.getApellido1());
			ps.setString(4, alumno.getApellido2());
			ps.setInt(5, alumno2.getnExp());
			ps.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Alumno actualizado");
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
	}
	
	public DefaultListModel<PojoAlumno> ArrayAlumnos() {
		PojoAlumno aux;
		Connection con = null;
		DefaultListModel<PojoAlumno > listAlum = new DefaultListModel<>();
		
		String query = "SELECT * FROM Alumnos";
		
		try {
			
			con = acces.getConexion();
			PreparedStatement prst = con.prepareStatement(query);
			ResultSet rset = prst.executeQuery();
			
			while (rset.next()) {
				aux = new PojoAlumno(rset.getInt("ID"), rset.getInt("NumExpediente"), rset.getString("Nombre"), rset.getString("Apellido1"), rset.getString("Apellido2"));
				listAlum.addElement(aux);

			}
			
			rset.close();
			prst.close();
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
		
		return listAlum;
	}
	
	public DefaultListModel<PojoAlumno> mostrarAlumnosEnProyecto(DefaultListModel<PojoAlumno> modeli) {
		PojoAlumno aux;
		boolean esta = false;
		Connection con = null;
		DefaultListModel<PojoAlumno> listAlum = new DefaultListModel<>();
		
		String query = "SELECT * FROM Alumnos";
		
		try {
			
			con = acces.getConexion();
			PreparedStatement prst = con.prepareStatement(query);
			ResultSet rset = prst.executeQuery();
			
			while (rset.next()) {
				aux = new PojoAlumno(rset.getInt("ID"), rset.getInt("NumExpediente"), rset.getString("Nombre"), rset.getString("Apellido1"), rset.getString("Apellido2"));
				
				for (int i = 0; i < modeli.size(); i++) {
					if (modeli.get(i) == aux) {
						esta = true;
					}
				}
				
				if (esta == false) {
					listAlum.addElement(aux);
				}
			}
			
			rset.close();
			prst.close();
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
		
		return listAlum;
	}
}
