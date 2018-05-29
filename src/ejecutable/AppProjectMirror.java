package ejecutable;
import java.awt.EventQueue;

import controlador.controlador;
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
import view.VPrincipal;
import view.VRegistroAlumnos;
import view.VRegistroUsuario;

public class AppProjectMirror {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				VPrincipal vPpal = new VPrincipal("Ventana Principal");
				VAltaProyecto aP = new VAltaProyecto();
				VRegistroAlumnos rA = new VRegistroAlumnos();
				VConsultarAlumnos cA = new VConsultarAlumnos();
				PersistenciaAlumnos iA = new PersistenciaAlumnos();
				VInsertarCiclos iC = new VInsertarCiclos();
				VMostrarCiclos gC = new VMostrarCiclos();
				PersistenciaCiclos pC = new PersistenciaCiclos();
				VModificarAlumnos mA = new VModificarAlumnos();
				VModificarCiclos mC = new VModificarCiclos();
				PersistenciaProyectos pP = new PersistenciaProyectos();
				VGestionarProyectos gP = new VGestionarProyectos();
				VModificarProyectos mP = new VModificarProyectos();
				VAmpliarInformacion amP = new VAmpliarInformacion();
				VLogin vL = new VLogin();
				PersistenciaLogin pL = new PersistenciaLogin();
				VRegistroUsuario rU = new VRegistroUsuario();
				
				controlador cont = new controlador(vPpal, aP, rA, cA, iC, gC, mA, mC, pP, gP, mP, vL, rU);
				cont.setAltaAlum(rA);
				cont.setAltaProject(aP);
				cont.setConsultAlum(cA);
				cont.setPersAlumnos(iA);
				cont.setInsertCiclos(iC);
				cont.setMostrarCiclos(gC);
				cont.setPersCiclos(pC);
				cont.setModAlum(mA);
				cont.setModCiclo(mC);
				cont.setPersProy(pP);
				cont.setGestProj(gP);
				cont.setModProj(mP);
				cont.setAmpliInfor(amP);
				cont.setVlog(vL);
				cont.setPersLogin(pL);
				cont.setRegisUsur(rU);
				
				
				vPpal.setControlador(cont);
				aP.setControlador(cont);
				rA.setControlador(cont);
				cA.setControlador(cont);
				iC.setControlador(cont);
				gC.setControlador(cont);
				mA.setControlador(cont);
				mC.setControlador(cont);
				gP.setControlador(cont);
				mP.setControlador(cont);
				amP.setControlador(cont);
				vL.setControlador(cont);
				rU.setControlador(cont);
				
				//vPpal.setVisible(true);
				vL.setVisible(true);
			}
		});
	}
}
