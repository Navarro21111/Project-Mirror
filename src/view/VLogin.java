package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.controlador;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VLogin extends JFrame {
	private JTextField txtUsuario;
	private JPasswordField jpassClave;
	public VLogin() {
		getContentPane().setBackground(new Color(44, 40, 41));
		getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblUsuario.setBounds(163, 46, 188, 31);
		getContentPane().add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblContrasea.setBounds(163, 142, 188, 31);
		getContentPane().add(lblContrasea);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(163, 82, 130, 26);
		getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		jpassClave = new JPasswordField();
		jpassClave.setBounds(164, 170, 130, 26);
		getContentPane().add(jpassClave);
		
		JButton btnIniciarSesin = new JButton("Iniciar Sesión");
		btnIniciarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iniciarSesion();
			}
		});
		btnIniciarSesin.setBounds(164, 221, 117, 29);
		getContentPane().add(btnIniciarSesin);
	}
	
	public void iniciarSesion() {
		VPrincipal vPpal = new VPrincipal("Ventana Principal");
		controlador contro = new controlador(vPpal);
		AltaProyectos aProject = new AltaProyectos();
		
		
		
		char clave[]=jpassClave.getPassword();

		String clavedef=new String(clave);

		if (txtUsuario.getText().equals("Administrador") && clavedef.equals("12345")) {				                
			
			  dispose();
			  
		      JOptionPane.showMessageDialog(null, "Bienvenido\n"
		      + "Has ingresado satisfactoriamente al sistema",   "Mensaje de bienvenida",
		      JOptionPane.INFORMATION_MESSAGE);
		      
		      vPpal.setPanel(aProject);

		 }else {
			 
		      JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
		      + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
		      JOptionPane.ERROR_MESSAGE);
		           
		 }
	}
}
