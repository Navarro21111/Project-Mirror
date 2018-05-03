package view;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class AltaProyectos extends JPanel {
	private JTextField txtAnyo;
	private JTextField txtNombre;
	private JTextField txtURL;
	public AltaProyectos() {
		setForeground(Color.WHITE);
		setBackground(new Color(44, 40, 41));
		
		JLabel lblNombreDelProyecto = new JLabel("NOMBRE DEL PROYECTO:");
		lblNombreDelProyecto.setBounds(47, 168, 207, 17);
		lblNombreDelProyecto.setFont(new Font("Century", Font.BOLD, 14));
		lblNombreDelProyecto.setForeground(Color.WHITE);
		
		JLabel lblCurso = new JLabel("CURSO:");
		lblCurso.setBounds(47, 263, 65, 19);
		lblCurso.setFont(new Font("Century", Font.BOLD, 15));
		lblCurso.setForeground(Color.WHITE);
		
		JLabel lblAo = new JLabel("A\u00D1O:");
		lblAo.setBounds(272, 218, 43, 19);
		lblAo.setFont(new Font("Century", Font.BOLD, 15));
		lblAo.setForeground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("NOTA:");
		lblNewLabel.setBounds(261, 263, 54, 19);
		lblNewLabel.setFont(new Font("Century", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.WHITE);
		
		JLabel lblGrupo = new JLabel("GRUPO:");
		lblGrupo.setBounds(47, 218, 67, 19);
		lblGrupo.setFont(new Font("Century", Font.BOLD, 15));
		lblGrupo.setForeground(Color.WHITE);
		
		JLabel lblCiclo = new JLabel("CICLO:");
		lblCiclo.setBounds(47, 308, 60, 19);
		lblCiclo.setFont(new Font("Century", Font.BOLD, 15));
		lblCiclo.setForeground(Color.WHITE);
		
		JLabel lblUrlGithub = new JLabel("URL GitHub:");
		lblUrlGithub.setBounds(47, 367, 105, 19);
		lblUrlGithub.setFont(new Font("Century", Font.BOLD, 15));
		lblUrlGithub.setForeground(Color.WHITE);
		
		JComboBox cbGrupo = new JComboBox();
		cbGrupo.setBounds(122, 219, 86, 20);
		
		JComboBox cbNota = new JComboBox();
		cbNota.setBounds(335, 264, 86, 20);
		
		txtAnyo = new JTextField();
		txtAnyo.setBounds(335, 217, 86, 20);
		txtAnyo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(264, 168, 279, 20);
		txtNombre.setColumns(10);
		setLayout(null);
		add(cbNota);
		add(txtAnyo);
		add(txtNombre);
		add(lblNombreDelProyecto);
		add(lblCurso);
		add(lblUrlGithub);
		add(lblCiclo);
		add(lblNewLabel);
		add(lblAo);
		add(lblGrupo);
		add(cbGrupo);
		
		txtURL = new JTextField();
		txtURL.setBounds(186, 368, 339, 20);
		add(txtURL);
		txtURL.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(122, 264, 86, 20);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(122, 309, 86, 20);
		add(comboBox_1);
		
		JButton btnAadirProyecto = new JButton("A\u00F1adir Proyecto");
		btnAadirProyecto.setBounds(175, 462, 237, 35);
		add(btnAadirProyecto);
		
		JLabel lblAltaProyecto = new JLabel("Alta Proyecto");
		lblAltaProyecto.setForeground(Color.WHITE);
		lblAltaProyecto.setFont(new Font("Century", Font.BOLD, 35));
		lblAltaProyecto.setBounds(47, 63, 315, 66);
		add(lblAltaProyecto);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\21724309.ALUMNOS\\Desktop\\Logos\\logoMirror2 copia 3.png"));
		label.setBounds(335, 63, 248, 61);
		add(label);
	}
}
