package Tienda;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

public class frmVenta extends JInternalFrame {
	private JTextField txt_idVenta;
	private JTextField txt_idCliente;
	private JTextField txt_Total;
	private JTable table;
	private JComboBox cbo_nombre;
	private Connection conexion;
	DefaultTableModel dfm =new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	
	
	private void Mostrar_grid() {
		try {
			int filas = table.getRowCount();
            for (int i = 0;filas>i; i++) {
                dfm.removeRow(0);
            }
			final String consulta = "select * from Venta";
			ResultSet rs = null;
			Statement sentencia = conexion.createStatement();
			rs = sentencia.executeQuery(consulta);
			
			while(rs.next())
				dfm.addRow(new Object[] {rs.getString("idventa"),rs.getString("idcliente"),rs.getString("total")});
		}catch(Exception e){
			e.getStackTrace();
			JOptionPane.showMessageDialog(null,"Error al mostrar desde BD");}
	}
	
	private void Registrar_venta() {
		try {
			final String consulta = "insert into Venta (idventa,idcliente,total) values (?,?,?)";
			PreparedStatement sentencia = conexion.prepareStatement(consulta);
			
			sentencia.setString(1,txt_idCliente.getText());
			sentencia.setString(2,txt_idVenta.getText());
			sentencia.setString(3,txt_Total.getText());			
			sentencia.executeUpdate();
			Mostrar_grid();
		}catch(Exception e){
			e.getStackTrace();
			JOptionPane.showMessageDialog(null,"Error al enviar a BD");}
	}
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmVenta frame = new frmVenta();
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
	public frmVenta() {
		setFrameIcon(new ImageIcon("C:\\Users\\jcardero\\OneDrive - NTT DATA EMEAL\\Escritorio\\Nueva carpeta\\Tienda\\iconos\\1790662_checklist_clipboard_document_form_survey_icon.png"));
		
		try {
			//conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios_login","root","MiSQLDR");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tienda?useTimezOne=true&serverTimezone=UTC","root","MiSQLDR");
			table=this.table;
			table.setModel(dfm);
			dfm.setColumnIdentifiers(new Object[] {"idventa","idcliente","total"});
			Mostrar_grid();
		}catch(Exception e) {
			e.getStackTrace();
			JOptionPane.showMessageDialog(null,"Error al conectar a BD");
		}
		
		
		setTitle("FORMULARIO VENTAS");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 314, 407);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id Venta");
		lblNewLabel.setBounds(22, 71, 70, 13);
		getContentPane().add(lblNewLabel);
		
		JLabel lblIdCliente = new JLabel("cod Cliente");
		lblIdCliente.setBounds(22, 94, 70, 13);
		getContentPane().add(lblIdCliente);
		
		JLabel lblNewLabel_1_1 = new JLabel("Total");
		lblNewLabel_1_1.setBounds(22, 135, 45, 13);
		getContentPane().add(lblNewLabel_1_1);
		
		txt_idVenta = new JTextField();
		txt_idVenta.setBounds(112, 68, 96, 19);
		getContentPane().add(txt_idVenta);
		txt_idVenta.setColumns(10);
		
		txt_idCliente = new JTextField();
		txt_idCliente.setColumns(10);
		txt_idCliente.setBounds(112, 98, 96, 19);
		getContentPane().add(txt_idCliente);
		
		txt_Total = new JTextField();
		txt_Total.setColumns(10);
		txt_Total.setBounds(112, 132, 96, 19);
		getContentPane().add(txt_Total);
		
		JButton btnRegistro = new JButton("Registro");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registrar_venta();
			}
		});
		btnRegistro.setBounds(112, 182, 96, 21);
		getContentPane().add(btnRegistro);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 220, 270, 148);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblIdCliente_1 = new JLabel("Nombre Cliente");
		lblIdCliente_1.setBounds(22, 36, 90, 13);
		getContentPane().add(lblIdCliente_1);
		
		JComboBox cbo_nombre = new JComboBox();
		cbo_nombre.setBounds(110, 32, 98, 21);
		getContentPane().add(cbo_nombre);

	}
}
