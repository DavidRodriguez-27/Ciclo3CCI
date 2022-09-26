import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class frmPregunta4 extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPregunta4 frame = new frmPregunta4();
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
	public frmPregunta4() {
		setTitle("MANTENIMIENTO PREGUNTA4");
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 343, 215);

	}

}
