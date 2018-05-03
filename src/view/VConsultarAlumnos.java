package view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;

public class VConsultarAlumnos extends JPanel {
	public VConsultarAlumnos() {
		setBackground(new Color(44, 40, 41));
		setLayout(null);
		
		JLabel lblConsultarAlumnos = new JLabel("Consultar Alumnos");
		lblConsultarAlumnos.setForeground(Color.WHITE);
		lblConsultarAlumnos.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		lblConsultarAlumnos.setBounds(72, 6, 463, 118);
		add(lblConsultarAlumnos);
		
		JButton btnMostrarAlumnos = new JButton("Mostrar Alumnos");
		btnMostrarAlumnos.setBounds(191, 136, 204, 36);
		add(btnMostrarAlumnos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(85, 245, 445, 237);
		add(scrollPane);
		
		JList list = new JList();
		list.setBounds(85, 245, 441, 237);
		add(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
	}
}
