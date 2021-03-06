package view;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

import controlador.controlador;

import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JMenu;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class VPrincipal extends JFrame {
	private JScrollPane spPanel;
	private JMenuItem mntmAlta;
	private JMenuItem mntmAadirAlumnos;
	private JMenuItem mntmGestionarAlumnos;
	private JPanel panel_1;
	private JLabel label_1;
	private JLabel lblFundadores;
	private JLabel lblJuanNotario;
	private JLabel lblMiguelSnchez;
	private JLabel lblSergioNavarro;
	private JMenu mnCiclos;
	private JMenuItem mntmAadirCiclos;
	private JMenuItem mntmGestionarCiclos;
	private JMenuItem mntmGestionarProyectos;
	private JMenuItem mntmRegistrarUsuario;

	public VPrincipal(String titulo) throws HeadlessException {
		super(titulo);
		
		inicializar();
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	private void inicializar() {
		try {
			UIManager.setLookAndFeel(
				UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 180, 600, 600);
		
		setResizable(false);
		setTitle("Project Mirror");
		getContentPane().setBackground(new Color(44, 40, 41));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\21714768.ALUMNOS\\Desktop\\loguito.png"));
		
		spPanel = new JScrollPane();
		spPanel.setBackground(new Color(44, 40, 41));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addComponent(spPanel, GroupLayout.PREFERRED_SIZE, 1078, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(spPanel, GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
		);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(44, 40, 41));
		spPanel.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(VPrincipal.class.getResource("/images/logoMirror.png")));
		label_1.setBounds(53, 168, 477, 153);
		panel_1.add(label_1);
		
		lblFundadores = new JLabel("Fundadores:");
		lblFundadores.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblFundadores.setForeground(Color.WHITE);
		lblFundadores.setBounds(17, 417, 99, 24);
		panel_1.add(lblFundadores);
		
		lblJuanNotario = new JLabel("Juan Notario");
		lblJuanNotario.setForeground(Color.WHITE);
		lblJuanNotario.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblJuanNotario.setBounds(33, 442, 99, 24);
		panel_1.add(lblJuanNotario);
		
		lblMiguelSnchez = new JLabel("Miguel Sánchez");
		lblMiguelSnchez.setForeground(Color.WHITE);
		lblMiguelSnchez.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblMiguelSnchez.setBounds(33, 471, 118, 24);
		panel_1.add(lblMiguelSnchez);
		
		lblSergioNavarro = new JLabel("Sergio Navarro");
		lblSergioNavarro.setForeground(Color.WHITE);
		lblSergioNavarro.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblSergioNavarro.setBounds(33, 496, 99, 24);
		panel_1.add(lblSergioNavarro);
		getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		menuBar.setBackground(Color.WHITE);
		menuBar.setBorderPainted(false);
		setJMenuBar(menuBar);
		
		JMenu mnProyectos = new JMenu("Proyectos");
		mnProyectos.setMaximumSize(new Dimension(100, 100));
		mnProyectos.setForeground(new Color(44, 40, 41));
		mnProyectos.setPreferredSize(new Dimension(200, 22));
		menuBar.add(mnProyectos);
		
		mntmAlta = new JMenuItem("Alta");
		mnProyectos.add(mntmAlta);
		
		mntmGestionarProyectos = new JMenuItem("Gestionar Proyectos");
		mnProyectos.add(mntmGestionarProyectos);
		
		JMenu mnAlumnos = new JMenu("Alumnos");
		mnAlumnos.setForeground(new Color(44, 40, 41));
		menuBar.add(mnAlumnos);
		
		mntmAadirAlumnos = new JMenuItem("Añadir Alumnos");
		mnAlumnos.add(mntmAadirAlumnos);
		
		mntmGestionarAlumnos = new JMenuItem("Gestionar Alumnos");
		mnAlumnos.add(mntmGestionarAlumnos);
		
		mnCiclos = new JMenu("Ciclos");
		menuBar.add(mnCiclos);
		
		mntmAadirCiclos = new JMenuItem("Añadir Ciclos");
		mnCiclos.add(mntmAadirCiclos);
		
		mntmGestionarCiclos = new JMenuItem("Gestionar Ciclos");
		mnCiclos.add(mntmGestionarCiclos);
		
		mntmRegistrarUsuario = new JMenuItem("Registrar Usuario");
		mntmRegistrarUsuario.setBackground(Color.WHITE);
		mntmRegistrarUsuario.setFocusable(true);
		mntmRegistrarUsuario.setForeground(new Color(44, 40, 41));
		menuBar.add(mntmRegistrarUsuario);
		
		setLocationRelativeTo(null);
	}
	
	public void setPanel(JPanel panel) {
		spPanel.setViewportView(panel);
	}
	
	public void setControlador(controlador c) {
		mntmAlta.addActionListener(c);
		mntmAadirAlumnos.addActionListener(c);
		mntmGestionarAlumnos.addActionListener(c);
		mntmAadirCiclos.addActionListener(c);
		mntmGestionarCiclos.addActionListener(c);
		mntmGestionarProyectos.addActionListener(c);
		mntmRegistrarUsuario.addActionListener(c);
		
	}

	public JMenuItem getMntmAlta() {
		return mntmAlta;
	}

	public JMenuItem getMntmAadirAlumnos() {
		return mntmAadirAlumnos;
	}
	
	public JMenuItem getMntmConsultarAlumnos() {
		return mntmGestionarAlumnos;
	}

	public JPanel getPanel1() {
		return panel_1;
	}

	public JMenuItem getMntmAadirCiclos() {
		return mntmAadirCiclos;
	}

	public JMenuItem getMntmGestionarCiclos() {
		return mntmGestionarCiclos;
	}

	public JMenuItem getMntmGestionarProyectos() {
		return mntmGestionarProyectos;
	}

	public JMenuItem getMntmRegistrarUsuario() {
		return mntmRegistrarUsuario;
	}
}