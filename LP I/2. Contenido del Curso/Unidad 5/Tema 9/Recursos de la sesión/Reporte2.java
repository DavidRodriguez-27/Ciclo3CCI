package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reporte2 extends JFrame {

	private JPanel contentPane;
	private JTextArea txtS;
	private JComboBox cboTipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reporte2 frame = new Reporte2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Reporte2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblListadoDeUsuarios = new JLabel("Listado de Usuarios");
		lblListadoDeUsuarios.setBounds(24, 11, 194, 26);
		contentPane.add(lblListadoDeUsuarios);

		JButton btnReporte = new JButton("Reporte");
		btnReporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnReporte.setBounds(172, 236, 89, 23);
		contentPane.add(btnReporte);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 81, 414, 141);
		contentPane.add(scrollPane);

		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);

		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(10, 44, 46, 14);
		contentPane.add(lblTipo);

		cboTipo = new JComboBox();
		cboTipo.setBounds(66, 41, 157, 20);
		contentPane.add(cboTipo);

		
	}

}
