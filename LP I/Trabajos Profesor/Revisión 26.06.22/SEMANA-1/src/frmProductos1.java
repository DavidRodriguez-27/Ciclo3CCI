import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class frmProductos1 extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmProductos1 frame = new frmProductos1();
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
	public frmProductos1() {
		setTitle("MANTENIMIENTO DE PRODUCTOS");
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 327, 262);

	}

}
