package view;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import controlador.controlador;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.Dimension;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class VAltaProyecto extends JDialog {
	private JTextField txtNombre;
	private JTextField txtURL;
	private JButton btnHome;
	
	public VAltaProyecto() {
		setAutoRequestFocus(false);
		setModal(true);
		setPreferredSize(new Dimension(964, 567));
		getContentPane().setBackground(new Color(44, 40, 41));
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setBounds(0, 0, 963, 577);
		
		btnHome = new JButton("");
		btnHome.setIcon(new ImageIcon(VAltaProyecto.class.getResource("/images/Casitahome1.png")));
		btnHome.setContentAreaFilled(false);
		btnHome.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnHome.setBounds(904, 6, 54, 55);
		getContentPane().add(btnHome);
		
		JLabel label = new JLabel("Alta Proyecto");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dialog", Font.BOLD, 35));
		label.setBounds(35, 28, 315, 66);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("NOMBRE DEL PROYECTO:");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Dialog", Font.BOLD, 14));
		label_1.setBounds(42, 125, 207, 17);
		getContentPane().add(label_1);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(247, 124, 279, 20);
		getContentPane().add(txtNombre);
		
		JLabel label_2 = new JLabel("GRUPO:");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Dialog", Font.BOLD, 15));
		label_2.setBounds(42, 185, 67, 19);
		getContentPane().add(label_2);
		
		JComboBox cbGrupo = new JComboBox();
		cbGrupo.setModel(new DefaultComboBoxModel(new String[] {"M11", "M12", "T11", "T12"}));
		cbGrupo.setBounds(117, 186, 86, 20);
		getContentPane().add(cbGrupo);
		
		JLabel label_3 = new JLabel("AÑO:");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Dialog", Font.BOLD, 15));
		label_3.setBounds(259, 185, 43, 19);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("CURSO:");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Dialog", Font.BOLD, 15));
		label_4.setBounds(42, 246, 65, 19);
		getContentPane().add(label_4);
		
		JComboBox cbCurso = new JComboBox();
		cbCurso.setModel(new DefaultComboBoxModel(new String[] {"1º", "2º", "3º", "4º", "5º"}));
		cbCurso.setBounds(117, 247, 86, 20);
		getContentPane().add(cbCurso);
		
		JLabel label_5 = new JLabel("NOTA:");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Dialog", Font.BOLD, 15));
		label_5.setBounds(262, 246, 54, 19);
		getContentPane().add(label_5);
		
		JComboBox cbNota = new JComboBox();
		cbNota.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cbNota.setBounds(336, 247, 86, 20);
		getContentPane().add(cbNota);
		
		JComboBox cbCiclo = new JComboBox();
		cbCiclo.setBounds(117, 307, 329, 20);
		getContentPane().add(cbCiclo);
		
		JLabel label_6 = new JLabel("CICLO:");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Dialog", Font.BOLD, 15));
		label_6.setBounds(42, 306, 374, 19);
		getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("URL GitHub:");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Dialog", Font.BOLD, 15));
		label_7.setBounds(35, 372, 105, 19);
		getContentPane().add(label_7);
		
		txtURL = new JTextField();
		txtURL.setColumns(10);
		txtURL.setBounds(174, 373, 339, 20);
		getContentPane().add(txtURL);
		
		JScrollPane spAlumnos = new JScrollPane();
		spAlumnos.setBounds(577, 108, 365, 395);
		getContentPane().add(spAlumnos);
		
		JLabel lblSeleccionaLosAlumnos = new JLabel("Selecciona los alumnos que desee añadir:");
		lblSeleccionaLosAlumnos.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblSeleccionaLosAlumnos.setForeground(Color.WHITE);
		lblSeleccionaLosAlumnos.setBounds(577, 74, 339, 20);
		getContentPane().add(lblSeleccionaLosAlumnos);
		
		JSpinner jsAnyo = new JSpinner();
		jsAnyo.setModel(new SpinnerNumberModel(2018, 1900, 2018, 1));
		jsAnyo.setBounds(336, 186, 86, 20);
		getContentPane().add(jsAnyo);
		
		JButton btnCrearProyecto = new JButton("Crear Proyecto");
		btnCrearProyecto.setBounds(155, 435, 218, 48);
		getContentPane().add(btnCrearProyecto);
		
		
	}
	
	public void setControlador(controlador c) {
		btnHome.addActionListener(c);
	}
}
