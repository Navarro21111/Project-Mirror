package view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import controlador.controlador;

import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class VMostrarCiclos extends JPanel {
	private JButton btnHome;
	private JButton btnMostrarCiclos;
	private JList JLMostrarCiclos;
	public VMostrarCiclos() {
		setBackground(new Color(44, 40, 41));
		setForeground(Color.WHITE);
		setLayout(null);
		
		JLabel lblMostrarCiclos = new JLabel("Mostrar Ciclos");
		lblMostrarCiclos.setFont(new Font("Dialog", Font.PLAIN, 35));
		lblMostrarCiclos.setForeground(Color.WHITE);
		lblMostrarCiclos.setBounds(147, 76, 352, 54);
		add(lblMostrarCiclos);
		
		btnHome = new JButton("");
		btnHome.setIcon(new ImageIcon(VMostrarCiclos.class.getResource("/images/Casitahome1.png")));
		btnHome.setContentAreaFilled(false);
		btnHome.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnHome.setBounds(511, 27, 54, 55);
		add(btnHome);
		
		btnMostrarCiclos = new JButton("Mostrar Ciclos");
		btnMostrarCiclos.setBounds(179, 178, 219, 47);
		add(btnMostrarCiclos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(61, 267, 485, 254);
		add(scrollPane);
		
		JLMostrarCiclos = new JList();
		scrollPane.setViewportView(JLMostrarCiclos);
	}
	
	public JButton getBtnHome() {
		return btnHome;
	}
	public JButton getBtnMostrarCiclos() {
		return btnMostrarCiclos;
	}
	
	public void setControlador(controlador c) {
		btnHome.addActionListener(c);
		btnMostrarCiclos.addActionListener(c);
	}

	public JList getJLMostrarCiclos() {
		return JLMostrarCiclos;
	}
}
