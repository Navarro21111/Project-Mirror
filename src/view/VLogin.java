package view;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import java.lang.reflect.Array;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controlador.controlador;
import model.PojoLogin;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class VLogin extends JDialog {
	private JPasswordField pwContrasenia;
	private JTextField txtUsuario;
	private JButton btnIniciarSesión;
	private String usuario;
	private JButton btnSalir;

	
	public VLogin() {
		setBounds(new Rectangle(0, 0, 481, 430));
		getContentPane().setBackground(new Color(44, 40, 41));
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblUsuario.setBounds(123, 117, 87, 27);
		getContentPane().add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblContrasea.setBounds(123, 205, 141, 34);
		getContentPane().add(lblContrasea);
		
		pwContrasenia = new JPasswordField();
		pwContrasenia.setBounds(132, 251, 190, 26);
		getContentPane().add(pwContrasenia);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(132, 156, 190, 26);
		getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		btnIniciarSesión = new JButton("Iniciar Sesión");
		btnIniciarSesión.setBounds(132, 309, 178, 46);
		getContentPane().add(btnIniciarSesión);
		
		JLabel lblIniciarSesin = new JLabel("Iniciar Sesión");
		lblIniciarSesin.setForeground(Color.WHITE);
		lblIniciarSesin.setFont(new Font("Dialog", Font.PLAIN, 40));
		lblIniciarSesin.setBounds(62, 19, 316, 72);
		getContentPane().add(lblIniciarSesin);
		
		btnSalir = new JButton("");
		btnSalir.setFocusPainted(false);
		btnSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalir.setIcon(new ImageIcon(VLogin.class.getResource("/images/apagar25.png")));
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorder(new LineBorder(Color.WHITE, 2));
		btnSalir.setBounds(421, 6, 54, 55);
		getContentPane().add(btnSalir);
		
		setLocationRelativeTo(null);
	}
	
	public void setControlador(controlador c) {
		btnIniciarSesión.addActionListener(c);
		btnSalir.addActionListener(c);
	}

	public JButton getBtnIniciarSesión() {
		return btnIniciarSesión;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}
	
	public PojoLogin recogerDatos() {
		usuario = txtUsuario.getText();
		String passwFinal = "";
		char[] contrasenia = pwContrasenia.getPassword();
		
		for (int i = 0; i < contrasenia.length; i++) {
			passwFinal += contrasenia[i];
		}
		
		PojoLogin datosLogin = new PojoLogin(usuario, passwFinal);
		
		return datosLogin;
	}
}
