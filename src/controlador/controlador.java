package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.AltaProyectos;
import view.VConsultarAlumnos;
import view.VLogin;
import view.VRegistroAlumnos;
import view.VPrincipal;

public class controlador implements ActionListener {
	
	private VPrincipal principal;
	private AltaProyectos altaProject;
	private VRegistroAlumnos altaAlum;
	private VConsultarAlumnos consultAlum;
	private VLogin login;

	public controlador(VPrincipal principal) {
		this.principal = principal;
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

	@Override
	public void actionPerformed(ActionEvent e) {	
		if (e.getSource().equals(principal.getMntmAlta())) {
			principal.setPanel(altaProject);
			//login.setVisible(true);
		} else if (e.getSource().equals(principal.getMntmAadirAlumnos())) {
			principal.setPanel(altaAlum);
		} else if (e.getSource().equals(principal.getMntmConsultarAlumnos())) {
			principal.setPanel(consultAlum);
		}
	}
}
