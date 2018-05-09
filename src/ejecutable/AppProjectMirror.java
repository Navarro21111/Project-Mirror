package ejecutable;
import java.awt.EventQueue;

import controlador.controlador;
import persistencia.PersistenciaAlumnos;
import persistencia.PersistenciaCiclos;
import view.AltaProyectos;
import view.VConsultarAlumnos;
import view.VInsertarCiclos;
import view.VModificarAlumnos;
import view.VModificarCiclo;
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
				VMostrarCiclos gC = new VMostrarCiclos();
				PersistenciaCiclos pC = new PersistenciaCiclos();
				VModificarAlumnos mA = new VModificarAlumnos();
				VModificarCiclo mC = new VModificarCiclo();
				
				controlador cont = new controlador(vPpal, aP, rA, cA, iC, gC, mA, mC);
				cont.setAltaAlum(rA);
				cont.setAltaProject(aP);
				cont.setConsultAlum(cA);
				cont.setPersAlumnos(iA);
				cont.setInsertCiclos(iC);
				cont.setMostrarCiclos(gC);
				cont.setPersCiclos(pC);
				cont.setModAlum(mA);
				cont.setModCiclo(mC);
				
				
				vPpal.setControlador(cont);
				aP.setControlador(cont);
				rA.setControlador(cont);
				cA.setControlador(cont);
				iC.setControlador(cont);
				gC.setControlador(cont);
				mA.setControlador(cont);
				mC.setControlador(cont);
				
				vPpal.setVisible(true);
			}
		});
	}
}
