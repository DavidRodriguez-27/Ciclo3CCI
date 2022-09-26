package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class frmVentas extends JInternalFrame {
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnGenerar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmVentas frame = new frmVentas();
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
	public frmVentas() {
		setFrameIcon(new ImageIcon(frmVentas.class.getResource("/imagenes/ventas.png")));
		setTitle("REPORTE || VENTAS");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 68, 414, 191);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnGenerar = new JButton("GENERAR");
		btnGenerar.setBounds(175, 23, 89, 23);
		getContentPane().add(btnGenerar);

	}

}
