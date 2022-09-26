import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class frmClientes2 extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmClientes2 frame = new frmClientes2();
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
	public frmClientes2() {
		setTitle("MANTENIMIENTO DE CLIENTES ");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 271, 205);

	}

}
