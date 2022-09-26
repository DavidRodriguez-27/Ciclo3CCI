package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class FrmListado extends JFrame {

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
					FrmListado frame = new FrmListado();
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
	public FrmListado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 298);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListadoDeUsuarios = new JLabel("Listado de Usuarios");
		lblListadoDeUsuarios.setBounds(22, 11, 183, 24);
		contentPane.add(lblListadoDeUsuarios);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 73, 414, 133);
		contentPane.add(txtS);
		
		JButton btnListado = new JButton("Listado");
		btnListado.setBounds(156, 226, 89, 23);
		contentPane.add(btnListado);
		
		JLabel lblTipo = new JLabel("Tipo : ");
		lblTipo.setBounds(10, 46, 46, 14);
		contentPane.add(lblTipo);
		
		cboTipo = new JComboBox();
		cboTipo.setBounds(76, 42, 129, 20);
		contentPane.add(cboTipo);
		
	}

	void listado(){
		
	}

	private int leerTipo() {
		// validacion
		return cboTipo.getSelectedIndex();
	}
}


