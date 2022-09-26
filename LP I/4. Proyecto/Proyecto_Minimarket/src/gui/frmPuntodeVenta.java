package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class frmPuntodeVenta extends JInternalFrame {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtCodPro;
	private JTextField txtDni;
	private JTextField txtCantidad;
	private JButton btnAdicionar;
	private JButton btnEliminar;
	private JButton btnCancelar;
	private JButton btnModificar;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPuntodeVenta frame = new frmPuntodeVenta();
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
	public frmPuntodeVenta() {
		setFrameIcon(new ImageIcon(frmPuntodeVenta.class.getResource("/imagenes/puntoventa.png")));
		setTitle("TRANSACCION || PUNTO DE VENTAS");
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 610, 385);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Cod de Producto:");
		lblNewLabel.setBounds(29, 51, 100, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("DNI:");
		lblNewLabel_1.setBounds(29, 77, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Cantidad:");
		lblNewLabel_2.setBounds(29, 102, 100, 14);
		getContentPane().add(lblNewLabel_2);
		
		txtCodPro = new JTextField();
		txtCodPro.setBounds(139, 48, 127, 20);
		getContentPane().add(txtCodPro);
		txtCodPro.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.setBounds(139, 74, 127, 20);
		getContentPane().add(txtDni);
		txtDni.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(139, 99, 127, 20);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnAdicionar = new JButton("ADICIONAR");
		btnAdicionar.setBounds(340, 47, 100, 23);
		getContentPane().add(btnAdicionar);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(462, 47, 100, 23);
		getContentPane().add(btnEliminar);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(462, 98, 100, 23);
		getContentPane().add(btnCancelar);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(340, 98, 100, 23);
		getContentPane().add(btnModificar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 149, 574, 195);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}
}
