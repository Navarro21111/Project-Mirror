package view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.border.LineBorder;

import controlador.controlador;

import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.Cursor;

public class VConsultarAlumnos extends JPanel {
	private JButton btnMostrarAlumnos;
	private JList JListAlum;
	private JButton btnHome;
	public VConsultarAlumnos() {
		setBackground(new Color(44, 40, 41));
		setLayout(null);
		
		JLabel lblConsultarAlumnos = new JLabel("Consultar Alumnos");
		lblConsultarAlumnos.setForeground(Color.WHITE);
		lblConsultarAlumnos.setFont(new Font("Dialog", Font.PLAIN, 35));
		lblConsultarAlumnos.setBounds(47, 24, 463, 118);
		add(lblConsultarAlumnos);
		
		btnMostrarAlumnos = new JButton("Mostrar Alumnos");
		btnMostrarAlumnos.setBounds(190, 153, 204, 36);
		add(btnMostrarAlumnos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(104, 280, 396, 231);
		add(scrollPane);
		
		JListAlum = new JList();
		scrollPane.setViewportView(JListAlum);
		
		
		btnHome = new JButton("");
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setIcon(new ImageIcon(VConsultarAlumnos.class.getResource("/images/Casitahome1.png")));
		btnHome.setContentAreaFilled(false);
		btnHome.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnHome.setBounds(497, 30, 54, 55);
		add(btnHome);
	}
	
	public JButton getBtnMostrarAlumnos() {
		return btnMostrarAlumnos;
	}
	
	public void setControlador(controlador c) {
		btnMostrarAlumnos.addActionListener(c);
		btnHome.addActionListener(c);
	}

	public JButton getBtnHome() {
		return btnHome;
	}

	public JList getJListAlum() {
		return JListAlum;
	}
}
