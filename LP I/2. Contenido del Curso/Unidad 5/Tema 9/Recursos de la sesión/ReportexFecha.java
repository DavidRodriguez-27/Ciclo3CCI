package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class ReportexFecha extends JFrame {

	private JPanel contentPane;
	private JTextArea txtS;
	private JDateChooser txtFecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReportexFecha frame = new ReportexFecha();
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
	public ReportexFecha() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblReportePorFecha = new JLabel("Reporte por Fecha - Prestamos");
		lblReportePorFecha.setBounds(10, 23, 216, 30);
		contentPane.add(lblReportePorFecha);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 93, 414, 126);
		contentPane.add(txtS);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			}
		});
		btnConsultar.setBounds(174, 230, 89, 23);
		contentPane.add(btnConsultar);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(10, 64, 46, 14);
		contentPane.add(lblFecha);
		
		txtFecha = new JDateChooser();
		txtFecha.setBounds(51, 62, 95, 20);
		contentPane.add(txtFecha);
	}
	
	
}
