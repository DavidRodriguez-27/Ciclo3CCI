package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class frmRankingProductoVendido extends JInternalFrame {
	private JLabel lblNewLabel;
	private JTextField txtCodProducto;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmRankingProductoVendido frame = new frmRankingProductoVendido();
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
	public frmRankingProductoVendido() {
		setFrameIcon(new ImageIcon(frmRankingProductoVendido.class.getResource("/imagenes/producto+vendido.png")));
		setTitle("CONSULTAS || RANKING PRODUCTO MAS VENDIDO");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Cod. Producto");
		lblNewLabel.setBounds(10, 33, 86, 14);
		getContentPane().add(lblNewLabel);
		
		txtCodProducto = new JTextField();
		txtCodProducto.setBounds(121, 30, 131, 20);
		getContentPane().add(txtCodProducto);
		txtCodProducto.setColumns(10);
		
		btnNewButton = new JButton("BUSCAR");
		btnNewButton.setBounds(320, 29, 104, 23);
		getContentPane().add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 80, 414, 179);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

	}

}
