package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class frmArticulos extends JInternalFrame {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtDescripcion;
	private JTextField txtUniMedida;
	private JTextField txtCantidad;
	private JTextField txtPrecio;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnAdicionar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmArticulos frame = new frmArticulos();
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
	public frmArticulos() {
		setFrameIcon(new ImageIcon(frmArticulos.class.getResource("/imagenes/articulos.png")));
		setTitle("MANTENIMIENTO || ARTICULOS");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Descripcion:");
		lblNewLabel.setBounds(10, 38, 105, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Unidad de Medida:");
		lblNewLabel_1.setBounds(10, 63, 105, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Cantidad:");
		lblNewLabel_2.setBounds(10, 88, 105, 14);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Precio:");
		lblNewLabel_3.setBounds(10, 113, 105, 14);
		getContentPane().add(lblNewLabel_3);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(125, 35, 105, 20);
		getContentPane().add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		txtUniMedida = new JTextField();
		txtUniMedida.setBounds(125, 60, 105, 20);
		getContentPane().add(txtUniMedida);
		txtUniMedida.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(125, 85, 105, 20);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(125, 110, 105, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 145, 414, 114);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnAdicionar = new JButton("ADICIONAR");
		btnAdicionar.setBounds(311, 34, 105, 23);
		getContentPane().add(btnAdicionar);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(311, 59, 105, 23);
		getContentPane().add(btnModificar);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(311, 84, 105, 23);
		getContentPane().add(btnEliminar);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(311, 109, 105, 23);
		getContentPane().add(btnCancelar);

	}
}
