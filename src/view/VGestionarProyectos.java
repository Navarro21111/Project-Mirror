package view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import controlador.controlador;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JList;

import model.PojoAlumno;
import model.PojoProyecto;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.Cursor;

public class VGestionarProyectos extends JPanel {
	private JButton btnEliminarProyecto;
	private JButton btnAmpliarInformacin;
	private JButton btnModificarProyecto;
	private JButton btnHome;
	private JList<PojoProyecto> JListProyectos;
	private JTextField txtFiltro;
	private String nombre;
	private String grupo;
	private int anyo;
	private String curso;
	private int nota;
	private String ciclo;
	private String url;
	private int id;
	private JComboBox<String> cbFiltro;
	private JButton btnFiltrar;
	
	public VGestionarProyectos() {
		setBackground(new Color(44, 40, 41));
		setLayout(null);
		
		JLabel lblGestionarProyectos = new JLabel("Gestionar Proyectos");
		lblGestionarProyectos.setFont(new Font("Dialog", Font.PLAIN, 35));
		lblGestionarProyectos.setForeground(Color.WHITE);
		lblGestionarProyectos.setBounds(52, 0, 344, 53);
		add(lblGestionarProyectos);
		
		btnHome = new JButton("");
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setIcon(new ImageIcon(VGestionarProyectos.class.getResource("/images/Casitahome1.png")));
		btnHome.setContentAreaFilled(false);
		btnHome.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnHome.setBounds(540, 6, 54, 55);
		add(btnHome);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(52, 157, 489, 286);
		add(scrollPane);
		
		JListProyectos = new JList();
		scrollPane.setViewportView(JListProyectos);
		
		btnModificarProyecto = new JButton("Modificar Proyecto");
		btnModificarProyecto.setBounds(18, 483, 161, 41);
		add(btnModificarProyecto);
		
		btnEliminarProyecto = new JButton("Eliminar Proyecto");
		btnEliminarProyecto.setBounds(418, 483, 161, 41);
		add(btnEliminarProyecto);
		
		btnAmpliarInformacin = new JButton("Ampliar Información");
		btnAmpliarInformacin.setBounds(215, 483, 168, 41);
		add(btnAmpliarInformacin);
		
		cbFiltro = new JComboBox<String>();
		cbFiltro.setModel(new DefaultComboBoxModel<String>(new String[] {"Todos", "Nombre", "Ciclo", "Año", "Nota", "Grupo"}));
		cbFiltro.setBounds(44, 65, 150, 27);
		add(cbFiltro);
		
		txtFiltro = new JTextField();
		txtFiltro.setBounds(337, 65, 204, 26);
		add(txtFiltro);
		txtFiltro.setColumns(10);
		
		btnFiltrar = new JButton("Filtrar Proyectos");
		btnFiltrar.setBounds(184, 104, 168, 41);
		add(btnFiltrar);
		
		JLabel lblTextoParaFiltrar = new JLabel("Texto para filtrar:");
		lblTextoParaFiltrar.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblTextoParaFiltrar.setForeground(Color.WHITE);
		lblTextoParaFiltrar.setBounds(215, 69, 110, 16);
		add(lblTextoParaFiltrar);
	}
	
	public PojoProyecto recogerDatos() throws NullPointerException {
		id = JListProyectos.getSelectedValue().getId();
		nombre = JListProyectos.getSelectedValue().getNombre();
		grupo = JListProyectos.getSelectedValue().getGrupo();
		anyo = JListProyectos.getSelectedValue().getAnyo();
		curso = JListProyectos.getSelectedValue().getCurso();
		nota = JListProyectos.getSelectedValue().getNota();
		ciclo = JListProyectos.getSelectedValue().getCiclo();
		url = JListProyectos.getSelectedValue().getUrl();
		
		PojoProyecto datos = new PojoProyecto(id, nombre, grupo, anyo, curso, nota, ciclo, url);
		
		return datos;
	}
	
	public void setControlador(controlador c) {
		btnAmpliarInformacin.addActionListener(c);
		btnEliminarProyecto.addActionListener(c);
		btnModificarProyecto.addActionListener(c);
		btnHome.addActionListener(c);
		btnFiltrar.addActionListener(c);
	}
	
	public JButton getBtnEliminarProyecto() {
		return btnEliminarProyecto;
	}
	public JButton getBtnAmpliarInformacin() {
		return btnAmpliarInformacin;
	}
	public JButton getBtnModificarProyecto() {
		return btnModificarProyecto;
	}

	public JButton getBtnHome() {
		return btnHome;
	}

	public JList<PojoProyecto> getJListProyectos() {
		return JListProyectos;
	}

	public JTextField getTxtFiltro() {
		return txtFiltro;
	}

	public JComboBox<String> getCbFiltro() {
		return cbFiltro;
	}

	public JButton getBtnFiltrar() {
		return btnFiltrar;
	}
	
	public String recogerComboBox() {
		String seleccionado;
		
		seleccionado = cbFiltro.getSelectedItem().toString();
		
		return seleccionado;
		
	}
	
	public String recogerTxtFiltro() {
		String escrito;
		
		escrito = txtFiltro.getText();
		
		return escrito;
		
	}
}