package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


import model.PojoCiclo;


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
	
	public DefaultListModel<PojoCiclo> mostrarCiclos() {
		PojoCiclo aux;
		Connection con = null;
		DefaultListModel<PojoCiclo> listCiclos = new DefaultListModel<>();
		
		String query = "SELECT * FROM Ciclos";
		
		try {
			
			con = acces.getConexion();
			PreparedStatement prst = con.prepareStatement(query);
			ResultSet rset = prst.executeQuery();
			
			while (rset.next()) {
				
				aux = new PojoCiclo(rset.getInt("ID"), rset.getString("Nombre"), rset.getString("Descripcion"));
				listCiclos.addElement(aux);
				
			}
			
			rset.close();
			prst.close();
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}	
		
		return listCiclos;
	}
	
	public void eliminarCiclos(PojoCiclo ciclo) {
		
		Connection con = null;
		
		try {
			
			con = acces.getConexion();
			String query = "DELETE FROM Ciclos WHERE Nombre = ?";
			        
			PreparedStatement prest = con.prepareStatement(query);
			prest.setString(1, ciclo.getNombre());
			prest.execute();
			
			JOptionPane.showMessageDialog(null, "Ciclo eliminado");
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
	}
	
	public void actualizarDatos(PojoCiclo ciclo, PojoCiclo ciclo2) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String query = "UPDATE Ciclos SET Nombre = ?, Descripcion = ? WHERE ID = ?";
		
		try {
			
			con = acces.getConexion();
			ps = con.prepareStatement(query);
			ps.setString(1, ciclo.getNombre());
			ps.setString(2, ciclo.getDescripcion());
			ps.setInt(3, ciclo2.getId());
			ps.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Ciclo actualizado");
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
	}
	
	public ArrayList<String> ArrayCiclos() {
		Connection con = null;
		ArrayList<String> ciclitos = new ArrayList<>();
		
		String query = "SELECT * FROM Ciclos";
		
		try {
			
			con = acces.getConexion();
			PreparedStatement prst = con.prepareStatement(query);
			ResultSet rset = prst.executeQuery();
			
			while (rset.next()) {			
				ciclitos.add(rset.getString("Nombre"));	
			}
			
			rset.close();
			prst.close();
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}	
		
		return ciclitos;
	}
}
