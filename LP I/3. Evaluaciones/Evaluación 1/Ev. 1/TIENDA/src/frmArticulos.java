import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTable;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class frmArticulos extends JInternalFrame {
	private JTable tabla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmArticulos frame = new frmArticulos();
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
	public frmArticulos() {
		setTitle("MANTENIMIENTO DE ARTICULOS");
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 310, 211);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 278, 162);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre de Articulo", "Fecha de Registro", "Cantidad de días x durar"
			}
		));
		scrollPane.setViewportView(table);
		
		
		

	}
	
	
	private String [][] datos= {
								{"1", "Fernando", "Castillo", "Ecuador"},
								{"2", "David", "Rodriguez", "Perú"}
								};
	
	private String [] cabezera= {"numeros", "nombres", "apellidos", "nacionalidad"};
	private JTable table;
}
