import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class frmPregunta3 extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPregunta3 frame = new frmPregunta3();
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
	public frmPregunta3() {
		setTitle("MANTENIMIENTO PREGUNTA3");
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 316, 245);

	}

}
