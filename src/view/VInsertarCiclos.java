package view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import controlador.controlador;
import model.PojoCiclo;

import javax.swing.ImageIcon;
import java.awt.Cursor;

public class VInsertarCiclos extends JPanel {
	private JTextField txtDescripcion;
	private JTextField txtNombre;
	private JButton btnAgregarCiclo;
	private String nombre;
	private String descripcion;
	private JButton btnHome;
	
	public VInsertarCiclos() {
		setBackground(new Color(44, 40, 41));
		setLayout(null);
		
		JLabel lblAgregarCiclos = new JLabel("Agregar Ciclos");
		lblAgregarCiclos.setForeground(Color.WHITE);
		lblAgregarCiclos.setFont(new Font("Dialog", Font.PLAIN, 35));
		lblAgregarCiclos.setBounds(74, 73, 338, 98);
		add(lblAgregarCiclos);
		
		btnAgregarCiclo = new JButton("");
		btnAgregarCiclo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAgregarCiclo.setRolloverIcon(new ImageIcon(VInsertarCiclos.class.getResource("/images/ac1.png")));
		btnAgregarCiclo.setContentAreaFilled(false);
		btnAgregarCiclo.setBorderPainted(false);
		btnAgregarCiclo.setIcon(new ImageIcon(VInsertarCiclos.class.getResource("/images/ac.png")));
		btnAgregarCiclo.setBounds(225, 479, 168, 46);
		add(btnAgregarCiclo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNombre.setBounds(109, 205, 94, 25);
		add(lblNombre);
		
		JLabel lblDescripcin = new JLabel("Descripción:");
		lblDescripcin.setForeground(Color.WHITE);
		lblDescripcin.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblDescripcin.setBounds(109, 307, 154, 34);
		add(lblDescripcin);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(151, 353, 350, 82);
		add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(151, 244, 350, 34);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		btnHome = new JButton("");
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setIcon(new ImageIcon(VInsertarCiclos.class.getResource("/images/Casitahome1.png")));
		btnHome.setContentAreaFilled(false);
		btnHome.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnHome.setBounds(508, 32, 54, 55);
		add(btnHome);
	}
	
	public JButton getBtnAgregarCiclo() {
		return btnAgregarCiclo;
	}
	
	public JButton getBtnHome() {
		return btnHome;
	}

	public void setControlador(controlador c) {
		btnAgregarCiclo.addActionListener(c);
		btnHome.addActionListener(c);
		
	}
	
	public PojoCiclo recogerDatosCiclo() {
		nombre = txtNombre.getText();
		descripcion = txtDescripcion.getText();
		
		PojoCiclo datosCiclo = new PojoCiclo(nombre, descripcion);
		
		return datosCiclo;
		
	}
}
