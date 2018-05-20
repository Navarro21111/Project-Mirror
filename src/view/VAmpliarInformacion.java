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

public class VAmpliarInformacion extends JDialog {
	private JTextField txtNombre;
	private String nombre;
	private String grupo;
	private int anyo;
	private String curso;
	private int nota;
	private String ciclo;
	private String URL;
	private JComboBox cbGrupo;
	private JSpinner jsAnyo;
	private JComboBox cbCurso;
	private JComboBox cbNota;
	private JComboBox <String> cbCiclo;
	private JTextField txtURL;
	private ArrayList<PojoAlumno> alumni;
	private JList<PojoAlumno> JListAlum;
	private JButton btnHome;

	
	public VAmpliarInformacion() {
		setAutoRequestFocus(false);
		setModal(true);
		setPreferredSize(new Dimension(964, 567));
		getContentPane().setBackground(new Color(44, 40, 41));
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setBounds(0, 0, 1110, 724);
		
		JLabel lblModificarProyecto = new JLabel("Modificar Proyecto");
		lblModificarProyecto.setForeground(Color.WHITE);
		lblModificarProyecto.setFont(new Font("Dialog", Font.BOLD, 35));
		lblModificarProyecto.setBounds(35, 64, 387, 66);
		getContentPane().add(lblModificarProyecto);
		
		JLabel label_1 = new JLabel("NOMBRE DEL PROYECTO:");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Dialog", Font.BOLD, 14));
		label_1.setBounds(35, 201, 207, 17);
		getContentPane().add(label_1);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(247, 200, 279, 20);
		getContentPane().add(txtNombre);
		
		JLabel label_2 = new JLabel("GRUPO:");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Dialog", Font.BOLD, 15));
		label_2.setBounds(35, 258, 67, 19);
		getContentPane().add(label_2);
		
		cbGrupo = new JComboBox();
		cbGrupo.setModel(new DefaultComboBoxModel(new String[] {"M11", "M12", "T11", "T12"}));
		cbGrupo.setBounds(114, 259, 86, 20);
		getContentPane().add(cbGrupo);
		
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
		
		cbCurso = new JComboBox();
		cbCurso.setModel(new DefaultComboBoxModel(new String[] {"1º", "2º", "3º", "4º", "5º"}));
		cbCurso.setBounds(117, 320, 86, 20);
		getContentPane().add(cbCurso);
		
		JLabel label_5 = new JLabel("NOTA:");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Dialog", Font.BOLD, 15));
		label_5.setBounds(259, 319, 54, 19);
		getContentPane().add(label_5);
		
		cbNota = new JComboBox();
		cbNota.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cbNota.setBounds(336, 320, 86, 20);
		getContentPane().add(cbNota);
		
		cbCiclo = new JComboBox();
		cbCiclo.setBounds(117, 379, 329, 20);
		getContentPane().add(cbCiclo);
		
		JLabel label_6 = new JLabel("CICLO:");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Dialog", Font.BOLD, 15));
		label_6.setBounds(35, 378, 374, 19);
		getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("URL GitHub:");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Dialog", Font.BOLD, 15));
		label_7.setBounds(35, 441, 105, 19);
		getContentPane().add(label_7);
		
		txtURL = new JTextField();
		txtURL.setColumns(10);
		txtURL.setBounds(187, 441, 339, 20);
		getContentPane().add(txtURL);
		
		jsAnyo = new JSpinner();
		jsAnyo.setModel(new SpinnerNumberModel(2018, 1900, 2018, 1));
		jsAnyo.setBounds(336, 258, 86, 20);
		getContentPane().add(jsAnyo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 4, 4);
		getContentPane().add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(571, 50, 445, 239);
		getContentPane().add(scrollPane_1);
		
		JListAlum = new JList();
		scrollPane_1.setViewportView(JListAlum);
		
		btnHome = new JButton("");
		btnHome.setIcon(new ImageIcon(VModificarProyectos.class.getResource("/images/Casitahome1.png")));
		btnHome.setContentAreaFilled(false);
		btnHome.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnHome.setBounds(1050, 4, 54, 55);
		getContentPane().add(btnHome);
		
		
	}
	
	public void setControlador(controlador c) {
		btnHome.addActionListener(c);
	}

	public JList<PojoAlumno> getJListAlum() {
		return JListAlum;
	}
}

