package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import persistencia.PersistenciaAlumnos;
import persistencia.PersistenciaCiclos;
import view.AltaProyectos;
import view.VAltaProyecto;
import view.VConsultarAlumnos;
import view.VInsertarCiclos;
import view.VModificarAlumnos;
import view.VModificarCiclo;
import view.VMostrarCiclos;
import view.VRegistroAlumnos;
import view.VPrincipal;

public class controlador implements ActionListener {
	
	private VPrincipal principal;
	private VAltaProyecto altaProject;
	private VRegistroAlumnos altaAlum;
	private VConsultarAlumnos consultAlum;

	private PersistenciaAlumnos persAlumnos;
	private VInsertarCiclos insertCiclos;
	private VMostrarCiclos mostrarCiclos;
	private PersistenciaCiclos persCiclos;
	private VModificarAlumnos modAlum;
	private VModificarCiclo modCiclo;

	public controlador(VPrincipal principal, VAltaProyecto altaProject, VRegistroAlumnos altaAlum, VConsultarAlumnos consultAlum, 
			VInsertarCiclos insertCiclos, VMostrarCiclos mostrarCiclos, VModificarAlumnos modAlum, VModificarCiclo modCiclo) {
		this.principal = principal;
		this.altaProject = altaProject;
		this.altaAlum = altaAlum;
		this.consultAlum = consultAlum;
		this.insertCiclos = insertCiclos;
		this.mostrarCiclos = mostrarCiclos;
		this.modAlum = modAlum;
		this.modCiclo = modCiclo;
	}

	public void setAltaProject(VAltaProyecto altaProject) {
		this.altaProject = altaProject;
	}

	public void setAltaAlum(VRegistroAlumnos altaAlum) {
		this.altaAlum = altaAlum;
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

	public void setModAlum(VModificarAlumnos modAlum) {
		this.modAlum = modAlum;
	}

	public void setModCiclo(VModificarCiclo modCiclo) {
		this.modCiclo = modCiclo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
		if (e.getSource().equals(principal.getMntmAlta())) {
			//principal.setPanel(altaProject);
			altaProject.setVisible(true);
			
		} else if (e.getSource().equals(principal.getMntmAadirAlumnos())) {
			principal.setPanel(altaAlum);
			
		} else if (e.getSource().equals(principal.getMntmConsultarAlumnos())) {
			principal.setPanel(consultAlum);
			consultAlum.getJListAlum().setModel(persAlumnos.mostrarAlumnos());
			
		/*} else if (e.getSource().equals(altaProject.getBtnHome())) {
			principal.setPanel(principal.getPanel1());*/
			
		} else if (e.getSource().equals(altaAlum.getBtnGuardarAlumno())) {
			persAlumnos.insertarAlumnos(altaAlum.recogerDatos());
			
		} else if (e.getSource().equals(altaAlum.getBtnHome())) {
			principal.setPanel(principal.getPanel1());
			
		} else if (e.getSource().equals(consultAlum.getBtnHome())) {
			principal.setPanel(principal.getPanel1());
			
		} else if (e.getSource().equals(principal.getMntmAadirCiclos())) {
			principal.setPanel(insertCiclos);
			
		} else if (e.getSource().equals(principal.getMntmGestionarCiclos())) {
			principal.setPanel(mostrarCiclos);
			mostrarCiclos.getJLMostrarCiclos().setModel(persCiclos.mostrarCiclos());
			
		} else if (e.getSource().equals(insertCiclos.getBtnAgregarCiclo())) {
			persCiclos.insertarCiclos(insertCiclos.recogerDatosCiclo());
			
		} else if (e.getSource().equals(insertCiclos.getBtnHome())) {
			principal.setPanel(principal.getPanel1());
			
		} else if (e.getSource().equals(consultAlum.getBtnEliminarAlumno())) {
			persAlumnos.eliminarAlumnos(consultAlum.recogerDatos());
			consultAlum.getJListAlum().setModel(persAlumnos.mostrarAlumnos());
			
		} else if (e.getSource().equals(modAlum.getBtnModificar())) {
			persAlumnos.actualizarDatos(modAlum.recogerDatosMod());
			
		} else if (e.getSource().equals(consultAlum.getBtnModificarAlumno())) {
			principal.setPanel(modAlum);
			modAlum.blabla(consultAlum.recogerDatos());
			
		} else if (e.getSource().equals(mostrarCiclos.getBtnEliminarCiclo())) {
			persCiclos.eliminarCiclos(mostrarCiclos.recogerDatos());
			mostrarCiclos.getJLMostrarCiclos().setModel(persCiclos.mostrarCiclos());
			
		} else if (e.getSource().equals(mostrarCiclos.getBtnModificarCiclo())) {
			principal.setPanel(modCiclo);
			modCiclo.blabla(mostrarCiclos.recogerDatos());
			
		} else if (e.getSource().equals(modCiclo.getBtnModificarCiclo())) {
			persCiclos.actualizarDatos(modCiclo.recogerDatosMod());
		}
		
	}
}
