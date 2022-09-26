package vista;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.Producto;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class FrmRegCli extends JFrame {
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTextField txtApellido;
	private JTextField txtDNI;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmRegCli frame = new FrmRegCli();
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
	public FrmRegCli() {
		setBounds(100, 100, 506, 350);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("C\u00F3digo:");
		label.setBounds(30, 48, 75, 14);
		getContentPane().add(label);
		
		txtCodigo = new JTextField();
		txtCodigo.setText("");
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(88, 42, 86, 20);
		getContentPane().add(txtCodigo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(30, 105, 75, 14);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setText("");
		txtNombre.setColumns(10);
		txtNombre.setBounds(88, 102, 157, 20);
		getContentPane().add(txtNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(30, 130, 53, 14);
		getContentPane().add(lblApellido);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setBounds(30, 154, 60, 14);
		getContentPane().add(lblTelfono);
		
		txtTelefono = new JTextField();
		txtTelefono.setText("");
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(88, 151, 53, 20);
		getContentPane().add(txtTelefono);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(30, 179, 46, 14);
		getContentPane().add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setText("");
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(88, 176, 136, 20);
		getContentPane().add(txtCorreo);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(328, 28, 116, 34);
		getContentPane().add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar");		
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ingresar();
			}
		});
		btnGuardar.setBounds(328, 78, 116, 34);
		getContentPane().add(btnGuardar);
		
		JLabel lblMantenimientoDeProductos = new JLabel("Mantenimiento de Clientes");
		lblMantenimientoDeProductos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMantenimientoDeProductos.setBounds(21, 13, 224, 20);
		getContentPane().add(lblMantenimientoDeProductos);
		
		txtApellido = new JTextField();
		txtApellido.setText("");
		txtApellido.setColumns(10);
		txtApellido.setBounds(88, 127, 157, 20);
		getContentPane().add(txtApellido);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(30, 80, 75, 14);
		getContentPane().add(lblDni);
		
		txtDNI = new JTextField();
		txtDNI.setText("");
		txtDNI.setColumns(10);
		txtDNI.setBounds(88, 74, 86, 20);
		getContentPane().add(txtDNI);
	
	}

	
	void ingresar(){
		
		// -- validacion
		
	}
	
	
	
	
}
