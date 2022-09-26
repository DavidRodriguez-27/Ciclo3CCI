import java.awt.EventQueue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class frm1 {

	private JFrame frame;
	private JTextField txt_codigo;
	private JTextField txt_usuario;
	private JTextField txt_contrasena;
	private JTextField txt_nombre;
	private JTextField txt_apellido;
	private JTextField txt_edad;
	private JTextField txt_pais;
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
			final String consulta = "SELECT * FROM REGISTRO";
			ResultSet rs = null;
			Statement sentencia = conexion.createStatement();
			rs = sentencia.executeQuery(consulta);
			
			while(rs.next())
				dfm.addRow(new Object[] {rs.getString("ID"),rs.getString("USUARIO"),rs.getString("CONTRASENA"),rs.getString("NOMBRE"),
						rs.getString("APELLIDO"),rs.getString("EDAD"),rs.getString("PAIS")});
		}catch(Exception e){
			e.getStackTrace();
			JOptionPane.showMessageDialog(null,"Error al mostrar desde BD");}
	}
	
	private void Enviar_datos() {
		try {
			final String consulta = "INSERT INTO REGISTRO (ID,USUARIO,CONTRASENA,NOMBRE,APELLIDO,EDAD,PAIS) VALUES (NULL,?,?,?,?,?,?)";
			PreparedStatement sentencia = conexion.prepareStatement(consulta);
			
			sentencia.setString(1,txt_usuario.getText());
			sentencia.setString(2,txt_contrasena.getText());
			sentencia.setString(3,txt_nombre.getText());
			sentencia.setString(4,txt_apellido.getText());
			sentencia.setString(5,txt_edad.getText());
			sentencia.setString(6,txt_pais.getText());
			sentencia.executeUpdate();
			Mostrar_grid();
		}catch(Exception e){
			e.getStackTrace();
			JOptionPane.showMessageDialog(null,"Error al enviar a BD");}
	}
	
	private void Eliminar_datos() {
		try {
			String codigo = txt_codigo.getText();
			final String consulta="DELETE FROM REGISTRO WHERE ID="+ codigo;
			PreparedStatement sentencia = conexion.prepareStatement(consulta);
			sentencia.execute();
			Mostrar_grid();
		}catch(Exception e){
			e.getStackTrace();
			JOptionPane.showMessageDialog(null,"Error al eliminar a BD");}
	}
	
	private void Actualizar_datos() {
		try {
			//String codigo=txt_codigo.getText();
			final String consulta="UPDATE REGISTRO SET USUARIO=?,CONTRASENA=?,NOMBRE=?,APELLIDO=?,EDAD=?,PAIS=? WHERE ID=?";
			PreparedStatement sentencia = conexion.prepareStatement(consulta);
			sentencia.setString(1,txt_usuario.getText());
			sentencia.setString(2,txt_contrasena.getText());
			sentencia.setString(3,txt_nombre.getText());
			sentencia.setString(4,txt_apellido.getText());
			sentencia.setString(5,txt_edad.getText());
			sentencia.setString(6,txt_pais.getText());
			sentencia.setString(7,txt_codigo.getText());
			sentencia.executeUpdate();
			Mostrar_grid();
		}catch(Exception e){
			e.getStackTrace();
			JOptionPane.showMessageDialog(null,"Error al actualizar en BD");}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm1 window = new frm1();
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
	public frm1() {
		initialize();
		try {
			//conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios_login","root","mysql");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/usuarios_login?useTimezOne=true&serverTimezone=UTC","root","mysql");
			table=this.table;
			table.setModel(dfm);
			dfm.setColumnIdentifiers(new Object[] {"ID","USUARIO","CONTRASEÑA","NOMBRE","APELLIDO","EDAD","PAIS"});
			Mostrar_grid();
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
		frame.setBounds(100, 100, 486, 306);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("C\u00F3digo");
		label.setBounds(17, 14, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Usuario");
		label_1.setBounds(17, 39, 46, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Contrase\u00F1a");
		label_2.setBounds(17, 64, 73, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Nombre");
		label_3.setBounds(17, 89, 57, 14);
		frame.getContentPane().add(label_3);
		
		txt_codigo = new JTextField();
		txt_codigo.setBounds(84, 11, 86, 20);
		txt_codigo.setColumns(10);
		frame.getContentPane().add(txt_codigo);
		
		txt_usuario = new JTextField();
		txt_usuario.setBounds(84, 36, 86, 20);
		txt_usuario.setColumns(10);
		frame.getContentPane().add(txt_usuario);
		
		txt_contrasena = new JTextField();
		txt_contrasena.setBounds(84, 61, 86, 20);
		txt_contrasena.setColumns(10);
		frame.getContentPane().add(txt_contrasena);
		
		txt_nombre = new JTextField();
		txt_nombre.setBounds(84, 89, 86, 20);
		txt_nombre.setColumns(10);
		frame.getContentPane().add(txt_nombre);
		
		JLabel label_4 = new JLabel("Apellido");
		label_4.setBounds(199, 39, 46, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Edad");
		label_5.setBounds(199, 64, 46, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Pais");
		label_6.setBounds(199, 89, 46, 14);
		frame.getContentPane().add(label_6);
		
		txt_apellido = new JTextField();
		txt_apellido.setBounds(244, 39, 86, 20);
		txt_apellido.setColumns(10);
		frame.getContentPane().add(txt_apellido);
		
		txt_edad = new JTextField();
		txt_edad.setBounds(244, 64, 86, 20);
		txt_edad.setColumns(10);
		frame.getContentPane().add(txt_edad);
		
		txt_pais = new JTextField();
		txt_pais.setBounds(244, 89, 86, 20);
		txt_pais.setColumns(10);
		frame.getContentPane().add(txt_pais);
		
		JButton button = new JButton("INSERTAR");
		button.setBounds(354, 36, 107, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Enviar_datos();
			}
		});
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("ACTUALIZAR");
		button_1.setBounds(354, 63, 107, 23);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Actualizar_datos();
			}
		});
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("ELIMINAR");
		button_2.setBounds(354, 88, 107, 23);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eliminar_datos();
			}
		});
		frame.getContentPane().add(button_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 122, 451, 139);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String id;
				String usuario,contrasena,nombre,apellido,edad,pais;
				int fila = table.getSelectedRow();
				
				id = table.getValueAt(fila, 0).toString();
				//JOptionPane.showMessageDialog(null,"El codigo es: "+ id);
				usuario = table.getValueAt(fila,1).toString();
				
				contrasena = table.getValueAt(fila,2).toString();
				nombre = table.getValueAt(fila,3).toString();
				apellido = table.getValueAt(fila,4).toString();
				
				edad = table.getValueAt(fila,5).toString();
				pais = table.getValueAt(fila,6).toString();
				
				txt_codigo.setText(String.valueOf(id));
				txt_usuario.setText(usuario);
				txt_contrasena.setText(contrasena);
				txt_nombre.setText(nombre);
				txt_apellido.setText(apellido);
				txt_edad.setText(edad);
				txt_pais.setText(pais);
			}
		});
		scrollPane.setViewportView(table);
	}

}

