/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Conexao {
    public Statement stm;
        public ResultSet rs;
        private String driver = "com.mysql.jdbc.Driver";
        private String caminho = "jdbc:mysql://localhost:3306/posto";
        private String usuario = "root";
        private String senha = "";
        public Connection con;
    
     public void conectar(){
            try {
                System.setProperty("com.mysql.jdbc.Driver", driver);
                con=DriverManager.getConnection(caminho, usuario, senha);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro de execução BD");
            }
            
        }
        
        public void executaSql(String sql){
            try {
                stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
                rs = stm.executeQuery(sql);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro de execução");
            }
        }
    
    
    
    
    public static Connection Configurar() {
		Connection connection = null;
		try {
    		Class.forName("com.mysql.jdbc.Driver");
    	} catch (ClassNotFoundException e) {
    		System.out.println("Where is your MySQL JDBC Driver?");
    		e.printStackTrace();
    	}

    	System.out.println("MySQL JDBC Driver Registered!");

    	try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/posto","root", "");

    	} catch (SQLException e) {
    		System.out.println("Connection Failed! Check output console");
    		e.printStackTrace();
    	}

    	if (connection != null) {
    		System.out.println("You made it, take control your database now!");
    	} else {
    		System.out.println("Failed to make connection!");
    	}
    	
    	return connection;
	}
    
}
