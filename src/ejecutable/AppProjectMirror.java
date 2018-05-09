package ejecutable;
import java.awt.EventQueue;

import controlador.controlador;
import persistencia.PersistenciaAlumnos;
import persistencia.PersistenciaCiclos;
import view.AltaProyectos;
import view.VConsultarAlumnos;
import view.VInsertarCiclos;
import view.VModificarAlumnos;
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
				VModificarAlumnos mA = new VModificarAlumnos();
				
				controlador cont = new controlador(vPpal, aP, rA, cA, iC, mC, mA);
				cont.setAltaAlum(rA);
				cont.setAltaProject(aP);
				cont.setConsultAlum(cA);
				cont.setPersAlumnos(iA);
				cont.setInsertCiclos(iC);
				cont.setMostrarCiclos(mC);
				cont.setPersCiclos(pC);
				cont.setModAlum(mA);
				
				
				vPpal.setControlador(cont);
				aP.setControlador(cont);
				rA.setControlador(cont);
				cA.setControlador(cont);
				iC.setControlador(cont);
				mC.setControlador(cont);
				mA.setControlador(cont);
				
				vPpal.setVisible(true);
			}
		});
	}
}
