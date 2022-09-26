package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;

public class frmPersonal extends JInternalFrame {
	private JButton btnAdicionar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnCancelar;
	private JTextField txtCargo;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNombres;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtCodEmpleado;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPersonal frame = new frmPersonal();
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
	public frmPersonal() {
		setFrameIcon(new ImageIcon(frmPersonal.class.getResource("/imagenes/personal.png")));
		setTitle("MANTENIMIENTO || PERSONAL");
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		btnAdicionar = new JButton("ADICIONAR");
		btnAdicionar.setBounds(319, 24, 105, 23);
		getContentPane().add(btnAdicionar);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(319, 49, 105, 23);
		getContentPane().add(btnModificar);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(319, 74, 105, 23);
		getContentPane().add(btnEliminar);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(319, 99, 105, 23);
		getContentPane().add(btnCancelar);
		
		txtCargo = new JTextField();
		txtCargo.setColumns(10);
		txtCargo.setBounds(138, 102, 149, 20);
		getContentPane().add(txtCargo);
		
		lblNewLabel = new JLabel("Cargo:");
		lblNewLabel.setBounds(23, 105, 105, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Cod. Empleado:");
		lblNewLabel_1.setBounds(23, 80, 105, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Apellidos:");
		lblNewLabel_2.setBounds(23, 55, 105, 14);
		getContentPane().add(lblNewLabel_2);
		
		lblNombres = new JLabel("Nombres:");
		lblNombres.setBounds(23, 30, 105, 14);
		getContentPane().add(lblNombres);
		
		txtNombres = new JTextField();
		txtNombres.setColumns(10);
		txtNombres.setBounds(138, 27, 149, 20);
		getContentPane().add(txtNombres);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(138, 52, 149, 20);
		getContentPane().add(txtApellidos);
		
		txtCodEmpleado = new JTextField();
		txtCodEmpleado.setColumns(10);
		txtCodEmpleado.setBounds(138, 77, 149, 20);
		getContentPane().add(txtCodEmpleado);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 137, 414, 122);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}

}
