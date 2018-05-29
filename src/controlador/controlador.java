package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import persistencia.PersistenciaAlumnos;
import persistencia.PersistenciaCiclos;
import persistencia.PersistenciaLogin;
import persistencia.PersistenciaProyectos;
import view.VAltaProyecto;
import view.VAmpliarInformacion;
import view.VConsultarAlumnos;
import view.VGestionarProyectos;
import view.VInsertarCiclos;
import view.VLogin;
import view.VModificarAlumnos;
import view.VModificarCiclos;
import view.VModificarProyectos;
import view.VMostrarCiclos;
import view.VRegistroAlumnos;
import view.VRegistroUsuario;
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
	private VModificarCiclos modCiclo;
	private PersistenciaProyectos persProy;
	private VGestionarProyectos gestProj;
	private VModificarProyectos modProj;
	private VAmpliarInformacion ampliInfor;
	private PersistenciaLogin persLogin;
	private VLogin vlog;
	private VRegistroUsuario regisUsur;

	public controlador(VPrincipal principal, VAltaProyecto altaProject, VRegistroAlumnos altaAlum, VConsultarAlumnos consultAlum, 
			VInsertarCiclos insertCiclos, VMostrarCiclos mostrarCiclos, VModificarAlumnos modAlum, VModificarCiclos modCiclo,
			PersistenciaProyectos persProy, VGestionarProyectos gestProj, VModificarProyectos modProj, VLogin vlog, 
			VRegistroUsuario regisUsur) {
		this.principal = principal;
		this.altaProject = altaProject;
		this.altaAlum = altaAlum;
		this.consultAlum = consultAlum;
		this.insertCiclos = insertCiclos;
		this.mostrarCiclos = mostrarCiclos;
		this.modAlum = modAlum;
		this.modCiclo = modCiclo;
		this.persProy = persProy;
		this.gestProj = gestProj;
		this.modProj = modProj;
		this.vlog = vlog;
		this.regisUsur = regisUsur;
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

	public void setModCiclo(VModificarCiclos modCiclo) {
		this.modCiclo = modCiclo;
	}

	public void setPersProy(PersistenciaProyectos persProy) {
		this.persProy = persProy;
	}

	public void setGestProj(VGestionarProyectos gestProj) {
		this.gestProj = gestProj;
	}

	public void setModProj(VModificarProyectos modProj) {
		this.modProj = modProj;
	}

	public void setAmpliInfor(VAmpliarInformacion ampliInfor) {
		this.ampliInfor = ampliInfor;
	}

	public void setVlog(VLogin vlog) {
		this.vlog = vlog;
	}

	public void setPersLogin(PersistenciaLogin persLogin) {
		this.persLogin = persLogin;
	}

	public void setRegisUsur(VRegistroUsuario regisUsur) {
		this.regisUsur = regisUsur;
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
		if (e.getSource().equals(principal.getMntmAlta())) {
			altaProject.aadirComboBox(persCiclos.ArrayCiclos());
			altaProject.getJListAlum().setModel(persAlumnos.ArrayAlumnos());
			altaProject.setVisible(true);
			
		} else if (e.getSource().equals(principal.getMntmAadirAlumnos())) {
			principal.setPanel(altaAlum);
			
		} else if (e.getSource().equals(principal.getMntmConsultarAlumnos())) {
			principal.setPanel(consultAlum);
			consultAlum.getJListAlum().setModel(persAlumnos.mostrarAlumnos());
			
		} else if (e.getSource().equals(altaAlum.getBtnGuardarAlumno())) {
			try {
				persAlumnos.insertarAlumnos(altaAlum.recogerDatos());
				
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(altaAlum, "El nº de Expediente tan solo debe de ser números");
			}
			
			
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
			try {
				persAlumnos.eliminarAlumnos(consultAlum.recogerDatos());
				consultAlum.getJListAlum().setModel(persAlumnos.mostrarAlumnos());
			} catch (NullPointerException e2) {
				JOptionPane.showMessageDialog(consultAlum, "Se debe seleccionar un alumno");
			}
			
		} else if (e.getSource().equals(modAlum.getBtnModificar())) {
			persAlumnos.actualizarDatos(modAlum.recogerDatosMod(), consultAlum.recogerDatos());
			
		} else if (e.getSource().equals(consultAlum.getBtnModificarAlumno())) {
			try {
				modAlum.blabla(consultAlum.recogerDatos());
				principal.setPanel(modAlum);	
			
			} catch (NullPointerException e2) {
				JOptionPane.showMessageDialog(consultAlum, "Se debe seleccionar un alumno");
			}
			
		} else if (e.getSource().equals(mostrarCiclos.getBtnEliminarCiclo())) {
			
			try {
				persCiclos.eliminarCiclos(mostrarCiclos.recogerDatos());
				mostrarCiclos.getJLMostrarCiclos().setModel(persCiclos.mostrarCiclos());
				mostrarCiclos.getBtnEliminarCiclo().setEnabled(false);
				
			} catch (NullPointerException e2) {
				JOptionPane.showMessageDialog(consultAlum, "Se debe seleccionar un ciclo");
			}
			
		} else if (e.getSource().equals(mostrarCiclos.getBtnModificarCiclo())) {
			try {
				modCiclo.blabla(mostrarCiclos.recogerDatos());
				principal.setPanel(modCiclo);
				
			} catch (NullPointerException e2) {
				JOptionPane.showMessageDialog(mostrarCiclos, "Se debe seleccionar un ciclo");
			}
			
		} else if (e.getSource().equals(modCiclo.getBtnModificarCiclo())) {
			persCiclos.actualizarDatos(modCiclo.recogerDatosMod(), mostrarCiclos.recogerDatos());
			
		} else if (e.getSource().equals(altaProject.getBtnCrearProyecto())) {
			persProy.insertarProyectos(altaProject.recogerDatosProyecto(), altaProject.recogerAlumnosProyecto());
			
		} else if (e.getSource().equals(principal.getMntmGestionarProyectos())) {
			principal.setPanel(gestProj);
			gestProj.getJListProyectos().setModel(persProy.mostrarProyectos());
			
		} else if (e.getSource().equals(gestProj.getBtnEliminarProyecto())) {
			try {
				persProy.eliminarProyectos(gestProj.recogerDatos());
				gestProj.getJListProyectos().setModel(persProy.mostrarProyectos());
				
			} catch (NullPointerException e2) {
				JOptionPane.showMessageDialog(consultAlum, "Se debe seleccionar un Proyecto");
			}
			
		} else if (e.getSource().equals(gestProj.getBtnModificarProyecto())) {
			try {
				modProj.getJListAlum().setModel(persProy.AlumnosEnProyecto(gestProj.recogerDatos()));
				modProj.getJListAlumProject().setModel(persAlumnos.mostrarAlumnosEnProyecto(persProy.AlumnosEnProyecto(gestProj.recogerDatos())));
				modProj.blabla2(gestProj.recogerDatos());
				modProj.aadirComboBox(persCiclos.ArrayCiclos());
				modProj.setVisible(true);
				
			} catch (NullPointerException e2) {
				JOptionPane.showMessageDialog(consultAlum, "Se debe seleccionar un Proyecto");
			}
			
		} else if (e.getSource().equals(modProj.getBtnModificarProyecto())) {
				persProy.actualizarDatos(modProj.recogerDatosProyecto(), gestProj.recogerDatos());
				gestProj.getJListProyectos().setModel(persProy.mostrarProyectos());
				
		} else if (e.getSource().equals(modProj.getBtnEliminarDelProyecto())) {
			persProy.eliminarAlumnos(modProj.recogerAlumnoEliminar());
			modProj.getJListAlum().setModel(persProy.AlumnosEnProyecto(gestProj.recogerDatos()));
			
		} else if (e.getSource().equals(modProj.getBtnAadirAlumnosAl())) {
			persProy.aadirAlumnosProyecto(modProj.recogerAlumnoAadir(), gestProj.recogerDatos());
			modProj.getJListAlumProject().setModel(persAlumnos.mostrarAlumnos());
			modProj.getJListAlum().setModel(persProy.AlumnosEnProyecto(gestProj.recogerDatos()));
			
		} else if (e.getSource().equals(gestProj.getBtnAmpliarInformacin())) {
			try {
				ampliInfor.ponerDatos(persProy.nombreCiclo(gestProj.recogerDatos(), gestProj.idCiclo()));
				ampliInfor.getJListAlum().setModel(persProy.AlumnosEnProyecto(gestProj.recogerDatos()));
				ampliInfor.setVisible(true);
			} catch (NullPointerException e2) {
				JOptionPane.showMessageDialog(consultAlum, "Se debe seleccionar un Proyecto");
			}
			
		} else if (e.getSource().equals(gestProj.getBtnFiltrar())) {
			gestProj.getJListProyectos().setModel(persProy.mostrarProyectos(gestProj.recogerComboBox(), gestProj.recogerTxtFiltro()));
			
		} else if (e.getSource().equals(mostrarCiclos.getBtnHome())) {
			principal.setPanel(principal.getPanel1());
			
		} else if (e.getSource().equals(altaProject.getBtnHome())) {
			altaProject.setVisible(false);
			principal.setPanel(principal.getPanel1());
			
		} else if (e.getSource().equals(ampliInfor.getBtnHome())) {
			ampliInfor.setVisible(false);
			principal.setPanel(principal.getPanel1());
			
		} else if (e.getSource().equals(modProj.getBtnHome())) {
			modProj.setVisible(false);
			principal.setPanel(principal.getPanel1());
			
		} else if (e.getSource().equals(gestProj.getBtnHome())) {
			principal.setPanel(principal.getPanel1());
			
		} else if (e.getSource().equals(vlog.getBtnIniciarSesión())) {
			boolean correcto = persLogin.loginCorrecto(vlog.recogerDatos());
			
			if (correcto == true) {
				vlog.setVisible(false);
				principal.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(vlog, "Usuario o contraseña incorrecto");
			}
		} else if (e.getSource().equals(principal.getMntmRegistrarUsuario())) {
			principal.setPanel(regisUsur);
			
		} else if (e.getSource().equals(regisUsur.getBtnRegisUsuario())) {
			persLogin.insertarUsuario(regisUsur.recogerDatos());
			
		} else if (e.getSource().equals(regisUsur.getBtnHome())) {
			principal.setPanel(principal.getPanel1());
			
		} else if (e.getSource().equals(vlog.getBtnSalir())) {
			System.exit(0);
			
		}
	}
}