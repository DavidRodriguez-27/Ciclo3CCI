import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class frmClientes1 extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmClientes1 frame = new frmClientes1();
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
	public frmClientes1() {
		setTitle("MANTENIMIENTO DE CLIENTES");
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 298, 256);

	}

}
