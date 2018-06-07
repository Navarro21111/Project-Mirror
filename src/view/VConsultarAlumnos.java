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
import model.PojoAlumno;

import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.Cursor;

public class VConsultarAlumnos extends JPanel {
	private JButton btnHome;
	private JList<PojoAlumno> JListAlum;
	private JButton btnEliminarAlumno;
	private JButton btnModificarAlumno;
	private int expediente;
	private String nombre;
	private String primApe;
	private String segApe;
	private int id;
	
	public VConsultarAlumnos() {
		setBackground(new Color(44, 40, 41));
		setLayout(null);
		
		JLabel lblConsultarAlumnos = new JLabel("Consultar Alumnos");
		lblConsultarAlumnos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblConsultarAlumnos.setForeground(Color.WHITE);
		lblConsultarAlumnos.setFont(new Font("Dialog", Font.PLAIN, 35));
		lblConsultarAlumnos.setBounds(72, 23, 463, 118);
		add(lblConsultarAlumnos);
		
		
		btnHome = new JButton("");
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setIcon(new ImageIcon(VConsultarAlumnos.class.getResource("/images/Casitahome1.png")));
		btnHome.setContentAreaFilled(false);
		btnHome.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnHome.setBounds(497, 30, 54, 55);
		add(btnHome);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(116, 215, 358, 218);
		add(scrollPane);
		
		JListAlum = new JList();
		JListAlum.setForeground(Color.BLACK);
		JListAlum.setBackground(Color.WHITE);
		scrollPane.setViewportView(JListAlum);
		
		btnEliminarAlumno = new JButton("");
		btnEliminarAlumno.setRolloverIcon(new ImageIcon(VConsultarAlumnos.class.getResource("/images/ea1.png")));
		btnEliminarAlumno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminarAlumno.setContentAreaFilled(false);
		btnEliminarAlumno.setBorderPainted(false);
		btnEliminarAlumno.setIcon(new ImageIcon(VConsultarAlumnos.class.getResource("/images/ea.png")));
		btnEliminarAlumno.setBounds(52, 494, 170, 44);
		add(btnEliminarAlumno);
		
		btnModificarAlumno = new JButton("");
		btnModificarAlumno.setRolloverIcon(new ImageIcon(VConsultarAlumnos.class.getResource("/images/ma1.png")));
		btnModificarAlumno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnModificarAlumno.setContentAreaFilled(false);
		btnModificarAlumno.setBorderPainted(false);
		btnModificarAlumno.setIcon(new ImageIcon(VConsultarAlumnos.class.getResource("/images/ma.png")));
		btnModificarAlumno.setBounds(346, 494, 170, 44);
		add(btnModificarAlumno);
		
	}
	
	public void setControlador(controlador c) {
		btnHome.addActionListener(c);
		btnEliminarAlumno.addActionListener(c);
		btnModificarAlumno.addActionListener(c);
		
	}

	public JButton getBtnHome() {
		return btnHome;
	}
	
	public JButton getBtnEliminarAlumno() {
		return btnEliminarAlumno;
	}

	public JButton getBtnModificarAlumno() {
		return btnModificarAlumno;
	}

	public JList<PojoAlumno> getJListAlum() {
		return JListAlum;
	}
	
	public PojoAlumno recogerDatos() throws NullPointerException {
		id = JListAlum.getSelectedValue().getId();
		expediente = JListAlum.getSelectedValue().getnExp();
		nombre = JListAlum.getSelectedValue().getNombre();
		primApe = JListAlum.getSelectedValue().getApellido1();
		segApe = JListAlum.getSelectedValue().getApellido2();
		
		PojoAlumno datos = new PojoAlumno(id, expediente, nombre, primApe, segApe);
		
		return datos;
	}
}
