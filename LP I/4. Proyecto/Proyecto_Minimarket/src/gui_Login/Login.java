package gui_Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;

import gui.frmPrincipal;


public class Login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnIngresar;
	private JPasswordField jpassClave;
	private JTextField txtUsuario;
	private JLabel lblNewLabel_3;

		
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/imagenes/usr.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 175);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.shadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setBackground(SystemColor.desktop);
		lblNewLabel.setBorder(null);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(119, 11, 326, 25);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(119, 67, 85, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Contraseña:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(119, 92, 95, 14);
		contentPane.add(lblNewLabel_2);
		
		txtUsuario = new JTextField();
		txtUsuario.setBorder(new LineBorder(SystemColor.windowText));
		txtUsuario.setBounds(224, 66, 109, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		btnIngresar = new JButton("INGRESAR");
		btnIngresar.setBorder(new LineBorder(SystemColor.windowText, 2));
		btnIngresar.setBackground(SystemColor.inactiveCaption);
		btnIngresar.addActionListener(this);
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnIngresar.setBounds(343, 67, 102, 32);
		contentPane.add(btnIngresar);
		
		jpassClave = new JPasswordField();
		jpassClave.setBorder(new LineBorder(SystemColor.windowText));
		jpassClave.setBounds(224, 91, 109, 20);
		contentPane.add(jpassClave);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(Login.class.getResource("/imagenes/usser.png")));
		lblNewLabel_3.setBounds(10, 0, 106, 137);
		contentPane.add(lblNewLabel_3);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnIngresar) {
			actionPerformedBtnIngresar(e);
		}
	}
	public void actionPerformedBtnIngresar(ActionEvent e) {
		char[]clave = jpassClave.getPassword();
		String claveFinal = new String(clave);
		
		if(txtUsuario.getText().equals("Luis") && claveFinal.equals("12345")) {
			dispose();
			JOptionPane.showMessageDialog(null,"Bienvenid@","INGRESASTE",
					JOptionPane.INFORMATION_MESSAGE);
			frmPrincipal q = new frmPrincipal();
			frmPrincipal.main(null);
		}else {
			JOptionPane.showMessageDialog(null,"Usuario o Contraseña incorrectos", "ERROR",
					JOptionPane.ERROR_MESSAGE);
			txtUsuario.setText("");
			jpassClave.setText("");
			txtUsuario.requestFocus();
			}
		}
	}

