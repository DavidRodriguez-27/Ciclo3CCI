import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class frmProveedores extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmProveedores frame = new frmProveedores();
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
	public frmProveedores() {
		setTitle("MANTENIMIENTO DE PROVEEDORES");
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 367, 253);

	}

}
