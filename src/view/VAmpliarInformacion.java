package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.LineBorder;

import controlador.controlador;
import model.PojoAlumno;
import model.PojoProyecto;
import java.awt.Cursor;

public class VAmpliarInformacion extends JDialog {
	private String nombre;
	private String grupo;
	private int anyo;
	private String curso;
	private int nota;
	private String ciclo;
	private String URL;
	private ArrayList<PojoAlumno> alumni;
	private JButton btnHome;
	private JLabel lblNombre;
	private JLabel lblGrupo;
	private JLabel lblanyo;
	private JLabel lblCurso;
	private JLabel lblNota;
	private JLabel lblCiclo;
	private JLabel lblURL;
	private JList<PojoAlumno> JListAlum;

	
	public VAmpliarInformacion() {
		setAutoRequestFocus(false);
		setModal(true);
		setPreferredSize(new Dimension(964, 567));
		getContentPane().setBackground(new Color(44, 40, 41));
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setBounds(0, 0, 1110, 533);
		
		JLabel lblModificarProyecto = new JLabel("Información Proyecto");
		lblModificarProyecto.setForeground(Color.WHITE);
		lblModificarProyecto.setFont(new Font("Dialog", Font.BOLD, 35));
		lblModificarProyecto.setBounds(35, 64, 387, 66);
		getContentPane().add(lblModificarProyecto);
		
		JLabel label_1 = new JLabel("NOMBRE DEL PROYECTO:");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Dialog", Font.BOLD, 14));
		label_1.setBounds(35, 201, 207, 17);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("GRUPO:");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Dialog", Font.BOLD, 15));
		label_2.setBounds(35, 258, 67, 19);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("AÑO:");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Dialog", Font.BOLD, 15));
		label_3.setBounds(259, 258, 43, 19);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("CURSO:");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Dialog", Font.BOLD, 15));
		label_4.setBounds(35, 319, 65, 19);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("NOTA:");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Dialog", Font.BOLD, 15));
		label_5.setBounds(259, 319, 54, 19);
		getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("CICLO:");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Dialog", Font.BOLD, 15));
		label_6.setBounds(35, 378, 67, 19);
		getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("URL GitHub:");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Dialog", Font.BOLD, 15));
		label_7.setBounds(35, 441, 105, 19);
		getContentPane().add(label_7);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 4, 4);
		getContentPane().add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(571, 50, 445, 410);
		getContentPane().add(scrollPane_1);
		
		JListAlum = new JList<PojoAlumno>();
		JListAlum.setFont(new Font("Dialog", Font.PLAIN, 13));
		JListAlum.setBorder(null);
		JListAlum.setForeground(Color.BLACK);
		JListAlum.setBackground(Color.WHITE);
		scrollPane_1.setViewportView(JListAlum);
		
		btnHome = new JButton("");
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setIcon(new ImageIcon(VModificarProyectos.class.getResource("/images/Casitahome1.png")));
		btnHome.setContentAreaFilled(false);
		btnHome.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnHome.setBounds(1050, 4, 54, 55);
		getContentPane().add(btnHome);
		
		lblNombre = new JLabel("");
		lblNombre.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(254, 202, 272, 16);
		getContentPane().add(lblNombre);
		
		lblGrupo = new JLabel("");
		lblGrupo.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGrupo.setForeground(Color.WHITE);
		lblGrupo.setBounds(114, 260, 86, 16);
		getContentPane().add(lblGrupo);
		
		lblanyo = new JLabel("");
		lblanyo.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblanyo.setForeground(Color.WHITE);
		lblanyo.setBounds(329, 260, 93, 16);
		getContentPane().add(lblanyo);
		
		lblCurso = new JLabel("");
		lblCurso.setForeground(Color.WHITE);
		lblCurso.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblCurso.setBounds(105, 321, 95, 16);
		getContentPane().add(lblCurso);
		
		lblNota = new JLabel("");
		lblNota.setForeground(Color.WHITE);
		lblNota.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNota.setBounds(320, 321, 105, 16);
		getContentPane().add(lblNota);
		
		lblCiclo = new JLabel("");
		lblCiclo.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblCiclo.setForeground(Color.WHITE);
		lblCiclo.setBounds(102, 380, 328, 16);
		getContentPane().add(lblCiclo);
		
		lblURL = new JLabel("");
		lblURL.setForeground(Color.WHITE);
		lblURL.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblURL.setBounds(139, 443, 285, 16);
		getContentPane().add(lblURL);
		
		setLocationRelativeTo(null);
	}
	
	public void ponerDatos(PojoProyecto proyecto) {
		lblNombre.setText(proyecto.getNombre());	
		lblanyo.setText(proyecto.getAnyo() + "");
		lblCiclo.setText(proyecto.getCiclo());
		lblCurso.setText(proyecto.getCurso());
		lblGrupo.setText(proyecto.getGrupo());
		lblNota.setText(proyecto.getNota() + "");
		lblURL.setText(proyecto.getUrl());
	}
	
	public void setControlador(controlador c) {
		btnHome.addActionListener(c);
	}

	public JList<PojoAlumno> getJListAlum() {
		return JListAlum;
	}

	public JButton getBtnHome() {
		return btnHome;
	}
}

