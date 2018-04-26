import java.awt.EventQueue;

import view.Ventana1;

public class AppVentana {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				Ventana1 vPpal = new Ventana1("Ventana Principal");
				
				
				
				vPpal.hacerVisible();
			}
		});

	}

}
