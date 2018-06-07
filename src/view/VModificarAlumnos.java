package view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import controlador.controlador;
import model.PojoAlumno;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Cursor;

public class VModificarAlumnos extends JPanel {
	private JTextField txtExp;
	private JTextField txtNom;
	private JTextField txtAp1;
	private JTextField txtAp2;
	private JButton btnModificar;
	private JButton btnHome;
	private int expediente;
	private String nombre;
	private String primApe;
	private String segApe;
	
	public VModificarAlumnos() {
		setBackground(new Color(44, 40, 41));
		setLayout(null);
		
		JLabel lblModificarAlumnos = new JLabel("Modificar Alumnos");
		lblModificarAlumnos.setForeground(Color.WHITE);
		lblModificarAlumnos.setFont(new Font("Dialog", Font.PLAIN, 35));
		lblModificarAlumnos.setBounds(31, 41, 318, 119);
		add(lblModificarAlumnos);
		
		btnHome = new JButton("");
		btnHome.setIcon(new ImageIcon(VModificarAlumnos.class.getResource("/images/Casitahome1.png")));
		btnHome.setContentAreaFilled(false);
		btnHome.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnHome.setBounds(485, 41, 54, 55);
		add(btnHome);
		
		btnModificar = new JButton("");
		btnModificar.setRolloverIcon(new ImageIcon(VModificarAlumnos.class.getResource("/images/m1.png")));
		btnModificar.setContentAreaFilled(false);
		btnModificar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnModificar.setBorderPainted(false);
		btnModificar.setIcon(new ImageIcon(VModificarAlumnos.class.getResource("/images/m.png")));
		btnModificar.setBounds(249, 458, 122, 42);
		add(btnModificar);
		
		JLabel lblExpediente = new JLabel("Expediente:");
		lblExpediente.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblExpediente.setForeground(Color.WHITE);
		lblExpediente.setBounds(65, 189, 100, 21);
		add(lblExpediente);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNombre.setBounds(65, 263, 100, 21);
		add(lblNombre);
		
		JLabel lblPrimerApellido = new JLabel("Primer Apellido:");
		lblPrimerApellido.setForeground(Color.WHITE);
		lblPrimerApellido.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblPrimerApellido.setBounds(65, 335, 143, 21);
		add(lblPrimerApellido);
		
		JLabel lblSegundoApellido = new JLabel("Segundo Apellido:");
		lblSegundoApellido.setForeground(Color.WHITE);
		lblSegundoApellido.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblSegundoApellido.setBounds(65, 406, 143, 21);
		add(lblSegundoApellido);
		
		txtExp = new JTextField();
		txtExp.setBounds(219, 187, 187, 26);
		add(txtExp);
		txtExp.setColumns(10);
		
		txtNom = new JTextField();
		txtNom.setColumns(10);
		txtNom.setBounds(219, 261, 187, 26);
		add(txtNom);
		
		txtAp1 = new JTextField();
		txtAp1.setColumns(10);
		txtAp1.setBounds(219, 333, 187, 26);
		add(txtAp1);
		
		txtAp2 = new JTextField();
		txtAp2.setColumns(10);
		txtAp2.setBounds(219, 404, 187, 26);
		add(txtAp2);
	}
	
	public PojoAlumno recogerDatosMod() {
		expediente = Integer.parseInt(txtExp.getText());
		nombre = txtNom.getText();
		primApe = txtAp1.getText();
		segApe = txtAp2.getText();
		
		PojoAlumno datos = new PojoAlumno(expediente, nombre, primApe, segApe);
		
		return datos;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public JButton getButton() {
		return btnHome;
	}
	
	public void setControlador(controlador c) {
		btnModificar.addActionListener(c);
		btnHome.addActionListener(c);
	}
	
	public void blabla(PojoAlumno alumno) {
		txtExp.setText(alumno.getnExp() + "");
		txtNom.setText(alumno.getNombre());
		txtAp1.setText(alumno.getApellido1());
		txtAp2.setText(alumno.getApellido2());
	}
	
}
