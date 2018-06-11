package view;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import controlador.controlador;
import model.PojoCiclo;
import model.PojoProyecto;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.Dimension;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import model.PojoAlumno;
import java.awt.Cursor;

public class VAltaProyecto extends JDialog {
	private JTextField txtNombre;
	private JButton btnHome;
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
	private JList<PojoAlumno> JListAlum;	
	private ArrayList<PojoAlumno> alumni;
	private JButton btnCrearProyecto;
	
	public VAltaProyecto() {
		setAutoRequestFocus(false);
		setModal(true);
		setPreferredSize(new Dimension(964, 567));
		getContentPane().setBackground(new Color(44, 40, 41));
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setBounds(0, 0, 964, 578);
		
		btnHome = new JButton("");
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		
		cbGrupo = new JComboBox();
		cbGrupo.setModel(new DefaultComboBoxModel(new String[] {"M11", "M12", "T11", "T12"}));
		cbGrupo.setBounds(117, 186, 86, 20);
		getContentPane().add(cbGrupo);
		
		JLabel label_3 = new JLabel("A�O:");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Dialog", Font.BOLD, 15));
		label_3.setBounds(259, 185, 43, 19);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("CURSO:");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Dialog", Font.BOLD, 15));
		label_4.setBounds(42, 246, 65, 19);
		getContentPane().add(label_4);
		
		cbCurso = new JComboBox();
		cbCurso.setModel(new DefaultComboBoxModel(new String[] {"1º", "2º", "3º", "4º", "5º"}));
		cbCurso.setBounds(117, 247, 86, 20);
		getContentPane().add(cbCurso);
		
		JLabel label_5 = new JLabel("NOTA:");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Dialog", Font.BOLD, 15));
		label_5.setBounds(262, 246, 54, 19);
		getContentPane().add(label_5);
		
		cbNota = new JComboBox();
		cbNota.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cbNota.setBounds(336, 247, 86, 20);
		getContentPane().add(cbNota);
		
		cbCiclo = new JComboBox();
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
		
		JListAlum = new JList();
		spAlumnos.setViewportView(JListAlum);
		
		JLabel lblSeleccionaLosAlumnos = new JLabel("Selecciona los alumnos que desee a�adir:");
		lblSeleccionaLosAlumnos.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblSeleccionaLosAlumnos.setForeground(Color.WHITE);
		lblSeleccionaLosAlumnos.setBounds(577, 74, 339, 20);
		getContentPane().add(lblSeleccionaLosAlumnos);
		
		jsAnyo = new JSpinner();
		jsAnyo.setModel(new SpinnerNumberModel(2018, 1900, 2018, 1));
		jsAnyo.setBounds(336, 186, 86, 20);
		getContentPane().add(jsAnyo);
		
		btnCrearProyecto = new JButton("");
		btnCrearProyecto.setContentAreaFilled(false);
		btnCrearProyecto.setOpaque(false);
		btnCrearProyecto.setBorderPainted(false);
		btnCrearProyecto.setRolloverIcon(new ImageIcon(VAltaProyecto.class.getResource("/images/cp1.png")));
		btnCrearProyecto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCrearProyecto.setIcon(new ImageIcon(VAltaProyecto.class.getResource("/images/cp.png")));
		btnCrearProyecto.setBounds(266, 419, 156, 47);
		getContentPane().add(btnCrearProyecto);
		
		setLocationRelativeTo(null);
	}
	
	public void setControlador(controlador c) {
		btnHome.addActionListener(c);
		btnCrearProyecto.addActionListener(c);
		
	}
	
	public void recogerDatos() {
		nombre = txtNombre.getText();
		grupo = (String) cbGrupo.getItemAt(cbGrupo.getSelectedIndex());
		
	}
	
	public void aadirComboBox(ArrayList<String> ciclos) {
		cbCiclo.removeAllItems();
		
		for (int i = 0; i < ciclos.size(); i++) {
			cbCiclo.addItem(ciclos.get(i));
		}
	}

	public JList<PojoAlumno> getJListAlum() {
		return JListAlum;
	}
	
	public PojoProyecto recogerDatosProyecto() throws NullPointerException {
		nombre = txtNombre.getText();
		grupo = (String) cbGrupo.getItemAt(cbGrupo.getSelectedIndex());
		curso = (String) cbCurso.getItemAt(cbCurso.getSelectedIndex());
		nota = Integer.parseInt((String) cbNota.getItemAt(cbNota.getSelectedIndex()));
		anyo = (int) jsAnyo.getValue();
		URL = txtURL.getText();
		ciclo = (String) cbCiclo.getItemAt(cbCiclo.getSelectedIndex());
		
		if (!(nombre.equals(""))) {
			PojoProyecto datosProject = new PojoProyecto(nombre, grupo, anyo, curso, nota, ciclo, URL);
			return datosProject;
		} 
			
		
		
		
		return null;
	}
	
	public ArrayList<PojoAlumno> recogerAlumnosProyecto() {
		alumni = new ArrayList<>();
		List<PojoAlumno> seleccionado = JListAlum.getSelectedValuesList();
		
		for (int i = 0; i < seleccionado.size(); i++) {
			alumni.add((PojoAlumno) seleccionado.get(i));
		}
		
		return alumni;
	}

	public JButton getBtnCrearProyecto() {
		return btnCrearProyecto;
	}

	public JButton getBtnHome() {
		return btnHome;
	}
}
