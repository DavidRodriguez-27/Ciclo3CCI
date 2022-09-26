package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frame = new FrmPrincipal();
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
	public FrmPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnSistema = new JMenu("Sistema");
		menuBar.add(mnSistema);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnSistema.add(mntmSalir);
		
		JMenu mnMantenimientos = new JMenu("Mantenimientos");
		menuBar.add(mnMantenimientos);
		
		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mnMantenimientos.add(mntmClientes);
		
		JMenuItem mntmProductos = new JMenuItem("Productos");
		mnMantenimientos.add(mntmProductos);
		
		JMenu mnTransaccional = new JMenu("Transaccional");
		menuBar.add(mnTransaccional);
		
		JMenuItem mntmVentas = new JMenuItem("Ventas");
		mnTransaccional.add(mntmVentas);
		
		JMenu mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		
		JMenuItem mntmVentas_1 = new JMenuItem("Ventas");
		mnReportes.add(mntmVentas_1);
		
		JMenuItem mntmProductos_1 = new JMenuItem("Productos");
		mnReportes.add(mntmProductos_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
