package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class FrmBoleta extends JFrame {

	private JPanel contentPane;
	
	public static JTextField txtCodCliente;
	public static JTextField txtNomCompletoCliente;
	
	private JTextArea txtSalida;
	private JTextField txtFechaActual;
	private JButton btnNuevo;
	private JButton btnFinalizar;
	private JTextField txtTotal;
	private JTextField txtNumBoleta;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblProducto;
	private JTextField txtCodProducto;
	private JTextField txtDesProducto;
	private JTextField txtPreProducto;
	private JTextField txtStockProducto;
	private JTextField txtCantidadAComprar;
	private JButton btnAgregar;
	private JLabel lblCantidad;
	private JButton btnConsultarProducto;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmBoleta frame = new FrmBoleta();
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
	public FrmBoleta() {
		setTitle("Boleta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 460);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSalida = new JTextArea();
		txtSalida.setBounds(22, 249, 561, 114);
		contentPane.add(txtSalida);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(23, 387, 89, 23);
		contentPane.add(btnNuevo);
		
		btnFinalizar = new JButton("Finalizar Compra");		
		btnFinalizar.setBounds(137, 387, 144, 23);
		contentPane.add(btnFinalizar);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(494, 374, 86, 20);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(429, 377, 46, 14);
		contentPane.add(lblTotal);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(319, 25, 261, 105);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFecha_1 = new JLabel("Fecha:");
		lblFecha_1.setBounds(10, 56, 48, 14);
		panel.add(lblFecha_1);
		
		txtFechaActual = new JTextField();
		txtFechaActual.setEditable(false);
		txtFechaActual.setText("A\u00F1o/Mes/D\u00EDa");
		txtFechaActual.setBounds(68, 53, 97, 20);
		panel.add(txtFechaActual);
		txtFechaActual.setColumns(10);
		
		JLabel lblNm = new JLabel("N\u00FAm");
		lblNm.setBounds(10, 14, 33, 14);
		panel.add(lblNm);
		
		txtNumBoleta = new JTextField();
		txtNumBoleta.setEditable(false);
		txtNumBoleta.setText("B0000");
		txtNumBoleta.setColumns(10);
		txtNumBoleta.setBounds(68, 11, 162, 20);
		panel.add(txtNumBoleta);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Datos del Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(20, 34, 261, 96);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(10, 21, 70, 25);
		panel_1.add(lblCliente);
		
		txtCodCliente = new JTextField();
		txtCodCliente.setEditable(false);
		txtCodCliente.setBounds(67, 23, 97, 20);
		panel_1.add(txtCodCliente);
		txtCodCliente.setColumns(10);
		
		txtNomCompletoCliente = new JTextField();
		txtNomCompletoCliente.setEditable(false);
		txtNomCompletoCliente.setBounds(67, 54, 173, 20);
		panel_1.add(txtNomCompletoCliente);
		txtNomCompletoCliente.setColumns(10);
		
		JButton btnConsultarCliente = new JButton("");
		btnConsultarCliente.setBounds(184, 9, 37, 37);
		panel_1.add(btnConsultarCliente);
		btnConsultarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DlgCliente d = new DlgCliente();
				d.setVisible(true);
			}
		});
		btnConsultarCliente.setBorder(null);
		btnConsultarCliente.setBorderPainted(false);
		btnConsultarCliente.setContentAreaFilled(false);
		btnConsultarCliente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));		
		btnConsultarCliente.setIcon(new ImageIcon(FrmBoleta.class.getResource("/img/busca.png")));
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos del Producto", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(20, 141, 563, 96);
		contentPane.add(panel_2);
		
		lblProducto = new JLabel("Producto:");
		lblProducto.setBounds(10, 21, 70, 25);
		panel_2.add(lblProducto);
		
		txtCodProducto = new JTextField();
		txtCodProducto.setEditable(false);
		txtCodProducto.setText("P0001");
		txtCodProducto.setColumns(10);
		txtCodProducto.setBounds(87, 23, 86, 20);
		panel_2.add(txtCodProducto);
		
		txtCantidadAComprar = new JTextField();
		txtCantidadAComprar.setColumns(10);
		txtCantidadAComprar.setBounds(87, 54, 86, 20);
		panel_2.add(txtCantidadAComprar);
		
		btnAgregar = new JButton("");
		btnAgregar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAgregar.setRolloverIcon(new ImageIcon(FrmBoleta.class.getResource("/img/cartph.png")));
		btnAgregar.setIcon(new ImageIcon(FrmBoleta.class.getResource("/img/cartp.png")));
		btnAgregar.setContentAreaFilled(false);
		btnAgregar.setBorderPainted(false);
		btnAgregar.setBorder(null);
		btnAgregar.setBounds(183, 48, 37, 37);
		panel_2.add(btnAgregar);
		
		lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(10, 57, 70, 14);
		panel_2.add(lblCantidad);
		
		btnConsultarProducto = new JButton("");
		btnConsultarProducto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));		
		btnConsultarProducto.setIcon(new ImageIcon(FrmBoleta.class.getResource("/img/busca.png")));
		btnConsultarProducto.setContentAreaFilled(false);
		btnConsultarProducto.setBorderPainted(false);
		btnConsultarProducto.setBorder(null);
		btnConsultarProducto.setBounds(183, 9, 37, 37);
		panel_2.add(btnConsultarProducto);
		
		txtDesProducto = new JTextField();
		txtDesProducto.setEditable(false);
		txtDesProducto.setText("Panadol cj 10");
		txtDesProducto.setColumns(10);
		txtDesProducto.setBounds(235, 23, 143, 20);
		panel_2.add(txtDesProducto);
		
		txtPreProducto = new JTextField();
		txtPreProducto.setEditable(false);
		txtPreProducto.setText("1.85");
		txtPreProducto.setColumns(10);
		txtPreProducto.setBounds(387, 23, 70, 20);
		panel_2.add(txtPreProducto);
		
		txtStockProducto = new JTextField();
		txtStockProducto.setEditable(false);
		txtStockProducto.setText("20");
		txtStockProducto.setColumns(10);
		txtStockProducto.setBounds(471, 23, 70, 20);
		panel_2.add(txtStockProducto);
		
		JLabel lblAgregarProducto = new JLabel("Agregar producto ");
		lblAgregarProducto.setBounds(230, 57, 148, 14);
		panel_2.add(lblAgregarProducto);
		
		
	}

	private int obtenerCodVendedor() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int leerCodCliente() {
		// TODO Auto-generated method stub
		return Integer.parseInt(txtCodCliente.getText());
	}

	private String obtenerNumBoleta() {		
		// TODO Auto-generated method stub
		return null;
	}

	private String obtenerFecha() {
		// Obtener la fecha del sistema
		return new SimpleDateFormat("yyyy/MM/dd").format(new Date());
	}

	private int leerCantidad() {
		// TODO Auto-generated method stub
		return Integer.parseInt(txtCantidadAComprar.getText());
	}

	private int leerStock() {
		// TODO Auto-generated method stub
		return Integer.parseInt(txtStockProducto.getText());
	}

	private double leerPrecio() {
		// TODO Auto-generated method stub
		return Double.parseDouble(txtPreProducto.getText());
	}

	private String leerNomProd() {
		// TODO Auto-generated method stub
		return txtDesProducto.getText();
	}

	private String leerCodProd() {
		// TODO Auto-generated method stub
		return txtCodProducto.getText();
	}
}
