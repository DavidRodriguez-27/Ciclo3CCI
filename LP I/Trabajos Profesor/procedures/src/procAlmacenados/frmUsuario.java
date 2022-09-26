package procAlmacenados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.sql.Date;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

public class frmUsuario {

	private JFrame frame;
	private JTextField txt_codigo;
	private JTextField txt_nombre;
	private JTextField txt_apellido;
	private JTextField txt_fregistro;
	private JTable table1;
	DefaultTableModel dfm = new DefaultTableModel();
	private Connection conexion;
	private JComboBox cboNombre;
	private JTextField txtCod;
	private JTextField txtcod;
	private JTextField txtcurso;
	private JTextField txtn1;
	private JTextField txtn2;
	private JTextField txtn3;
	private JDateChooser dateChooser;
	
	private void llenar_notas() {
		try {
			CallableStatement sentencia= conexion.prepareCall("{call usp_llenar_notas(?,?,?,?,?)}");
			sentencia.setString(1,txtcod.getText());
			sentencia.setString(2,txtcurso.getText());
			sentencia.setString(3,txtn1.getText());
			sentencia.setString(4,txtn2.getText());
			sentencia.setString(5,txtn3.getText());
			sentencia.execute();
			JOptionPane.showMessageDialog(null,"notas llenadassss....");
			//Mostrar_grid();
		}catch(Exception e){
			e.getStackTrace();
			JOptionPane.showMessageDialog(null,"Error al llenar notas");}
	}
	
	private void Mostrar_grid() {
		try {
			int filas=table1.getRowCount();
            for (int i = 0;filas>i; i++) {
                dfm.removeRow(0);
            cboNombre.removeAllItems();
            }
			ResultSet rs = null;
			CallableStatement sentencia = conexion.prepareCall("{call usp_muestra_usuario}");
			rs = sentencia.executeQuery();
			
			while(rs.next()) {
				dfm.addRow(new Object[] {rs.getString("id_usuario"),rs.getString("nombre"),rs.getString("apellido"),rs.getString("fecha_reg")});
				cboNombre.addItem(rs.getString("nombre"));
			}
				
		}catch(Exception e){
			e.getStackTrace();
			JOptionPane.showMessageDialog(null,"Error al mostrar desde BD");}
	}
	
	private void Cod_Usu() {
		try {	
			ResultSet rs = null;
			CallableStatement sentencia= conexion.prepareCall("{call usp_cod_usu(?,?)}");
			sentencia.setString(1,cboNombre.getSelectedItem().toString());
			sentencia.registerOutParameter("cod", Types.VARCHAR);
			sentencia.execute();
			txtCod.setText(sentencia.getString("cod"));
		}catch(Exception e){
			e.printStackTrace();
			//JOptionPane.showMessageDialog(null,"Error al mostrar desde combo");
		}
	}
	
	private void Enviar_datos() {
		try {
			CallableStatement sentencia = conexion.prepareCall("{call usp_insertar(?,?)}");
			
			sentencia.setString(1,txt_nombre.getText());
			sentencia.setString(2,txt_apellido.getText());
			sentencia.execute();
			Mostrar_grid();
		}catch(Exception e){
			e.getStackTrace();
			JOptionPane.showMessageDialog(null,"Error al enviar a BD");}
	}
	
	private void Eliminar_datos() {
		try {
			CallableStatement sentencia = conexion.prepareCall("{call usp_eliminar(?)}");
			sentencia.setString(1,txt_codigo.getText());
			sentencia.execute();
			Mostrar_grid();
		}catch(Exception e){
			e.getStackTrace();
			JOptionPane.showMessageDialog(null,"Error al eliminar a BD");}
	}
	
