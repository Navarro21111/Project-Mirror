package ejecutable;
import java.awt.EventQueue;

import controlador.controlador;
import persistencia.PersistenciaAlumnos;
import persistencia.PersistenciaCiclos;
import view.AltaProyectos;
import view.VConsultarAlumnos;
import view.VInsertarCiclos;
import view.VLogin;
import view.VMostrarCiclos;
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
				PersistenciaAlumnos iA = new PersistenciaAlumnos();
				VInsertarCiclos iC = new VInsertarCiclos();
				VMostrarCiclos mC = new VMostrarCiclos();
				PersistenciaCiclos pC = new PersistenciaCiclos();
				VLogin vL = new VLogin();
				
				controlador cont = new controlador(vPpal, aP, rA, cA, iC, mC);
				cont.setAltaAlum(rA);
				cont.setAltaProject(aP);
				cont.setLogin(vL);
				cont.setConsultAlum(cA);
				cont.setPersAlumnos(iA);
				cont.setInsertCiclos(iC);
				cont.setMostrarCiclos(mC);
				cont.setPersCiclos(pC);
				
				
				vPpal.setControlador(cont);
				aP.setControlador(cont);
				rA.setControlador(cont);
				cA.setControlador(cont);
				iC.setControlador(cont);
				mC.setControlador(cont);
				
				vPpal.setVisible(true);
			}
		});
	}
}
