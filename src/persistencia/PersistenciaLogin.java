package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import model.PojoAlumno;
import model.PojoLogin;

public class PersistenciaLogin {
	private AccesoDB acces;
	
	public PersistenciaLogin() {
		this.acces = new AccesoDB();
	}
	
	public void insertarUsuario(PojoLogin login) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String query = "INSERT INTO Login(Usuario, Contrasenia) VALUES (?,?)";
		
		try {
			
			if (login.getUsuario().equals("") || login.getContrasenia().equals("")) {
				JOptionPane.showMessageDialog(null, "Deben rellenarse todos los campos");
				
			} else {
				con = acces.getConexion();
				ps = con.prepareStatement(query);
				ps.setString(1, login.getUsuario());
				ps.setString(2, login.getContrasenia());
				ps.executeUpdate();
				
				JOptionPane.showMessageDialog(null, "Usuario guardado");
			}
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
	}
	
	public boolean loginCorrecto(PojoLogin login) {
		Connection con = null;
		boolean correcto = false;
		String usuario = "";
		String contrasenia = "";
		
		String query = "SELECT * FROM Login";
		
		try {
			con = acces.getConexion();
			PreparedStatement prst = con.prepareStatement(query);
			ResultSet rset = prst.executeQuery();
	
			while (rset.next()) {
				usuario = rset.getString(1);
				contrasenia = rset.getString(2);
				
				if (usuario.equals(login.getUsuario()) && contrasenia.equals(login.getContrasenia())) {
					correcto = true;
					
				} 
			}
			
			rset.close();
			prst.close();
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
		
		return correcto;
	}
}
