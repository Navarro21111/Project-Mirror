package view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import controlador.controlador;
import model.PojoLogin;

import javax.swing.ImageIcon;
import java.awt.Cursor;

public class VRegistroUsuario extends JPanel {
	private JTextField txtUsuario;
	private JPasswordField pwContrasenia;
	private JButton btnHome;
	private JButton btnRegisUsuario;
	private String usuario;
	private JLabel lblRegistrarUsuario;
	
	public VRegistroUsuario() {
		setBorder(new LineBorder(Color.WHITE, 2));
		setBackground(new Color(44, 40, 41));
		setLayout(null);
		
		JLabel label = new JLabel("Usuario:");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dialog", Font.PLAIN, 20));
		label.setBounds(175, 177, 87, 27);
		add(label);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(175, 216, 190, 26);
		add(txtUsuario);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblContrasea.setBounds(175, 291, 141, 34);
		add(lblContrasea);
		
		pwContrasenia = new JPasswordField();
		pwContrasenia.setBounds(175, 337, 190, 26);
		add(pwContrasenia);
		
		btnRegisUsuario = new JButton("");
		btnRegisUsuario.setBorder(new LineBorder(Color.WHITE));
		btnRegisUsuario.setRolloverIcon(new ImageIcon(VRegistroUsuario.class.getResource("/images/ru1.png")));
		btnRegisUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegisUsuario.setContentAreaFilled(false);
		btnRegisUsuario.setBorderPainted(false);
		btnRegisUsuario.setIcon(new ImageIcon(VRegistroUsuario.class.getResource("/images/ru.png")));
		btnRegisUsuario.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnRegisUsuario.setBounds(175, 428, 193, 55);
		add(btnRegisUsuario);
		
		btnHome = new JButton("");
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setIcon(new ImageIcon(VRegistroUsuario.class.getResource("/images/Casitahome1.png")));
		btnHome.setContentAreaFilled(false);
		btnHome.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnHome.setBounds(540, 6, 54, 55);
		add(btnHome);
		
		lblRegistrarUsuario = new JLabel("Registrar Usuario");
		lblRegistrarUsuario.setFont(new Font("Dialog", Font.PLAIN, 45));
		lblRegistrarUsuario.setForeground(Color.WHITE);
		lblRegistrarUsuario.setBounds(97, 34, 403, 117);
		add(lblRegistrarUsuario);
	}
	
	public void setControlador(controlador c) {
		btnRegisUsuario.addActionListener(c);
		btnHome.addActionListener(c);
	}

	public JButton getBtnRegisUsuario() {
		return btnRegisUsuario;
	}

	public JButton getBtnHome() {
		return btnHome;
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
