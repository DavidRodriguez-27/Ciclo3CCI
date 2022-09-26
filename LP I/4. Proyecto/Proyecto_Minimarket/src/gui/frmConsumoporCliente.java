package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class frmConsumoporCliente extends JInternalFrame {
	private JLabel lblNewLabel;
	private JTextField textField;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmConsumoporCliente frame = new frmConsumoporCliente();
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
	public frmConsumoporCliente() {
		setFrameIcon(new ImageIcon(frmConsumoporCliente.class.getResource("/imagenes/consumoxcliente.png")));
		setTitle("CONSULTAS || CONSUMO POR CLIENTE");
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("DNI Cliente:");
		lblNewLabel.setBounds(10, 33, 86, 14);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(116, 30, 131, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 82, 414, 177);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(320, 29, 104, 23);
		getContentPane().add(btnBuscar);

	}
}
