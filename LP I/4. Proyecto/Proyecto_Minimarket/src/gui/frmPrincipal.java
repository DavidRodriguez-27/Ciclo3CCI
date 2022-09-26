package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.SwingConstants;

public class frmPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuItem mntmNewMenuItem;
	
	
	private JDesktopPane escritorio;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem mntmNewMenuItem_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPrincipal frame = new frmPrincipal();
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
	public frmPrincipal() {
		setTitle("|| PRINCIPAL ||");
		setIconImage(Toolkit.getDefaultToolkit().getImage(frmPrincipal.class.getResource("/imagenes/7952185_box_up_package_pack_delivery_icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1230, 707);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("SALIR                    ");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu.setIcon(new ImageIcon(frmPrincipal.class.getResource("/imagenes/salir.png")));
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem_7 = new JMenuItem("Salir                 ");
		mntmNewMenuItem_7.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmNewMenuItem_7.addActionListener(this);
		mntmNewMenuItem_7.setIcon(new ImageIcon(frmPrincipal.class.getResource("/imagenes/salida.png")));
		mnNewMenu.add(mntmNewMenuItem_7);
		
		JMenu mnNewMenu_1 = new JMenu("TRANSACCION                   ");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu_1.setIcon(new ImageIcon(frmPrincipal.class.getResource("/imagenes/transacion.png")));
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem = new JMenuItem("Punto de Venta              ");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmNewMenuItem.setIcon(new ImageIcon(frmPrincipal.class.getResource("/imagenes/puntoventa.png")));
		mntmNewMenuItem.addActionListener(this);
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_2 = new JMenu("MANTENIMIENTO                   ");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu_2.setIcon(new ImageIcon(frmPrincipal.class.getResource("/imagenes/mantenimiento.png")));
		menuBar.add(mnNewMenu_2);
		
		mntmNewMenuItem_1 = new JMenuItem("Articulos                               ");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmNewMenuItem_1.setIcon(new ImageIcon(frmPrincipal.class.getResource("/imagenes/articulos.png")));
		mntmNewMenuItem_1.addActionListener(this);
		mnNewMenu_2.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Personal                           ");
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmNewMenuItem_2.setIcon(new ImageIcon(frmPrincipal.class.getResource("/imagenes/personal.png")));
		mntmNewMenuItem_2.addActionListener(this);
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_3 = new JMenuItem("Cliente                           ");
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmNewMenuItem_3.setIcon(new ImageIcon(frmPrincipal.class.getResource("/imagenes/clientes.png")));
		mntmNewMenuItem_3.addActionListener(this);
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_3 = new JMenu("CONSULTAS                                          ");
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu_3.setIcon(new ImageIcon(frmPrincipal.class.getResource("/imagenes/consultas.png")));
		menuBar.add(mnNewMenu_3);
		
		mntmNewMenuItem_4 = new JMenuItem("Consumo por Cliente          ");
		mntmNewMenuItem_4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmNewMenuItem_4.setIcon(new ImageIcon(frmPrincipal.class.getResource("/imagenes/consumoxcliente.png")));
		mntmNewMenuItem_4.addActionListener(this);
		mnNewMenu_3.add(mntmNewMenuItem_4);
		
		mntmNewMenuItem_5 = new JMenuItem("Ranking de Producto mas Vendido");
		mntmNewMenuItem_5.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmNewMenuItem_5.setIcon(new ImageIcon(frmPrincipal.class.getResource("/imagenes/producto+vendido.png")));
		mntmNewMenuItem_5.addActionListener(this);
		mnNewMenu_3.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_4 = new JMenu("REPORTES                           ");
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu_4.setIcon(new ImageIcon(frmPrincipal.class.getResource("/imagenes/reportes.png")));
		menuBar.add(mnNewMenu_4);
		
		mntmNewMenuItem_6 = new JMenuItem("Ventas                            ");
		mntmNewMenuItem_6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmNewMenuItem_6.setIcon(new ImageIcon(frmPrincipal.class.getResource("/imagenes/ventas.png")));
		mntmNewMenuItem_6.addActionListener(this);
		mnNewMenu_4.add(mntmNewMenuItem_6);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		
		try {
			escritorio = new JDesktopPane() {
				Image img = javax.imageio.ImageIO.read(
						new java.net.URL(getClass().getResource("/imagenes/PRODUCTOS.png"), "PRODUCTOS.png"));
				public void paintComponent(Graphics g) {
					super.paintComponent(g);
					if(img !=null) g.drawImage(img, 0,0,this.getWidth(),this.getHeight(),this);
					else g.drawString("Image not found", 100,100);
				}
			};
		}catch(IOException e) {e.printStackTrace();}
		
		contentPane.add(escritorio, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmNewMenuItem_7) {
			actionPerformedMntmNewMenuItem_7(e);
		}
		if (e.getSource() == mntmNewMenuItem_6) {
			actionPerformedMntmNewMenuItem_6(e);
		}
		if (e.getSource() == mntmNewMenuItem_5) {
			actionPerformedMntmNewMenuItem_5(e);
		}
		if (e.getSource() == mntmNewMenuItem_4) {
			actionPerformedMntmNewMenuItem_4(e);
		}
		if (e.getSource() == mntmNewMenuItem_3) {
			actionPerformedMntmNewMenuItem_3(e);
		}
		if (e.getSource() == mntmNewMenuItem_2) {
			actionPerformedMntmNewMenuItem_2(e);
		}
		if (e.getSource() == mntmNewMenuItem_1) {
			actionPerformedMntmNewMenuItem_1(e);
		}
		if (e.getSource() == mntmNewMenuItem) {
			actionPerformedMntmNewMenuItem(e);
		}
	}
	protected void actionPerformedMntmNewMenuItem(ActionEvent e) {
		frmPuntodeVenta frm = new frmPuntodeVenta();
		escritorio.add(frm);
		frm.setVisible(true);
		
		
	}
	protected void actionPerformedMntmNewMenuItem_1(ActionEvent e) {
		frmArticulos frm = new frmArticulos();
		escritorio.add(frm);
		frm.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_2(ActionEvent e) {
		frmPersonal frm = new frmPersonal();
		escritorio.add(frm);
		frm.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_3(ActionEvent e) {
		frmCliente frm = new frmCliente();
		escritorio.add(frm);
		frm.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_4(ActionEvent e) {
		frmConsumoporCliente frm = new frmConsumoporCliente();
		escritorio.add(frm);
		frm.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_5(ActionEvent e) {
		frmRankingProductoVendido frm = new frmRankingProductoVendido();
		escritorio.add(frm);
		frm.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_6(ActionEvent e) {
		frmVentas frm = new frmVentas();
		escritorio.add(frm);
		frm.setVisible(true);
	}

	public void SetVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	protected void actionPerformedMntmNewMenuItem_7(ActionEvent e) {
		dispose();
	}
}
