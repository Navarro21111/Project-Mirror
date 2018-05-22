package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import model.PojoAlumno;
import model.PojoProyecto;
import view.VGestionarProyectos;

public class PersistenciaProyectos {
	private AccesoDB acces;
	
	public PersistenciaProyectos() {
		this.acces = new AccesoDB();
	}
	
	public void insertarProyectos(PojoProyecto proyecto, ArrayList<PojoAlumno> alumni) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rset = null;
		int aux = 0;
		int aux2 = 0;
		String aux3;
		int aux4 = 0;
		
		String query = "SELECT ID FROM Ciclos WHERE Nombre = ?";
		
		try {
			
			con = acces.getConexion();
			aux3 = proyecto.getCiclo();
			ps = con.prepareStatement(query);
			ps.setString(1, aux3);
			rset = ps.executeQuery();
			
			while (rset.next()) {
				aux2 = rset.getInt(1);
			}
			
			if (ps != null) {
				ps.close();
			}
			
			query = "INSERT INTO Proyectos(Nombre, Nota, Anyo, Curso, Grupo, Ciclo, URL) VALUES (?,?,?,?,?,?,?)";
		
			con = acces.getConexion();
			ps = con.prepareStatement(query);
			ps.setString(1, proyecto.getNombre());
			ps.setInt(2, proyecto.getNota());
			ps.setInt(3, proyecto.getAnyo());
			ps.setString(4, proyecto.getCurso());
			ps.setString(5, proyecto.getGrupo());
			ps.setInt(6, aux2);
			ps.setString(7, proyecto.getUrl());
			ps.executeUpdate();
		
			if (ps != null) {
				ps.close();
			}
			
			query = "SELECT MAX(ID) FROM Proyectos";
			ps = con.prepareStatement(query);
			rset = ps.executeQuery();
			
			while (rset.next()) {
				aux = rset.getInt(1);
			}
			
			if (ps != null) {
				ps.close();
			}
			
			for (int i = 0; i < alumni.size(); i++) {
				aux4 = alumni.get(i).getId();
			
				query = "INSERT INTO Pertenecen(Alumno, Proyecto) VALUES (?,?)";
				ps = con.prepareStatement(query);
				ps.setInt(1, aux4);
				ps.setInt(2, aux);
				ps.executeUpdate();
			
				if (ps != null) {
					ps.close();
				}
			}
			
			ps.close();
			rset.close();
			
			JOptionPane.showMessageDialog(null, "Proyecto guardado");
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
	}
	
