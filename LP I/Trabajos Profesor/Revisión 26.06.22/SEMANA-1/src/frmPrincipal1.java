import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class frmPrincipal1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPrincipal1 window = new frmPrincipal1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmPrincipal1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 464, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JDesktopPane desktopPane = new JDesktopPane();
		frame.getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("SISTEMA");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnMantenimiento = new JMenu("MANTENIMIENTO");
		menuBar.add(mnMantenimiento);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Clientes");
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.SHIFT_MASK));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmClientes1 f = new frmClientes1();
				desktopPane.add(f);
				f.setVisible(true);
			}
		});
		mnMantenimiento.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Productos");
		mntmNewMenuItem_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.ALT_MASK));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					frmProductos1 p = new frmProductos1();
					desktopPane.add(p);
					p.setVisible(true);
			}
		});
		mnMantenimiento.add(mntmNewMenuItem_2);
		
		JSeparator separator = new JSeparator();
		mnMantenimiento.add(separator);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Proveedores");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmProveedores1 pr = new frmProveedores1();
				desktopPane.add(pr);
				pr.setVisible(true);
			}
		});
		mnMantenimiento.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Categorias");
		mnMantenimiento.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_1_1 = new JMenu("REPORTES");
		menuBar.add(mnNewMenu_1_1);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Ventas");
		mnNewMenu_1_1.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Inventario");
		mnNewMenu_1_1.add(mntmNewMenuItem_6);
	}
}
