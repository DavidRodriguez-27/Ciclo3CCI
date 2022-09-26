package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;

public class frmCliente extends JInternalFrame {
	private JTextField txtCantMontoCompra;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNombres;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtSexo;
	private JButton btnAdicionar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnCancelar;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCliente frame = new frmCliente();
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
	public frmCliente() {
		setFrameIcon(new ImageIcon(frmCliente.class.getResource("/imagenes/clientes.png")));
		setTitle("MANTENIMIENTO || CLIENTE");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		txtCantMontoCompra = new JTextField();
		txtCantMontoCompra.setColumns(10);
		txtCantMontoCompra.setBounds(142, 99, 143, 20);
		getContentPane().add(txtCantMontoCompra);
		
		lblNewLabel = new JLabel("Cant Monto Comprado:");
		lblNewLabel.setBounds(21, 105, 118, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Sexo:");
		lblNewLabel_1.setBounds(21, 80, 105, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Apellidos:");
		lblNewLabel_2.setBounds(21, 55, 105, 14);
		getContentPane().add(lblNewLabel_2);
		
		lblNombres = new JLabel("Nombres:");
		lblNombres.setBounds(21, 30, 105, 14);
		getContentPane().add(lblNombres);
		
		txtNombres = new JTextField();
		txtNombres.setColumns(10);
		txtNombres.setBounds(142, 24, 143, 20);
		getContentPane().add(txtNombres);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(142, 49, 143, 20);
		getContentPane().add(txtApellidos);
		
		txtSexo = new JTextField();
		txtSexo.setColumns(10);
		txtSexo.setBounds(142, 74, 143, 20);
		getContentPane().add(txtSexo);
		
		btnAdicionar = new JButton("ADICIONAR");
		btnAdicionar.setBounds(307, 24, 105, 23);
		getContentPane().add(btnAdicionar);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(307, 49, 105, 23);
		getContentPane().add(btnModificar);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(307, 74, 105, 23);
		getContentPane().add(btnEliminar);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(307, 99, 105, 23);
		getContentPane().add(btnCancelar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 134, 414, 125);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}

}
