package Tienda;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class frmPrincipal {

	private JFrame frmMenuPrincipalTienda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPrincipal window = new frmPrincipal();
					window.frmMenuPrincipalTienda.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenuPrincipalTienda = new JFrame();
		frmMenuPrincipalTienda.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jcardero\\OneDrive - NTT DATA EMEAL\\Escritorio\\Nueva carpeta\\Tienda\\iconos\\3558102_food_noodles_shop_store_street_icon(1).png"));
		frmMenuPrincipalTienda.setTitle("MENU PRINCIPAL TIENDA");
		frmMenuPrincipalTienda.setBounds(100, 100, 690, 557);
		frmMenuPrincipalTienda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenuPrincipalTienda.getContentPane().setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 676, 498);
		frmMenuPrincipalTienda.getContentPane().add(desktopPane);
		
		JMenuBar menuBar = new JMenuBar();
		frmMenuPrincipalTienda.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Mantenimiento");
		mnNewMenu.setIcon(new ImageIcon("C:\\Users\\jcardero\\OneDrive - NTT DATA EMEAL\\Escritorio\\Nueva carpeta\\Tienda\\iconos\\3668833_maintenance_repair_service_icon (2).png"));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cliente");
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\jcardero\\OneDrive - NTT DATA EMEAL\\Escritorio\\Nueva carpeta\\Tienda\\iconos\\8726224_shopping_cart_icon.png"));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCliente f = new frmCliente();
				desktopPane.add(f);
				f.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Registro");
		mnNewMenu_1.setIcon(new ImageIcon("C:\\Users\\jcardero\\OneDrive - NTT DATA EMEAL\\Escritorio\\Nueva carpeta\\Tienda\\iconos\\7324066_ui_interface_check in_calendar_schedule_icon.png"));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Venta");
		mntmNewMenuItem_1.setIcon(new ImageIcon("C:\\Users\\jcardero\\OneDrive - NTT DATA EMEAL\\Escritorio\\Nueva carpeta\\Tienda\\iconos\\3387306_label_price_sale_tag_icon.png"));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmVenta v = new frmVenta();
				desktopPane.add(v);
				v.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
	}
}
