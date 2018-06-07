package view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.xml.bind.ParseConversionEvent;

import controlador.controlador;
import model.PojoAlumno;

import javax.swing.ImageIcon;
import java.awt.Cursor;

public class VRegistroAlumnos extends JPanel {
	private JTextField txtNom;
	private JTextField txtPrimApellido;
	private JTextField txtSegunApellido;
	private JTextField txtNExp;
	private JButton btnGuardarAlumno;
	private JButton btnHome;
	private int expediente;
	private String nombre;
	private String primApe;
	private String segApe;

	public VRegistroAlumnos() {
		super();
		setBackground(new Color(44,40,41));
		setLayout(null);
		
		JLabel lblNDeExpediente = new JLabel("Nº de Expediente:");
		lblNDeExpediente.setHorizontalAlignment(SwingConstants.CENTER);
		lblNDeExpediente.setForeground(Color.WHITE);
		lblNDeExpediente.setFont(new Font("Century", Font.BOLD, 15));
		lblNDeExpediente.setBounds(62, 142, 160, 30);
		add(lblNDeExpediente);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Century", Font.BOLD, 15));
		lblNombre.setBounds(62, 209, 160, 30);
		add(lblNombre);
		
		JLabel lblPrimerApellido = new JLabel("Primer Apellido:");
		lblPrimerApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimerApellido.setForeground(Color.WHITE);
		lblPrimerApellido.setFont(new Font("Century", Font.BOLD, 15));
		lblPrimerApellido.setBounds(62, 283, 160, 30);
		add(lblPrimerApellido);
		
		JLabel lblSegundoApellido = new JLabel("Segundo Apellido:");
		lblSegundoApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblSegundoApellido.setForeground(Color.WHITE);
		lblSegundoApellido.setFont(new Font("Century", Font.BOLD, 15));
		lblSegundoApellido.setBounds(76, 362, 160, 30);
		add(lblSegundoApellido);
		
		txtNExp = new JTextField();
		txtNExp.setBounds(288, 143, 151, 30);
		add(txtNExp);
		txtNExp.setColumns(10);
		
		txtNom = new JTextField();
		txtNom.setBounds(288, 210, 151, 30);
		add(txtNom);
		txtNom.setColumns(10);
		
		txtPrimApellido = new JTextField();
		txtPrimApellido.setColumns(10);
		txtPrimApellido.setBounds(288, 284, 151, 30);
		add(txtPrimApellido);
		
		txtSegunApellido = new JTextField();
		txtSegunApellido.setColumns(10);
		txtSegunApellido.setBounds(288, 363, 151, 30);
		add(txtSegunApellido);
		
		btnGuardarAlumno = new JButton("");
		btnGuardarAlumno.setRolloverIcon(new ImageIcon(VRegistroAlumnos.class.getResource("/images/ga1.png")));
		btnGuardarAlumno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuardarAlumno.setContentAreaFilled(false);
		btnGuardarAlumno.setBorderPainted(false);
		btnGuardarAlumno.setIcon(new ImageIcon(VRegistroAlumnos.class.getResource("/images/ga.png")));
		btnGuardarAlumno.setBounds(119, 459, 310, 44);
		add(btnGuardarAlumno);
		
		btnHome = new JButton("");
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setContentAreaFilled(false);
		btnHome.setIcon(new ImageIcon(VRegistroAlumnos.class.getResource("/images/Casitahome1.png")));
		btnHome.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnHome.setBounds(526, 6, 54, 55);
		add(btnHome);
		
		JLabel lblAgregarAlumnos = new JLabel("Agregar Alumnos");
		lblAgregarAlumnos.setFont(new Font("Dialog", Font.PLAIN, 35));
		lblAgregarAlumnos.setForeground(Color.WHITE);
		lblAgregarAlumnos.setBounds(100, 55, 362, 55);
		add(lblAgregarAlumnos);
		iniciaizar();
	}

	private void iniciaizar() {
		setSize(590,590);
		
	}
	
	public PojoAlumno recogerDatos() throws NumberFormatException {
		expediente = Integer.parseInt(txtNExp.getText());
		nombre = txtNom.getText();
		primApe = txtPrimApellido.getText();
		segApe = txtSegunApellido.getText();
		
		PojoAlumno datos = new PojoAlumno(expediente, nombre, primApe, segApe);
		
		return datos;
	}

	public JButton getBtnGuardarAlumno() {
		return btnGuardarAlumno;
	}
	
	public void setControlador(controlador c) {
		btnGuardarAlumno.addActionListener(c);
		btnHome.addActionListener(c);
	}

	public JButton getBtnHome() {
		return btnHome;
	}
}