	public DefaultListModel<PojoProyecto> mostrarProyectos(String seleccionado, String escrito) {
		PojoProyecto aux;
		Connection con = null;
		DefaultListModel<PojoProyecto> listProject = new DefaultListModel<>();
		String query = null;
		
		
		try {
			con = acces.getConexion();
			
			if (seleccionado == "Todos") {
				query = "SELECT * FROM Proyectos";
				PreparedStatement prst = con.prepareStatement(query);
				ResultSet rset = prst.executeQuery();
				
				while (rset.next()) {
					aux = new PojoProyecto(rset.getInt("ID"), rset.getString("Nombre"), rset.getString("Grupo"), rset.getInt("Anyo"), rset.getString("Curso"), 
							rset.getInt("Nota"), rset.getString("Ciclo"), rset.getString("URL"));
					listProject.addElement(aux);

				}
				
				rset.close();
				prst.close();
				
			} else if (seleccionado == "Nombre") {
				query = "SELECT * FROM Proyectos WHERE Nombre = ?";
				PreparedStatement prst = con.prepareStatement(query);
				prst.setString(1, escrito);
				ResultSet rset = prst.executeQuery();
				
				while (rset.next()) {
					aux = new PojoProyecto(rset.getInt("ID"), rset.getString("Nombre"), rset.getString("Grupo"), rset.getInt("Anyo"), rset.getString("Curso"), 
							rset.getInt("Nota"), rset.getString("Ciclo"), rset.getString("URL"));
					listProject.addElement(aux);

				}
				
				rset.close();
				prst.close();
				
			} else if (seleccionado == "Ciclo") {
				query = "SELECT * FROM Proyectos WHERE Ciclo = ?";
				PreparedStatement prst = con.prepareStatement(query);
				prst.setString(1, escrito);
				ResultSet rset = prst.executeQuery();
				
				while (rset.next()) {
					aux = new PojoProyecto(rset.getInt("ID"), rset.getString("Nombre"), rset.getString("Grupo"), rset.getInt("Anyo"), rset.getString("Curso"), 
							rset.getInt("Nota"), rset.getString("Ciclo"), rset.getString("URL"));
					listProject.addElement(aux);

				}
				
				rset.close();
				prst.close();
				
			} else if (seleccionado == "Año") {
				query = "SELECT * FROM Proyectos WHERE Año = ?";
				PreparedStatement prst = con.prepareStatement(query);
				prst.setInt(1, Integer.parseInt(escrito));
				ResultSet rset = prst.executeQuery();
				
				while (rset.next()) {
					aux = new PojoProyecto(rset.getInt("ID"), rset.getString("Nombre"), rset.getString("Grupo"), rset.getInt("Anyo"), rset.getString("Curso"), 
							rset.getInt("Nota"), rset.getString("Ciclo"), rset.getString("URL"));
					listProject.addElement(aux);

				}
				
				rset.close();
				prst.close();
				
			} else if (seleccionado == "Nota") {
				query = "SELECT * FROM Proyectos WHERE Nota = ?";
				PreparedStatement prst = con.prepareStatement(query);
				prst.setInt(1, Integer.parseInt(escrito));
				ResultSet rset = prst.executeQuery();
				
				while (rset.next()) {
					aux = new PojoProyecto(rset.getInt("ID"), rset.getString("Nombre"), rset.getString("Grupo"), rset.getInt("Anyo"), rset.getString("Curso"), 
							rset.getInt("Nota"), rset.getString("Ciclo"), rset.getString("URL"));
					listProject.addElement(aux);

				}
				
				rset.close();
				prst.close();
				
			} else if (seleccionado == "Grupo") {
				query = "SELECT * FROM Proyectos WHERE Grupo = ?";
				PreparedStatement prst = con.prepareStatement(query);
				prst.setString(1, escrito);
				ResultSet rset = prst.executeQuery();
				
				while (rset.next()) {
					aux = new PojoProyecto(rset.getInt("ID"), rset.getString("Nombre"), rset.getString("Grupo"), rset.getInt("Anyo"), rset.getString("Curso"), 
							rset.getInt("Nota"), rset.getString("Ciclo"), rset.getString("URL"));
					listProject.addElement(aux);

				}
				
				rset.close();
				prst.close();
			}
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
		
		return listProject;
	}
	
	public void eliminarProyectos(PojoProyecto proyecto) {
		PreparedStatement prest = null;
		Connection con = null;
		ResultSet rset = null;
		int aux = 0;
		
		String query = "SELECT ID FROM Proyectos WHERE nombre = ?";
		try {
			
			con = acces.getConexion();
			prest = con.prepareStatement(query);
			prest.setString(1, proyecto.getNombre());
			rset = prest.executeQuery();
			
			while (rset.next()) {
				aux = rset.getInt(1);
			}
			
			if (prest != null) {
				prest.close();
			}
			
			
			query = "DELETE FROM Proyectos WHERE ID = ?";
			con = acces.getConexion();        
			prest = con.prepareStatement(query);
			prest.setInt(1, aux);
			prest.execute();
			
			if (prest != null) {
				prest.close();
			}
			
			query = "DELETE FROM Pertenecen Where Proyecto = ?";
			prest = con.prepareStatement(query);
			prest.setInt(1, aux);
			prest.execute();
			
			JOptionPane.showMessageDialog(null, "Proyecto eliminado");
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
	}
	
	public void actualizarDatos(PojoProyecto proyecto, PojoProyecto proyecto2) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String query = "UPDATE Proyectos SET Nombre = ?, Nota = ?, Anyo = ?, Curso = ?, Grupo = ?, Ciclo = ?, URL = ? WHERE ID = ?";
		
		try {
			
			con = acces.getConexion();
			ps = con.prepareStatement(query);
			ps.setString(1, proyecto.getNombre());
			ps.setInt(2, proyecto.getNota());
			ps.setInt(3, proyecto.getAnyo());
			ps.setString(4, proyecto.getCurso());
			ps.setString(5, proyecto.getGrupo());
			ps.setString(6, proyecto.getCiclo());
			ps.setString(7, proyecto.getUrl());
			ps.setInt(8, proyecto2.getId());
			
			ps.executeUpdate();
			ps.close();
			
			JOptionPane.showMessageDialog(null, "Proyecto actualizado");
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
	}
	
	public DefaultListModel<PojoAlumno> AlumnosEnProyecto(PojoProyecto proyecto) {
		DefaultListModel<PojoAlumno> listAlumns = new DefaultListModel<>();
		Connection con = null;
		PreparedStatement ps = null;
		PojoAlumno aux;
		
		String query = "SELECT Alumnos.* FROM Alumnos, Pertenecen, Proyectos WHERE Pertenecen.Proyecto  = Proyectos.ID AND  Pertenecen.Alumno = Alumnos.ID AND Proyectos.ID = ?";
		
		try {
			
			con = acces.getConexion();
			ps = con.prepareStatement(query);
			ps.setInt(1, proyecto.getId());
			ResultSet rset = ps.executeQuery();
			
			while (rset.next()) {
				aux = new PojoAlumno(rset.getInt("ID"), rset.getInt("NumExpediente"), rset.getString("Nombre"), rset.getString("Apellido1"), rset.getString("Apellido2"));
				listAlumns.addElement(aux);

			}
			
			rset.close();
			ps.close();
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
		
		return listAlumns;
	}
	
	public void eliminarAlumnos(PojoAlumno alumno) {
		PreparedStatement prest = null;
		Connection con = null;
		ResultSet rset = null;
		int aux = 0;
		String query = "DELETE FROM Pertenecen WHERE Alumno = ?";
		try {	
			
			con = acces.getConexion();        
			prest = con.prepareStatement(query);
			prest.setInt(1, alumno.getId());
			prest.execute();
			
			prest.close();
			
			JOptionPane.showMessageDialog(null, "Alumno eliminado del proyecto");
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
	}
	
	public void aadirAlumnosProyecto(PojoAlumno alumno, PojoProyecto proyecto) {
		PreparedStatement prest = null;
		Connection con = null; 
		String query = "INSERT INTO Pertenecen VALUES (?,?)";
		
		try {	
			con = acces.getConexion();        
			prest = con.prepareStatement(query);
			prest.setInt(1, alumno.getId());
			System.out.println(alumno.getId());
			prest.setInt(2, proyecto.getId());
			System.out.println(proyecto.getId());
			prest.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Alumno añadido al proyecto");
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
	}
	
	public DefaultListModel<PojoProyecto> mostrarProyectos() {
		PojoProyecto aux;
		Connection con = null;
		DefaultListModel<PojoProyecto> listProject = new DefaultListModel<>();
		String query = "SELECT * FROM Proyectos";
		
		
		try {
			con = acces.getConexion();
			PreparedStatement prst = con.prepareStatement(query);
			ResultSet rset = prst.executeQuery();
			
			while (rset.next()) {
				aux = new PojoProyecto(rset.getInt("ID"), rset.getString("Nombre"), rset.getString("Grupo"), rset.getInt("Anyo"), rset.getString("Curso"), 
						rset.getInt("Nota"), rset.getString("Ciclo"), rset.getString("URL"));
				listProject.addElement(aux);

			}
			
			rset.close();
			prst.close();
			
		} catch(SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación" + e.getMessage());
		}
		
		return listProject;
	}
}
