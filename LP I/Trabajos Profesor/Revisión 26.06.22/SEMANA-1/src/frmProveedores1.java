import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class frmProveedores1 extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmProveedores1 frame = new frmProveedores1();
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
	public frmProveedores1() {
		setTitle("MANTENIMIENTO DE PROVEEDORES");
		setClosable(true);
		setIconifiable(true);
		setMaximizable(true);
		setBounds(100, 100, 341, 245);

	}

}
