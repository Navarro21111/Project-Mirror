package view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import controlador.controlador;
import model.PojoAlumno;
import model.PojoCiclo;

import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class VMostrarCiclos extends JPanel {
	private JButton btnHome;
	private JScrollPane scrollPane;
	private JList<PojoCiclo> JLMostrarCiclos;
	private JButton btnEliminarCiclo;
	private String nombre;
	private String descripcion;
	private int id;
	private JButton btnModificarCiclo;
	
	public VMostrarCiclos() {
		setBackground(new Color(44, 40, 41));
		setForeground(Color.WHITE);
		setLayout(null);
		
		JLabel lblMostrarCiclos = new JLabel("Gestionar Ciclos");
		lblMostrarCiclos.setFont(new Font("Dialog", Font.PLAIN, 35));
		lblMostrarCiclos.setForeground(Color.WHITE);
		lblMostrarCiclos.setBounds(152, 47, 352, 54);
		add(lblMostrarCiclos);
		
		btnHome = new JButton("");
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setIcon(new ImageIcon(VMostrarCiclos.class.getResource("/images/Casitahome1.png")));
		btnHome.setContentAreaFilled(false);
		btnHome.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnHome.setBounds(511, 27, 54, 55);
		add(btnHome);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(52, 208, 499, 235);
		add(scrollPane);
		
		JLMostrarCiclos = new JList();
		scrollPane.setViewportView(JLMostrarCiclos);
		
		btnEliminarCiclo = new JButton("");
		btnEliminarCiclo.setRolloverIcon(new ImageIcon(VMostrarCiclos.class.getResource("/images/ec1.png")));
		btnEliminarCiclo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminarCiclo.setContentAreaFilled(false);
		btnEliminarCiclo.setBorderPainted(false);
		btnEliminarCiclo.setIcon(new ImageIcon(VMostrarCiclos.class.getResource("/images/ec.png")));
		btnEliminarCiclo.setBounds(71, 485, 188, 38);
		add(btnEliminarCiclo);
		
		btnModificarCiclo = new JButton("");
		btnModificarCiclo.setRolloverIcon(new ImageIcon(VMostrarCiclos.class.getResource("/images/mc1.png")));
		btnModificarCiclo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnModificarCiclo.setContentAreaFilled(false);
		btnModificarCiclo.setBorderPainted(false);
		btnModificarCiclo.setIcon(new ImageIcon(VMostrarCiclos.class.getResource("/images/mc.png")));
		btnModificarCiclo.setBounds(328, 485, 188, 38);
		add(btnModificarCiclo);
	}
	
	public JButton getBtnHome() {
		return btnHome;
	}
	
	public JButton getBtnEliminarCiclo() {
		return btnEliminarCiclo;
	}

	public JButton getBtnModificarCiclo() {
		return btnModificarCiclo;
	}

	public void setControlador(controlador c) {
		btnHome.addActionListener(c);
		btnEliminarCiclo.addActionListener(c);
		btnModificarCiclo.addActionListener(c);
	}

	public JList<PojoCiclo> getJLMostrarCiclos() {
		return JLMostrarCiclos;
	}
	
	public PojoCiclo recogerDatos() throws NullPointerException {
		nombre = JLMostrarCiclos.getSelectedValue().getNombre();
		descripcion = JLMostrarCiclos.getSelectedValue().getDescripcion();
		id = JLMostrarCiclos.getSelectedValue().getId();
		
		PojoCiclo datos = new PojoCiclo(id, nombre, descripcion);
		
		return datos;
	}
}
