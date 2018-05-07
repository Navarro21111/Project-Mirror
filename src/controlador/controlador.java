package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import persistencia.PersistenciaAlumnos;
import persistencia.PersistenciaCiclos;
import view.AltaProyectos;
import view.VConsultarAlumnos;
import view.VInsertarCiclos;
import view.VLogin;
import view.VMostrarCiclos;
import view.VRegistroAlumnos;
import view.VPrincipal;

public class controlador implements ActionListener {
	
	private VPrincipal principal;
	private AltaProyectos altaProject;
	private VRegistroAlumnos altaAlum;
	private VConsultarAlumnos consultAlum;
	private VLogin login;
	private PersistenciaAlumnos persAlumnos;
	private VInsertarCiclos insertCiclos;
	private VMostrarCiclos mostrarCiclos;
	private PersistenciaCiclos persCiclos;

	public controlador(VPrincipal principal, AltaProyectos altaProject, VRegistroAlumnos altaAlum, VConsultarAlumnos consultAlum, 
			VInsertarCiclos insertCiclos, VMostrarCiclos mostrarCiclos) {
		this.principal = principal;
		this.altaProject = altaProject;
		this.altaAlum = altaAlum;
		this.consultAlum = consultAlum;
		this.insertCiclos = insertCiclos;
		this.mostrarCiclos = mostrarCiclos;
	}

	public void setAltaProject(AltaProyectos altaProject) {
		this.altaProject = altaProject;
	}

	public void setAltaAlum(VRegistroAlumnos altaAlum) {
		this.altaAlum = altaAlum;
	}

	public void setLogin(VLogin login) {
		this.login = login;
	}

	public void setConsultAlum(VConsultarAlumnos consultAlum) {
		this.consultAlum = consultAlum;
	}

	public void setPersAlumnos(PersistenciaAlumnos persAlumnos) {
		this.persAlumnos = persAlumnos;
	}

	public void setInsertCiclos(VInsertarCiclos insertCiclos) {
		this.insertCiclos = insertCiclos;
	}

	public void setMostrarCiclos(VMostrarCiclos mostrarCiclos) {
		this.mostrarCiclos = mostrarCiclos;
	}

	public void setPersCiclos(PersistenciaCiclos persCiclos) {
		this.persCiclos = persCiclos;
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
		if (e.getSource().equals(principal.getMntmAlta())) {
			principal.setPanel(altaProject);
			
		} else if (e.getSource().equals(principal.getMntmAadirAlumnos())) {
			principal.setPanel(altaAlum);
			
		} else if (e.getSource().equals(principal.getMntmConsultarAlumnos())) {
			principal.setPanel(consultAlum);
			
		} else if (e.getSource().equals(altaProject.getBtnHome())) {
			principal.setPanel(principal.getPanel1());
			
		} else if (e.getSource().equals(altaAlum.getBtnGuardarAlumno())) {
			persAlumnos.insertarAlumnos(altaAlum.recogerDatos());
			
		} else if (e.getSource().equals(altaAlum.getBtnHome())) {
			principal.setPanel(principal.getPanel1());
			
		} else if (e.getSource().equals(consultAlum.getBtnHome())) {
			principal.setPanel(principal.getPanel1());
			
		} else if (e.getSource().equals(consultAlum.getBtnMostrarAlumnos())) {
			consultAlum.getJListAlum().setModel(persAlumnos.mostrarAlumnos());;
			
		} else if (e.getSource().equals(principal.getMntmAadirCiclos())) {
			principal.setPanel(insertCiclos);
			
		} else if (e.getSource().equals(principal.getMntmConsultarCiclos())) {
			principal.setPanel(mostrarCiclos);
			
		} else if (e.getSource().equals(insertCiclos.getBtnAgregarCiclo())) {
			persCiclos.insertarCiclos(insertCiclos.recogerDatosCiclo());
			
		} else if (e.getSource().equals(insertCiclos.getBtnHome())) {
			principal.setPanel(principal.getPanel1());
			
		} else if (e.getSource().equals(principal.getMntmConsultarCiclos())) {
			principal.setPanel(mostrarCiclos);
		} else if (e.getSource().equals(mostrarCiclos.getBtnMostrarCiclos())) {
			mostrarCiclos.getJLMostrarCiclos().setModel(persCiclos.mostrarCiclos());
		}
	}
}