	private void Actualizar_datos() {
		try {
			CallableStatement sentencia = conexion.prepareCall("{call usp_actualizar(?,?,?,?)}");
			Date date = dateChooser.getDate();
			long d = date.getTime();
			java.sql.Date fecha = new java.sql.Date(d);  
			sentencia.setString(1,txt_codigo.getText());
			sentencia.setString(2,txt_nombre.getText());
			sentencia.setString(3,txt_apellido.getText());
			sentencia.setDate(4,fecha);
			//sentencia.setString(4,txt_fregistro.getText());

			sentencia.execute();
			Mostrar_grid();
		}catch(Exception e){
			e.getStackTrace();
			JOptionPane.showMessageDialog(null,"Error al actualizar en BD" + e.getMessage());}
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmUsuario window = new frmUsuario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmUsuario() {
		initialize();
		
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			//conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/procedimientos","root","mysql");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/procedimientos?useTimezOne=true&serverTimezone=UTC","root","mysql");
			table1=this.table1;
			table1.setModel(dfm);
			
			cboNombre = new JComboBox();
			cboNombre.setBounds(180, 99, 110, 20);
			cboNombre.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					
				}
				@Override
				public void mousePressed(MouseEvent e) {
					
					
				}
				@Override
				public void mouseReleased(MouseEvent e) {
					
				}
			});
			cboNombre.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {Cod_Usu();}
					catch(Exception e){}
				}
			});
			frame.getContentPane().add(cboNombre);
			
			txtCod = new JTextField();
			txtCod.setBounds(300, 99, 86, 20);
			frame.getContentPane().add(txtCod);
			txtCod.setColumns(10);
			
			txtcod = new JTextField();
			txtcod.setBounds(454, 8, 86, 20);
			frame.getContentPane().add(txtcod);
			txtcod.setColumns(10);
			
			txtcurso = new JTextField();
			txtcurso.setBounds(454, 39, 86, 20);
			frame.getContentPane().add(txtcurso);
			txtcurso.setColumns(10);
			
			txtn1 = new JTextField();
			txtn1.setBounds(454, 68, 86, 20);
			frame.getContentPane().add(txtn1);
			txtn1.setColumns(10);
			
			txtn2 = new JTextField();
			txtn2.setBounds(454, 99, 86, 20);
			frame.getContentPane().add(txtn2);
			txtn2.setColumns(10);
			
			txtn3 = new JTextField();
			txtn3.setBounds(454, 130, 86, 20);
			frame.getContentPane().add(txtn3);
			txtn3.setColumns(10);
			
			JButton btnLlenarNotas = new JButton("LLENAR NOTAS");
			btnLlenarNotas.setBounds(454, 161, 109, 23);
			btnLlenarNotas.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					llenar_notas();
				}
			});
			frame.getContentPane().add(btnLlenarNotas);
			
			dateChooser = new JDateChooser();
			dateChooser.setBounds(299, 8, 97, 20);
			frame.getContentPane().add(dateChooser);
			dfm.setColumnIdentifiers(new Object[] {"CÓDIGO","NOMBRE","APELLIDO","F_REGISTRO"});
			Mostrar_grid();
			java.util.Date fecha = new Date();
			dateChooser.setDate(fecha);
			//java.sql.Date fecha = new Date();
			
		}catch(Exception e) {
			e.getStackTrace();
			JOptionPane.showMessageDialog(null,"Error al conectar a BD");
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 589, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txt_codigo = new JTextField();
		txt_codigo.setBounds(84, 8, 86, 20);
		frame.getContentPane().add(txt_codigo);
		txt_codigo.setColumns(10);
		
		txt_nombre = new JTextField();
		txt_nombre.setBounds(84, 39, 86, 20);
		frame.getContentPane().add(txt_nombre);
		txt_nombre.setColumns(10);
		
		txt_apellido = new JTextField();
		txt_apellido.setBounds(84, 68, 86, 20);
		frame.getContentPane().add(txt_apellido);
		txt_apellido.setColumns(10);
		
		txt_fregistro = new JTextField();
		txt_fregistro.setBounds(84, 99, 86, 20);
		frame.getContentPane().add(txt_fregistro);
		txt_fregistro.setColumns(10);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(10, 14, 46, 14);
		frame.getContentPane().add(lblCdigo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 45, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 74, 46, 14);
		frame.getContentPane().add(lblApellido);
		
		JLabel lblFechaRegistro = new JLabel("Fecha regist");
		lblFechaRegistro.setBounds(10, 105, 86, 14);
		frame.getContentPane().add(lblFechaRegistro);
		
		JButton btnInsertar = new JButton("INSERTAR");
		btnInsertar.setBounds(180, 8, 110, 23);
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Enviar_datos();
			}
		});
		frame.getContentPane().add(btnInsertar);
		
		JButton btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.setBounds(180, 37, 110, 23);
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Actualizar_datos();
			}
		});
		frame.getContentPane().add(btnActualizar);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(180, 68, 110, 23);
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Eliminar_datos();
			}
		});
		frame.getContentPane().add(btnEliminar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 135, 414, 115);
		frame.getContentPane().add(scrollPane);
		
		table1 = new JTable();
		table1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String id,nombre,apellido,fregistro;
				int fila = table1.getSelectedRow();
				
				id = table1.getValueAt(fila, 0).toString();
				//JOptionPane.showMessageDialog(null,"El id es: "+ id);
				nombre = table1.getValueAt(fila,1).toString();
				apellido = table1.getValueAt(fila,2).toString();
				fregistro=table1.getValueAt(fila,3).toString();
				
				txt_codigo.setText(String.valueOf(id));
				txt_nombre.setText(nombre);
				txt_apellido.setText(apellido);
				txt_fregistro.setText(fregistro);
				
				/*
				 * SimpleDateFormat sdformato = new SimpleDateFormat("dd/MM/yyyy"); String fecha
				 * = (String) table1.getValueAt(fila, 3).toString(); try {
				 * dateChooser.setDate(sdformato.parse(fecha)); } catch (ParseException e) {
				 * e.printStackTrace(); }
				 */
			}
		});
		scrollPane.setViewportView(table1);
	}
}
