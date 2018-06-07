package view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import controlador.controlador;
import model.PojoAlumno;
import model.PojoCiclo;

import javax.swing.ImageIcon;

import javax.swing.JPanel;
import java.awt.Cursor;

public class VModificarCiclos extends JPanel {
	private JTextField txtNombre;
	private JTextField txtDescripcion;
	private JButton btnModificarCiclo;
	private String nombre;
	private String descripcion;
	private JButton btnHome;
	
	public VModificarCiclos() {
		setBackground(new Color(44, 40, 41));
		setLayout(null);
		
		JLabel label = new JLabel("Nombre:");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		label.setBounds(96, 143, 94, 25);
		add(label);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(98, 200, 350, 34);
		add(txtNombre);
		
		JLabel label_1 = new JLabel("Descripción:");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		label_1.setBounds(96, 276, 154, 34);
		add(label_1);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(96, 327, 350, 82);
		add(txtDescripcion);
		
		JLabel lblModificarCiclos = new JLabel("Modificar Ciclos");
		lblModificarCiclos.setForeground(Color.WHITE);
		lblModificarCiclos.setFont(new Font("Dialog", Font.PLAIN, 35));
		lblModificarCiclos.setBounds(89, 22, 338, 98);
		add(lblModificarCiclos);
		
		btnModificarCiclo = new JButton("");
		btnModificarCiclo.setRolloverIcon(new ImageIcon(VModificarCiclos.class.getResource("/images/mc1.png")));
		btnModificarCiclo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnModificarCiclo.setContentAreaFilled(false);
		btnModificarCiclo.setBorderPainted(false);
		btnModificarCiclo.setIcon(new ImageIcon(VModificarCiclos.class.getResource("/images/mc.png")));
		btnModificarCiclo.setBounds(205, 474, 168, 46);
		add(btnModificarCiclo);
		
		btnHome = new JButton("");
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setIcon(new ImageIcon(VModificarCiclos.class.getResource("/images/Casitahome1.png")));
		btnHome.setContentAreaFilled(false);
		btnHome.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnHome.setBounds(488, 32, 54, 55);
		add(btnHome);
	}
	
	public void setControlador(controlador c) {
		btnModificarCiclo.addActionListener(c);
		btnHome.addActionListener(c);
	}
	
	public JButton getBtnModificarCiclo() {
		return btnModificarCiclo;
	}

	public JButton getBtnHome() {
		return btnHome;
	}

	public void blabla(PojoCiclo ciclo) {
		txtNombre.setText(ciclo.getNombre());
		txtDescripcion.setText(ciclo.getDescripcion());
	}
	
	public PojoCiclo recogerDatosMod() {
		nombre = txtNombre.getText();
		descripcion = txtDescripcion.getText();
		
		
		PojoCiclo datos = new PojoCiclo(nombre, descripcion);
		
		return datos;
	}

}