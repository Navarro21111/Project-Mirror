package ejecutable;
import java.awt.EventQueue;

import controlador.controlador;
import view.AltaProyectos;
import view.VConsultarAlumnos;
import view.VLogin;
import view.VPrincipal;
import view.VRegistroAlumnos;

public class AppProjectMirror {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				VPrincipal vPpal = new VPrincipal("Ventana Principal");
				AltaProyectos aP = new AltaProyectos();
				VRegistroAlumnos rA = new VRegistroAlumnos();
				VConsultarAlumnos cA = new VConsultarAlumnos();
				VLogin vL = new VLogin();
				
				controlador cont = new controlador(vPpal);
				cont.setAltaAlum(rA);
				cont.setAltaProject(aP);
				cont.setLogin(vL);
				cont.setConsultAlum(cA);
				
				vPpal.setControlador(cont);
				
				vPpal.setVisible(true);
			}
		});

	}

}
