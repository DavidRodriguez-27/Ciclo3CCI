package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmAcceso extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtClave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmAcceso frame = new FrmAcceso();
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
	public FrmAcceso() {
		setTitle("CIBERFARMA - Acceso al Sistema");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 228);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsuario.setBounds(158, 35, 91, 27);
		contentPane.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(259, 35, 142, 27);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblClave = new JLabel("Clave:");
		lblClave.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblClave.setBounds(158, 80, 91, 27);
		contentPane.add(lblClave);
		
		txtClave = new JPasswordField();
		txtClave.setBounds(259, 80, 142, 27);
		contentPane.add(txtClave);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnIngresar.setBounds(158, 144, 89, 23);
		contentPane.add(btnIngresar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(297, 144, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(FrmAcceso.class.getResource("/img/avatar.png")));
		label.setBounds(0, 0, 171, 236);
		contentPane.add(label);
	}
	

	private void aviso(String msg) {
		JOptionPane.showMessageDialog(null, msg);		
	}

	private String leerClave() {		
		return txtClave.getText();
	}

	private String leerUsuario() {
		return txtUsuario.getText();
	}
}
