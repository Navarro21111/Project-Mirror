package view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VRegistroAlumnos extends JPanel {
	private JTextField txt;
	private JTextField txtPrimApellido;
	private JTextField txtSegunApellido;
	private JTextField txtNExp;
	private JButton btnGuardarAlumno;

	public VRegistroAlumnos() {
		super();
		setBackground(new Color(44,40,41));
		setLayout(null);
		
		JLabel lblNDeExpediente = new JLabel("N\u00BA de Expediente");
		lblNDeExpediente.setHorizontalAlignment(SwingConstants.CENTER);
		lblNDeExpediente.setForeground(Color.WHITE);
		lblNDeExpediente.setFont(new Font("Century", Font.BOLD, 15));
		lblNDeExpediente.setBounds(10, 67, 160, 30);
		add(lblNDeExpediente);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Century", Font.BOLD, 15));
		lblNombre.setBounds(10, 165, 160, 30);
		add(lblNombre);
		
		JLabel lblPrimerApellido = new JLabel("Primer Apellido");
		lblPrimerApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimerApellido.setForeground(Color.WHITE);
		lblPrimerApellido.setFont(new Font("Century", Font.BOLD, 15));
		lblPrimerApellido.setBounds(10, 260, 160, 30);
		add(lblPrimerApellido);
		
		JLabel lblSegundoApellido = new JLabel("Segundo Apellido");
		lblSegundoApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblSegundoApellido.setForeground(Color.WHITE);
		lblSegundoApellido.setFont(new Font("Century", Font.BOLD, 15));
		lblSegundoApellido.setBounds(10, 356, 160, 30);
		add(lblSegundoApellido);
		
		txtNExp = new JTextField();
		txtNExp.setBounds(429, 69, 151, 30);
		add(txtNExp);
		txtNExp.setColumns(10);
		
		txt = new JTextField();
		txt.setBounds(429, 167, 151, 30);
		add(txt);
		txt.setColumns(10);
		
		txtPrimApellido = new JTextField();
		txtPrimApellido.setColumns(10);
		txtPrimApellido.setBounds(429, 262, 151, 30);
		add(txtPrimApellido);
		
		txtSegunApellido = new JTextField();
		txtSegunApellido.setColumns(10);
		txtSegunApellido.setBounds(429, 358, 151, 30);
		add(txtSegunApellido);
		
		btnGuardarAlumno = new JButton("Guardar Alumno");
		btnGuardarAlumno.setBounds(10, 440, 570, 67);
		add(btnGuardarAlumno);
		iniciaizar();
	}

	private void iniciaizar() {
		setSize(590,590);
		
	}
}
