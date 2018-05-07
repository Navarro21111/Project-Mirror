package persistencia;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import model.PojoCiclo;
import view.VConsultarAlumnos;

public class PersistenciaCiclos {
	private AccesoDB acces;
	
	public PersistenciaCiclos() {
		this.acces = new AccesoDB();
	}
	
	public void insertarCiclos(PojoCiclo ciclo) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String query = "INSERT INTO Ciclos(Nombre, Descripcion) VALUES (?,?)";
		
		try {
		
			con = acces.getConexion();
			ps = con.prepareStatement(query);
			ps.setString(1, ciclo.getNombre());
			ps.setString(2, ciclo.getDescripcion());
			
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Ciclo guardado");
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
	}
	
	public DefaultListModel<String> mostrarCiclos() {
		
		Connection con = null;
		DefaultListModel<String> listCiclos = new DefaultListModel<>();
		
		String query = "SELECT * FROM Ciclos";
		
		try {
			
			con = acces.getConexion();
			PreparedStatement prst = con.prepareStatement(query);
			ResultSet rset = prst.executeQuery();
			
			while (rset.next()) {
				
				listCiclos.addElement("Nombre: " + rset.getInt("Nombre") + " Descripción: " + rset.getString("Descripcion"));
			}
			
			rset.close();
			prst.close();
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}	
		
		return listCiclos;
	}
}
