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
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmCliente extends JInternalFrame {
	private JTextField txt_Cliente;
	private JTextField txt_Nombre;
	private JTextField txt_Direccion;
	private JTextField txt_Distrito;
	private JButton btn_Agregar;
	private JTable table;
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
			final String consulta = "select * from Cliente";
			ResultSet rs = null;
			Statement sentencia = conexion.createStatement();
			rs = sentencia.executeQuery(consulta);
			
			while(rs.next())
				dfm.addRow(new Object[] {rs.getString("idcliente"),rs.getString("nomcliente"),rs.getString("direccion"),rs.getString("iddistrito")});
		}catch(Exception e){
			e.getStackTrace();
			JOptionPane.showMessageDialog(null,"Error al mostrar desde BD");}
	}
	
	
	private void Agregar_Cliente() {
		try {
			final String consulta = "INSERT INTO REGISTRO (idcliente,nomcliente,direccion,iddistrito) VALUES (?,?,?,?)";
			PreparedStatement sentencia = conexion.prepareStatement(consulta);
			
			sentencia.setString(1,txt_Cliente.getText());
			sentencia.setString(2,txt_Direccion.getText());
			sentencia.setString(3,txt_Distrito.getText());
			sentencia.setString(4,txt_Nombre.getText());
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
					frmCliente frame = new frmCliente();
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
	public frmCliente() {
		setFrameIcon(new ImageIcon("C:\\Users\\jcardero\\OneDrive - NTT DATA EMEAL\\Escritorio\\Nueva carpeta\\Tienda\\iconos\\1790661_checklist_document_form_list_survey_icon.png"));
		
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
		
		
		setTitle("FORMULARIO CLIENTE");
		setClosable(true);
		setIconifiable(true);
		setMaximizable(true);
		setBounds(100, 100, 376, 404);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id Cliente");
		lblNewLabel.setBounds(47, 48, 45, 13);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(47, 76, 51, 13);
		getContentPane().add(lblNombre);
		
		JLabel lblNewLabel_1_1 = new JLabel("Direccion");
		lblNewLabel_1_1.setBounds(47, 104, 45, 13);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Distrito");
		lblNewLabel_1_1_1.setBounds(47, 132, 45, 13);
		getContentPane().add(lblNewLabel_1_1_1);
		
		txt_Cliente = new JTextField();
		txt_Cliente.setBounds(102, 48, 96, 19);
		getContentPane().add(txt_Cliente);
		txt_Cliente.setColumns(10);
		
		txt_Nombre = new JTextField();
		txt_Nombre.setColumns(10);
		txt_Nombre.setBounds(101, 76, 96, 19);
		getContentPane().add(txt_Nombre);
		
		txt_Direccion = new JTextField();
		txt_Direccion.setColumns(10);
		txt_Direccion.setBounds(102, 104, 96, 19);
		getContentPane().add(txt_Direccion);
		
		txt_Distrito = new JTextField();
		txt_Distrito.setColumns(10);
		txt_Distrito.setBounds(101, 132, 96, 19);
		getContentPane().add(txt_Distrito);
		
		btn_Agregar = new JButton("Agregar");
		btn_Agregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Agregar_Cliente();
				
			}
		});
		btn_Agregar.setBounds(102, 178, 85, 21);
		getContentPane().add(btn_Agregar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 218, 344, 147);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}
}
