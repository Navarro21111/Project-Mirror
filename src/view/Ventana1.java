package view;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
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

public class Ventana1 extends JFrame {

	public Ventana1(String titulo) throws HeadlessException {
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
		setBounds(180, 180, 1000, 600);
		
		setResizable(false);
		setTitle("Project Mirror");
		getContentPane().setBackground(new Color(44, 40, 41));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\21714768.ALUMNOS\\Desktop\\loguito.png"));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\21714768.ALUMNOS\\Desktop\\loguito2.png"));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(261)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(283, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(194)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(213, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(44, 40, 41));
		menuBar.setBorderPainted(false);
		setJMenuBar(menuBar);
		
		JMenu mnPi = new JMenu("P.I.");
		mnPi.setMaximumSize(new Dimension(100, 100));
		mnPi.setForeground(new Color(255, 255, 255));
		mnPi.setPreferredSize(new Dimension(200, 22));
		menuBar.add(mnPi);
		
		JMenuItem mntmConsultas = new JMenuItem("Consultas");
		mnPi.add(mntmConsultas);
		
		JMenuItem mntmAlta = new JMenuItem("Alta");
		mnPi.add(mntmAlta);
		
		JMenuItem mntmBaja = new JMenuItem("Baja");
		mnPi.add(mntmBaja);
		
		JMenuItem mntmModificacin = new JMenuItem("Modificación");
		mnPi.add(mntmModificacin);
		
		JMenuItem mntmAlumnos = new JMenuItem("Alumnos");
		mntmAlumnos.setMaximumSize(new Dimension(100, 100));
		mntmAlumnos.setForeground(new Color(255, 255, 255));
		mntmAlumnos.setBackground(new Color(44, 40, 41));
	

		menuBar.add(mntmAlumnos);
		
		JMenuItem mntmAreas = new JMenuItem("Áreas");
		mntmAreas.setMaximumSize(new Dimension(100, 100));
		mntmAreas.setForeground(new Color(255, 255, 255));
		mntmAreas.setBackground(new Color(44, 40, 41));
		menuBar.add(mntmAreas);
	}	
}
