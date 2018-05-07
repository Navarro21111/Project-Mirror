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
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;

public class VPrincipal extends JFrame {
	private JScrollPane spPanel;
	private JMenuItem mntmConsultas;
	private JMenuItem mntmAlta;
	private JMenuItem mntmBaja;
	private JMenuItem mntmModificacin;
	private JMenuItem mntmAadirAlumnos;
	private JMenuItem mntmEliminarAlumnos;
	private JPanel panel_1;
	private JLabel label_1;
	private JLabel lblFundadores;
	private JLabel lblJuanNotario;
	private JLabel lblMiguelSnchez;
	private JLabel lblSergioNavarro;
	private JMenuItem mntmEliminarAlumnos_1;
	private JMenu mnCiclos;
	private JMenuItem mntmAadirCiclos;
	private JMenuItem mntmConsultarCiclos;
	private JMenuItem mntmEliminarCiclos;

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
		lblMiguelSnchez.setBounds(33, 471, 99, 24);
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
		
		mntmConsultas = new JMenuItem("Consultas");
		mnProyectos.add(mntmConsultas);
		
		mntmAlta = new JMenuItem("Alta");
		mnProyectos.add(mntmAlta);
		
		mntmBaja = new JMenuItem("Baja");
		mnProyectos.add(mntmBaja);
		
		mntmModificacin = new JMenuItem("Modificación");
		mnProyectos.add(mntmModificacin);
		
		JMenu mnAlumnos = new JMenu("Alumnos");
		mnAlumnos.setForeground(new Color(44, 40, 41));
		menuBar.add(mnAlumnos);
		
		mntmAadirAlumnos = new JMenuItem("Añadir Alumnos");
		mnAlumnos.add(mntmAadirAlumnos);
		
		mntmEliminarAlumnos_1 = new JMenuItem("Eliminar Alumnos");
		mnAlumnos.add(mntmEliminarAlumnos_1);
		
		mntmEliminarAlumnos = new JMenuItem("Consultar Alumnos");
		mnAlumnos.add(mntmEliminarAlumnos);
		
		JMenuItem mntmModificarAlumnos = new JMenuItem("Modificar Alumnos");
		mnAlumnos.add(mntmModificarAlumnos);
		
		mnCiclos = new JMenu("Ciclos");
		menuBar.add(mnCiclos);
		
		mntmAadirCiclos = new JMenuItem("Añadir Ciclos");
		mnCiclos.add(mntmAadirCiclos);
		
		mntmConsultarCiclos = new JMenuItem("Consultar Ciclos");
		mnCiclos.add(mntmConsultarCiclos);
		
		mntmEliminarCiclos = new JMenuItem("Eliminar Ciclos");
		mnCiclos.add(mntmEliminarCiclos);
	}
	
	public void setPanel(JPanel panel) {
		spPanel.setViewportView(panel);
	}
	
	public void setControlador(controlador c) {
		mntmAlta.addActionListener(c);
		mntmBaja.addActionListener(c);
		mntmConsultas.addActionListener(c);
		mntmAadirAlumnos.addActionListener(c);
		mntmEliminarAlumnos.addActionListener(c);
		mntmAadirCiclos.addActionListener(c);
		mntmConsultarCiclos.addActionListener(c);
		mntmEliminarCiclos.addActionListener(c);
		
	}

	public JMenuItem getMntmConsultas() {
		return mntmConsultas;
	}

	public JMenuItem getMntmAlta() {
		return mntmAlta;
	}

	public JMenuItem getMntmBaja() {
		return mntmBaja;
	}

	public JMenuItem getMntmModificacin() {
		return mntmModificacin;
	}

	public JMenuItem getMntmAadirAlumnos() {
		return mntmAadirAlumnos;
	}
	
	public JMenuItem getMntmConsultarAlumnos() {
		return mntmEliminarAlumnos;
	}

	public JPanel getPanel1() {
		return panel_1;
	}

	public JMenuItem getMntmAadirCiclos() {
		return mntmAadirCiclos;
	}

	public JMenuItem getMntmConsultarCiclos() {
		return mntmConsultarCiclos;
	}

	public JMenuItem getMntmEliminarCiclos() {
		return mntmEliminarCiclos;
	}
}
